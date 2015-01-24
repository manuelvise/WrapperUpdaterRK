package introsde.wrapper.endpoint;

import introsde.wrapper.ws.WrapperUpdaterServiceImpl;

import javax.xml.ws.Endpoint;

public class RunkeeperExtAdapterPublisher {
	public static String SERVER_URL = "http://localhost";
	public static String PORT = "6904";
	public static String BASE_URL = "/ws/lifecoach/adapterextrunkeeper";
	
	public static String getEndpointURL() {
		return SERVER_URL+":"+PORT+BASE_URL;
	}
 
	public static void main(String[] args) {
		String endpointUrl = getEndpointURL();
		System.out.println("Starting Runkeeper external adapter Service...");
		System.out.println("--> Published at = "+endpointUrl);
		Endpoint.publish(endpointUrl, new WrapperUpdaterServiceImpl());
    }
}

