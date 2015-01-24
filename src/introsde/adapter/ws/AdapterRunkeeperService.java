
package introsde.adapter.ws;

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
@WebServiceClient(name = "AdapterRunkeeperService", targetNamespace = "http://ws.adapter.introsde/", wsdlLocation = "http://localhost:6902/ws/lifecoach/adapterextrunkeeper?wsdl")
public class AdapterRunkeeperService
    extends Service
{

    private final static URL ADAPTERRUNKEEPERSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADAPTERRUNKEEPERSERVICE_EXCEPTION;
    private final static QName ADAPTERRUNKEEPERSERVICE_QNAME = new QName("http://ws.adapter.introsde/", "AdapterRunkeeperService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6902/ws/lifecoach/adapterextrunkeeper?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADAPTERRUNKEEPERSERVICE_WSDL_LOCATION = url;
        ADAPTERRUNKEEPERSERVICE_EXCEPTION = e;
    }

    public AdapterRunkeeperService() {
        super(__getWsdlLocation(), ADAPTERRUNKEEPERSERVICE_QNAME);
    }

    public AdapterRunkeeperService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADAPTERRUNKEEPERSERVICE_QNAME, features);
    }

    public AdapterRunkeeperService(URL wsdlLocation) {
        super(wsdlLocation, ADAPTERRUNKEEPERSERVICE_QNAME);
    }

    public AdapterRunkeeperService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADAPTERRUNKEEPERSERVICE_QNAME, features);
    }

    public AdapterRunkeeperService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdapterRunkeeperService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdapterRunkeeper
     */
    @WebEndpoint(name = "AdapterRunkeeperImplPort")
    public AdapterRunkeeper getAdapterRunkeeperImplPort() {
        return super.getPort(new QName("http://ws.adapter.introsde/", "AdapterRunkeeperImplPort"), AdapterRunkeeper.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdapterRunkeeper
     */
    @WebEndpoint(name = "AdapterRunkeeperImplPort")
    public AdapterRunkeeper getAdapterRunkeeperImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.adapter.introsde/", "AdapterRunkeeperImplPort"), AdapterRunkeeper.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADAPTERRUNKEEPERSERVICE_EXCEPTION!= null) {
            throw ADAPTERRUNKEEPERSERVICE_EXCEPTION;
        }
        return ADAPTERRUNKEEPERSERVICE_WSDL_LOCATION;
    }

}