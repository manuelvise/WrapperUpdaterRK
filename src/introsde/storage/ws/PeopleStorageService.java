
package introsde.storage.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PeopleStorageService", targetNamespace = "http://ws.storage.introsde/", wsdlLocation = "http://localhost:6903/ws/lfcoach?wsdl")
public class PeopleStorageService
    extends Service
{

    private final static URL PEOPLESTORAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException PEOPLESTORAGESERVICE_EXCEPTION;
    private final static QName PEOPLESTORAGESERVICE_QNAME = new QName("http://ws.storage.introsde/", "PeopleStorageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6903/ws/lfcoach?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEOPLESTORAGESERVICE_WSDL_LOCATION = url;
        PEOPLESTORAGESERVICE_EXCEPTION = e;
    }

    public PeopleStorageService() {
        super(__getWsdlLocation(), PEOPLESTORAGESERVICE_QNAME);
    }

    public PeopleStorageService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEOPLESTORAGESERVICE_QNAME, features);
    }

    public PeopleStorageService(URL wsdlLocation) {
        super(wsdlLocation, PEOPLESTORAGESERVICE_QNAME);
    }

    public PeopleStorageService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEOPLESTORAGESERVICE_QNAME, features);
    }

    public PeopleStorageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PeopleStorageService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns People
     */
    @WebEndpoint(name = "PeopleImplPort")
    public People getPeopleImplPort() {
        return super.getPort(new QName("http://ws.storage.introsde/", "PeopleImplPort"), People.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns People
     */
    @WebEndpoint(name = "PeopleImplPort")
    public People getPeopleImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.storage.introsde/", "PeopleImplPort"), People.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEOPLESTORAGESERVICE_EXCEPTION!= null) {
            throw PEOPLESTORAGESERVICE_EXCEPTION;
        }
        return PEOPLESTORAGESERVICE_WSDL_LOCATION;
    }

}