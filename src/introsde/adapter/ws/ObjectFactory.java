
package introsde.adapter.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.adapter.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserIdResponse_QNAME = new QName("http://ws.adapter.introsde/", "getUserIdResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.adapter.introsde/", "getUserResponse");
    private final static QName _GetWeight_QNAME = new QName("http://ws.adapter.introsde/", "getWeight");
    private final static QName _GetFitnessActivities_QNAME = new QName("http://ws.adapter.introsde/", "getFitnessActivities");
    private final static QName _GetWeightResponse_QNAME = new QName("http://ws.adapter.introsde/", "getWeightResponse");
    private final static QName _GetUser_QNAME = new QName("http://ws.adapter.introsde/", "getUser");
    private final static QName _GetFitnessActivitiesResponse_QNAME = new QName("http://ws.adapter.introsde/", "getFitnessActivitiesResponse");
    private final static QName _GetUserId_QNAME = new QName("http://ws.adapter.introsde/", "getUserId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.adapter.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserId }
     * 
     */
    public GetUserId createGetUserId() {
        return new GetUserId();
    }

    /**
     * Create an instance of {@link GetFitnessActivitiesResponse }
     * 
     */
    public GetFitnessActivitiesResponse createGetFitnessActivitiesResponse() {
        return new GetFitnessActivitiesResponse();
    }

    /**
     * Create an instance of {@link GetWeightResponse }
     * 
     */
    public GetWeightResponse createGetWeightResponse() {
        return new GetWeightResponse();
    }

    /**
     * Create an instance of {@link GetWeight }
     * 
     */
    public GetWeight createGetWeight() {
        return new GetWeight();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUserIdResponse }
     * 
     */
    public GetUserIdResponse createGetUserIdResponse() {
        return new GetUserIdResponse();
    }

    /**
     * Create an instance of {@link GetFitnessActivities }
     * 
     */
    public GetFitnessActivities createGetFitnessActivities() {
        return new GetFitnessActivities();
    }

    /**
     * Create an instance of {@link Weights }
     * 
     */
    public Weights createWeights() {
        return new Weights();
    }

    /**
     * Create an instance of {@link ItemActivity }
     * 
     */
    public ItemActivity createItemActivity() {
        return new ItemActivity();
    }

    /**
     * Create an instance of {@link Activities }
     * 
     */
    public Activities createActivities() {
        return new Activities();
    }

    /**
     * Create an instance of {@link ItemWeight }
     * 
     */
    public ItemWeight createItemWeight() {
        return new ItemWeight();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getUserIdResponse")
    public JAXBElement<GetUserIdResponse> createGetUserIdResponse(GetUserIdResponse value) {
        return new JAXBElement<GetUserIdResponse>(_GetUserIdResponse_QNAME, GetUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getWeight")
    public JAXBElement<GetWeight> createGetWeight(GetWeight value) {
        return new JAXBElement<GetWeight>(_GetWeight_QNAME, GetWeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFitnessActivities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getFitnessActivities")
    public JAXBElement<GetFitnessActivities> createGetFitnessActivities(GetFitnessActivities value) {
        return new JAXBElement<GetFitnessActivities>(_GetFitnessActivities_QNAME, GetFitnessActivities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getWeightResponse")
    public JAXBElement<GetWeightResponse> createGetWeightResponse(GetWeightResponse value) {
        return new JAXBElement<GetWeightResponse>(_GetWeightResponse_QNAME, GetWeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFitnessActivitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getFitnessActivitiesResponse")
    public JAXBElement<GetFitnessActivitiesResponse> createGetFitnessActivitiesResponse(GetFitnessActivitiesResponse value) {
        return new JAXBElement<GetFitnessActivitiesResponse>(_GetFitnessActivitiesResponse_QNAME, GetFitnessActivitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getUserId")
    public JAXBElement<GetUserId> createGetUserId(GetUserId value) {
        return new JAXBElement<GetUserId>(_GetUserId_QNAME, GetUserId.class, null, value);
    }

}
