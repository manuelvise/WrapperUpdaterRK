package introsde.wrapper.ws;

import introsde.wrapper.model.Activities;
import introsde.wrapper.model.Weights;
import introsde.wrapper.model.HealthMeasureHistory;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding
public interface WrapperUpdaterService {
	
	
	@WebMethod(operationName="getFitnessActivities")
    @WebResult(name="fitnessActivities") 
    public Activities getRunFromFitnessActivitiesRK(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="getMeasureHistoryFromWeightRK")
    @WebResult(name="weight") 
    public HealthMeasureHistory getMeasureHistoryFromWeightRK(@WebParam(name="accessToken") String accessToken);
	
	
 
   }