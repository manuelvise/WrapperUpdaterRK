package introsde.wrapper.ws;

import introsde.storage.ws.Person;
import introsde.wrapper.model.Activities;
import introsde.wrapper.model.MeasureWeight;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface WrapperUpdaterService {
	
	
	@WebMethod(operationName="getFitnessActivities")
    @WebResult(name="fitnessActivities") 
    public Activities getRunFromFitnessActivitiesRK(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="getMeasureHistoryFromWeightRK")
    @WebResult(name="weight") 
    public List<MeasureWeight> getMeasureHistoryFromWeightRK(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="getUserId")
    @WebResult(name="userId") 
    public Long getUserId(@WebParam(name="accessToken") String accessToken);
	
	@WebMethod(operationName="getUser")
    @WebResult(name="PersonJson") 
    public String getPersonFromUserRK(@WebParam(name="accessToken") String accessToken);
 
   }