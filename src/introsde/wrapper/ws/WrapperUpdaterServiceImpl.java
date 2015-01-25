package introsde.wrapper.ws;

import java.util.ArrayList;
import java.util.List;

import introsde.adapter.ws.AdapterRunkeeper;
import introsde.adapter.ws.AdapterRunkeeperService;
import introsde.adapter.ws.ItemWeight;
import introsde.adapter.ws.Profile;
import introsde.adapter.ws.Weights;
import introsde.storage.ws.Person;
import introsde.wrapper.model.Activities;
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
	public Activities getRunFromFitnessActivitiesRK(String accessToken) {

		rkAdapter.getFitnessActivities(accessToken);

		return null;
	}

	@Override
	public List<MeasureWeight> getMeasureHistoryFromWeightRK(String accessToken) {

		Weights weights = rkAdapter.getWeight(accessToken);
		List<MeasureWeight> measuresListWeight = new ArrayList<MeasureWeight>();

		for (ItemWeight itemWeight : weights.getItems()) {
			DozerBeanMapper mapper = new DozerBeanMapper();
			List myMappingFiles = new ArrayList<String>();
			myMappingFiles.add("File:./MappingWeights.xml");
			mapper.setMappingFiles(myMappingFiles);
			MeasureWeight healthMeasureHistory = mapper.map(itemWeight,
					MeasureWeight.class);
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

	@Override
	public String getPersonFromUserRK(String accessToken) {
		Profile profile = rkAdapter.getUser(accessToken);
		DozerBeanMapper mapper = new DozerBeanMapper();
		List myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("File:./MappingPerson.xml");
		mapper.setMappingFiles(myMappingFiles);
		Person person = mapper.map(profile,
				Person.class);
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
