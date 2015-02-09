package introsde.wrapper.ws;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import introsde.adapter.ws.AdapterRunkeeper;
import introsde.adapter.ws.AdapterRunkeeperService;
import introsde.adapter.ws.ItemActivity;
import introsde.adapter.ws.ItemWeight;
import introsde.adapter.ws.Profile;
import introsde.adapter.ws.Weights;
import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.Person;
import introsde.wrapper.model.Activities;
import introsde.wrapper.model.MeasureActivity;
import introsde.wrapper.model.MeasureWeight;
import introsde.wrapper.util.HttpGetRequestRK;
import introsde.wrapper.util.RunKConstants;

import javax.jws.WebService;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Service Implementation

@WebService(endpointInterface = "introsde.wrapper.ws.WrapperUpdaterService", serviceName = "WrapperUpdaterService")
public class WrapperUpdaterServiceImpl implements WrapperUpdaterService {

	private AdapterRunkeeper rkAdapter;

	public WrapperUpdaterServiceImpl() {
		AdapterRunkeeperService adapterService = new AdapterRunkeeperService();
		rkAdapter = adapterService.getAdapterRunkeeperImplPort();

	}

	@Override
	public List<MeasureActivity> getRunFromFitnessActivitiesRK(String accessToken) {

		 introsde.adapter.ws.Activities activities = rkAdapter.getFitnessActivities(accessToken);
		 
		 
		 List<MeasureActivity> healthMeasures = new ArrayList<MeasureActivity>();
		 
		 for (ItemActivity item : activities.getItems()) {
				DozerBeanMapper mapper = new DozerBeanMapper();
				List myMappingFiles = new ArrayList<String>();
				myMappingFiles.add("File:./MappingActivities.xml");
				mapper.setMappingFiles(myMappingFiles);
				MeasureActivity healthMeasureHistory = null;
				try{
				healthMeasureHistory = mapper.map(item,
						MeasureActivity.class);
				}catch (Exception e) {
					e.printStackTrace();
				}
				//SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
				healthMeasures.add(healthMeasureHistory);
			}

		return healthMeasures;
	}

	@Override
	public List<MeasureWeight> getMeasureHistoryFromWeightRK(String accessToken) {

		List<MeasureWeight> measuresListWeight = null;
		
		try{
		Weights weights = rkAdapter.getWeight(accessToken);
		measuresListWeight = new ArrayList<MeasureWeight>();

		for (ItemWeight itemWeight : weights.getItems()) {
			DozerBeanMapper mapper = new DozerBeanMapper();
			List myMappingFiles = new ArrayList<String>();
			myMappingFiles.add("File:./MappingWeights.xml");
			mapper.setMappingFiles(myMappingFiles);
			MeasureWeight healthMeasureHistory = mapper.map(itemWeight,
					MeasureWeight.class);
			//SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
			measuresListWeight.add(healthMeasureHistory);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return measuresListWeight;
	}

	@Override
	public Long getUserId(String accessToken) {
		HttpGetRequestRK activitiesRequest = new HttpGetRequestRK(
				RunKConstants.REST_URL, "user", accessToken,
				RunKConstants.MEDIA_USER);
		String responseFromRunkeeper = activitiesRequest.getResponse();

		Integer userId = null;
		JSONObject jsonToken = new JSONObject(responseFromRunkeeper);
		userId = (Integer) jsonToken.get("userID");
		
		Long userIdLong = new Long(userId);
		return userIdLong;
	}

	@Override
	public String getPersonFromUserRK(String accessToken) {
		Profile profile = rkAdapter.getUser(accessToken);
		Person person = null;
		try{
		DozerBeanMapper mapper = new DozerBeanMapper();
		List myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("File:./MappingPerson.xml");
		mapper.setMappingFiles(myMappingFiles);
		person = mapper.map(profile,
				Person.class);
		}catch (Exception e) {
			e.printStackTrace();
		}
		ObjectMapper mapperJson = new ObjectMapper();
		try {
			return mapperJson.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
