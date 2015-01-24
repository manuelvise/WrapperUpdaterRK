package introsde.wrapper.ws;

import introsde.wrapper.model.Activities;
import introsde.wrapper.model.HealthMeasureHistory;
import javax.jws.WebService;

//Service Implementation

@WebService(endpointInterface = "introsde.document.ws.ExtAdapterRunkeeper", serviceName = "AdapterRunkeeperService")
public class WrapperUpdaterServiceImpl implements WrapperUpdaterService {

	
	@Override
	public Activities getRunFromFitnessActivitiesRK(String accessToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthMeasureHistory getMeasureHistoryFromWeightRK(String accessToken) {
		// TODO Auto-generated method stub
		return null;
	}

}
