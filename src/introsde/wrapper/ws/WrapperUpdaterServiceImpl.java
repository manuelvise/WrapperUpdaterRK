package introsde.wrapper.ws;

import java.util.ArrayList;
import java.util.List;

import introsde.adapter.ws.AdapterRunkeeper;
import introsde.adapter.ws.AdapterRunkeeperService;
import introsde.adapter.ws.ItemWeight;
import introsde.adapter.ws.Weights;
import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.People;
import introsde.storage.ws.PeopleService;
import introsde.storage.ws.PeopleStorageService;
import introsde.storage.ws.Person;
import introsde.wrapper.model.Activities;
import introsde.wrapper.util.HttpGetRequestRK;
import introsde.wrapper.util.RunKConstants;

import javax.jws.WebService;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.json.JSONObject;

//Service Implementation

@WebService(endpointInterface = "introsde.wrapper.ws.WrapperUpdaterService", serviceName = "WrapperUpdaterService")
public class WrapperUpdaterServiceImpl implements WrapperUpdaterService {
	
	private AdapterRunkeeper rkAdapter;
	private People peopleStorageData;
	
	public WrapperUpdaterServiceImpl() {
		AdapterRunkeeperService adapterService = new AdapterRunkeeperService();
        rkAdapter = adapterService.getAdapterRunkeeperImplPort();
        
        PeopleStorageService peopleService = new PeopleStorageService();
        peopleStorageData = peopleService.getPeopleImplPort();
	}

	
	@Override
	public Activities getRunFromFitnessActivitiesRK(String accessToken) {
		
		rkAdapter.getFitnessActivities(accessToken);
		
		return null;
	}

	@Override
	public List<HealthMeasureHistory> getMeasureHistoryFromWeightRK(String accessToken) {
		
		Weights weights = rkAdapter.getWeight(accessToken);
		List<HealthMeasureHistory> measuresListWeight = new ArrayList<HealthMeasureHistory>();
		
		for (ItemWeight itemWeight : weights.getItems()) {
			DozerBeanMapper mapper = new DozerBeanMapper();
			List myMappingFiles = new ArrayList<String>();
		    myMappingFiles.add("File:./MappingWeights.xml");
			mapper.setMappingFiles(myMappingFiles);
			HealthMeasureHistory healthMeasureHistory =  
			    mapper.map(itemWeight, HealthMeasureHistory.class);
			
			Long userId = getUserId(accessToken);
			
			healthMeasureHistory.setPerson(peopleStorageData.readPerson(userId));
			
			measuresListWeight.add(healthMeasureHistory);
		}
				
		
		return measuresListWeight;
	}

	@Override
	public Long getUserId(String accessToken) {
		HttpGetRequestRK activitiesRequest = new HttpGetRequestRK(
				RunKConstants.REST_URL, "user", accessToken,
				RunKConstants.MEDIA_USER);
		String responseFromRunkeeper = activitiesRequest.getResponse();

		Long userId = null;
		JSONObject jsonToken = new JSONObject(responseFromRunkeeper);
		userId = (Long) jsonToken.get("userID");
		return userId;
	}
}
