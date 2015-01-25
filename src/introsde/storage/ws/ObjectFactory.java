
package introsde.storage.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.storage.ws package. 
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

    private final static QName _DeletePerson_QNAME = new QName("http://ws.storage.introsde/", "deletePerson");
    private final static QName _ReadPersonMeasurementResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasurementResponse");
    private final static QName _ReadPersonLocalHistory_QNAME = new QName("http://ws.storage.introsde/", "readPersonLocalHistory");
    private final static QName _SaveMeasureDefinition_QNAME = new QName("http://ws.storage.introsde/", "saveMeasureDefinition");
    private final static QName _ReadRemotePersonId_QNAME = new QName("http://ws.storage.introsde/", "readRemotePersonId");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasure");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonResponse");
    private final static QName _UpdatePersonHealthProfileResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonHealthProfileResponse");
    private final static QName _SaveMeasureDefinitionResponse_QNAME = new QName("http://ws.storage.introsde/", "saveMeasureDefinitionResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.storage.introsde/", "updatePerson");
    private final static QName _MeasureDefinition_QNAME = new QName("http://ws.storage.introsde/", "measureDefinition");
    private final static QName _SavePersonMeasurementResponse_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasurementResponse");
    private final static QName _GetPersonListResponse_QNAME = new QName("http://ws.storage.introsde/", "getPersonListResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "deletePersonResponse");
    private final static QName _GetCompleteMeasureTypeFromName_QNAME = new QName("http://ws.storage.introsde/", "getCompleteMeasureTypeFromName");
    private final static QName _ReadPersonMeasureByDatesResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasureByDatesResponse");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypesResponse");
    private final static QName _ReadRemotePerson_QNAME = new QName("http://ws.storage.introsde/", "readRemotePerson");
    private final static QName _ReadPersonListByMeasurementRangeResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonListByMeasurementRangeResponse");
    private final static QName _Person_QNAME = new QName("http://ws.storage.introsde/", "person");
    private final static QName _HealthMeasureHistory_QNAME = new QName("http://ws.storage.introsde/", "healthMeasureHistory");
    private final static QName _GetCompleteMeasureTypeFromNameResponse_QNAME = new QName("http://ws.storage.introsde/", "getCompleteMeasureTypeFromNameResponse");
    private final static QName _ReadRemotePersonIdResponse_QNAME = new QName("http://ws.storage.introsde/", "readRemotePersonIdResponse");
    private final static QName _SavePersonMeasurement_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasurement");
    private final static QName _Measure_QNAME = new QName("http://ws.storage.introsde/", "Measure");
    private final static QName _MeasureDefaultRange_QNAME = new QName("http://ws.storage.introsde/", "measureDefaultRange");
    private final static QName _ReadPersonMeasureByDates_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasureByDates");
    private final static QName _ReadPersonRemoteWeightHistory_QNAME = new QName("http://ws.storage.introsde/", "readPersonRemoteWeightHistory");
    private final static QName _GetPersonList_QNAME = new QName("http://ws.storage.introsde/", "getPersonList");
    private final static QName _ReadRemotePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "readRemotePersonResponse");
    private final static QName _ReadPersonListByMeasurementRange_QNAME = new QName("http://ws.storage.introsde/", "readPersonListByMeasurementRange");
    private final static QName _ReadPersonLocalHistoryResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonLocalHistoryResponse");
    private final static QName _UpdatePersonHealthProfile_QNAME = new QName("http://ws.storage.introsde/", "updatePersonHealthProfile");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.storage.introsde/", "readPerson");
    private final static QName _ReadPersonMeasurement_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasurement");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonResponse");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadPersonRemoteWeightHistoryResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonRemoteWeightHistoryResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.storage.introsde/", "createPerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "createPersonResponse");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.storage.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadPersonListByMeasurementRangeResponse }
     * 
     */
    public ReadPersonListByMeasurementRangeResponse createReadPersonListByMeasurementRangeResponse() {
        return new ReadPersonListByMeasurementRangeResponse();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link GetCompleteMeasureTypeFromNameResponse }
     * 
     */
    public GetCompleteMeasureTypeFromNameResponse createGetCompleteMeasureTypeFromNameResponse() {
        return new GetCompleteMeasureTypeFromNameResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasurement }
     * 
     */
    public SavePersonMeasurement createSavePersonMeasurement() {
        return new SavePersonMeasurement();
    }

    /**
     * Create an instance of {@link ReadRemotePersonIdResponse }
     * 
     */
    public ReadRemotePersonIdResponse createReadRemotePersonIdResponse() {
        return new ReadRemotePersonIdResponse();
    }

    /**
     * Create an instance of {@link MeasureDefaultRange }
     * 
     */
    public MeasureDefaultRange createMeasureDefaultRange() {
        return new MeasureDefaultRange();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link ReadPersonRemoteWeightHistory }
     * 
     */
    public ReadPersonRemoteWeightHistory createReadPersonRemoteWeightHistory() {
        return new ReadPersonRemoteWeightHistory();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureByDates }
     * 
     */
    public ReadPersonMeasureByDates createReadPersonMeasureByDates() {
        return new ReadPersonMeasureByDates();
    }

    /**
     * Create an instance of {@link ReadRemotePersonResponse }
     * 
     */
    public ReadRemotePersonResponse createReadRemotePersonResponse() {
        return new ReadRemotePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonList }
     * 
     */
    public GetPersonList createGetPersonList() {
        return new GetPersonList();
    }

    /**
     * Create an instance of {@link ReadPersonListByMeasurementRange }
     * 
     */
    public ReadPersonListByMeasurementRange createReadPersonListByMeasurementRange() {
        return new ReadPersonListByMeasurementRange();
    }

    /**
     * Create an instance of {@link ReadPersonLocalHistoryResponse }
     * 
     */
    public ReadPersonLocalHistoryResponse createReadPersonLocalHistoryResponse() {
        return new ReadPersonLocalHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfile }
     * 
     */
    public UpdatePersonHealthProfile createUpdatePersonHealthProfile() {
        return new UpdatePersonHealthProfile();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasurement }
     * 
     */
    public ReadPersonMeasurement createReadPersonMeasurement() {
        return new ReadPersonMeasurement();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonRemoteWeightHistoryResponse }
     * 
     */
    public ReadPersonRemoteWeightHistoryResponse createReadPersonRemoteWeightHistoryResponse() {
        return new ReadPersonRemoteWeightHistoryResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasurementResponse }
     * 
     */
    public ReadPersonMeasurementResponse createReadPersonMeasurementResponse() {
        return new ReadPersonMeasurementResponse();
    }

    /**
     * Create an instance of {@link SaveMeasureDefinition }
     * 
     */
    public SaveMeasureDefinition createSaveMeasureDefinition() {
        return new SaveMeasureDefinition();
    }

    /**
     * Create an instance of {@link ReadPersonLocalHistory }
     * 
     */
    public ReadPersonLocalHistory createReadPersonLocalHistory() {
        return new ReadPersonLocalHistory();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadRemotePersonId }
     * 
     */
    public ReadRemotePersonId createReadRemotePersonId() {
        return new ReadRemotePersonId();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfileResponse }
     * 
     */
    public UpdatePersonHealthProfileResponse createUpdatePersonHealthProfileResponse() {
        return new UpdatePersonHealthProfileResponse();
    }

    /**
     * Create an instance of {@link SaveMeasureDefinitionResponse }
     * 
     */
    public SaveMeasureDefinitionResponse createSaveMeasureDefinitionResponse() {
        return new SaveMeasureDefinitionResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link SavePersonMeasurementResponse }
     * 
     */
    public SavePersonMeasurementResponse createSavePersonMeasurementResponse() {
        return new SavePersonMeasurementResponse();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link GetPersonListResponse }
     * 
     */
    public GetPersonListResponse createGetPersonListResponse() {
        return new GetPersonListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetCompleteMeasureTypeFromName }
     * 
     */
    public GetCompleteMeasureTypeFromName createGetCompleteMeasureTypeFromName() {
        return new GetCompleteMeasureTypeFromName();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureByDatesResponse }
     * 
     */
    public ReadPersonMeasureByDatesResponse createReadPersonMeasureByDatesResponse() {
        return new ReadPersonMeasureByDatesResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link ReadRemotePerson }
     * 
     */
    public ReadRemotePerson createReadRemotePerson() {
        return new ReadRemotePerson();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Person.Measurements }
     * 
     */
    public Person.Measurements createPersonMeasurements() {
        return new Person.Measurements();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasurementResponse")
    public JAXBElement<ReadPersonMeasurementResponse> createReadPersonMeasurementResponse(ReadPersonMeasurementResponse value) {
        return new JAXBElement<ReadPersonMeasurementResponse>(_ReadPersonMeasurementResponse_QNAME, ReadPersonMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonLocalHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonLocalHistory")
    public JAXBElement<ReadPersonLocalHistory> createReadPersonLocalHistory(ReadPersonLocalHistory value) {
        return new JAXBElement<ReadPersonLocalHistory>(_ReadPersonLocalHistory_QNAME, ReadPersonLocalHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMeasureDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "saveMeasureDefinition")
    public JAXBElement<SaveMeasureDefinition> createSaveMeasureDefinition(SaveMeasureDefinition value) {
        return new JAXBElement<SaveMeasureDefinition>(_SaveMeasureDefinition_QNAME, SaveMeasureDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRemotePersonId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readRemotePersonId")
    public JAXBElement<ReadRemotePersonId> createReadRemotePersonId(ReadRemotePersonId value) {
        return new JAXBElement<ReadRemotePersonId>(_ReadRemotePersonId_QNAME, ReadRemotePersonId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonHealthProfileResponse")
    public JAXBElement<UpdatePersonHealthProfileResponse> createUpdatePersonHealthProfileResponse(UpdatePersonHealthProfileResponse value) {
        return new JAXBElement<UpdatePersonHealthProfileResponse>(_UpdatePersonHealthProfileResponse_QNAME, UpdatePersonHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMeasureDefinitionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "saveMeasureDefinitionResponse")
    public JAXBElement<SaveMeasureDefinitionResponse> createSaveMeasureDefinitionResponse(SaveMeasureDefinitionResponse value) {
        return new JAXBElement<SaveMeasureDefinitionResponse>(_SaveMeasureDefinitionResponse_QNAME, SaveMeasureDefinitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "measureDefinition")
    public JAXBElement<MeasureDefinition> createMeasureDefinition(MeasureDefinition value) {
        return new JAXBElement<MeasureDefinition>(_MeasureDefinition_QNAME, MeasureDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasurementResponse")
    public JAXBElement<SavePersonMeasurementResponse> createSavePersonMeasurementResponse(SavePersonMeasurementResponse value) {
        return new JAXBElement<SavePersonMeasurementResponse>(_SavePersonMeasurementResponse_QNAME, SavePersonMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPersonListResponse")
    public JAXBElement<GetPersonListResponse> createGetPersonListResponse(GetPersonListResponse value) {
        return new JAXBElement<GetPersonListResponse>(_GetPersonListResponse_QNAME, GetPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompleteMeasureTypeFromName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getCompleteMeasureTypeFromName")
    public JAXBElement<GetCompleteMeasureTypeFromName> createGetCompleteMeasureTypeFromName(GetCompleteMeasureTypeFromName value) {
        return new JAXBElement<GetCompleteMeasureTypeFromName>(_GetCompleteMeasureTypeFromName_QNAME, GetCompleteMeasureTypeFromName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureByDatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasureByDatesResponse")
    public JAXBElement<ReadPersonMeasureByDatesResponse> createReadPersonMeasureByDatesResponse(ReadPersonMeasureByDatesResponse value) {
        return new JAXBElement<ReadPersonMeasureByDatesResponse>(_ReadPersonMeasureByDatesResponse_QNAME, ReadPersonMeasureByDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRemotePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readRemotePerson")
    public JAXBElement<ReadRemotePerson> createReadRemotePerson(ReadRemotePerson value) {
        return new JAXBElement<ReadRemotePerson>(_ReadRemotePerson_QNAME, ReadRemotePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListByMeasurementRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonListByMeasurementRangeResponse")
    public JAXBElement<ReadPersonListByMeasurementRangeResponse> createReadPersonListByMeasurementRangeResponse(ReadPersonListByMeasurementRangeResponse value) {
        return new JAXBElement<ReadPersonListByMeasurementRangeResponse>(_ReadPersonListByMeasurementRangeResponse_QNAME, ReadPersonListByMeasurementRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "healthMeasureHistory")
    public JAXBElement<HealthMeasureHistory> createHealthMeasureHistory(HealthMeasureHistory value) {
        return new JAXBElement<HealthMeasureHistory>(_HealthMeasureHistory_QNAME, HealthMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompleteMeasureTypeFromNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getCompleteMeasureTypeFromNameResponse")
    public JAXBElement<GetCompleteMeasureTypeFromNameResponse> createGetCompleteMeasureTypeFromNameResponse(GetCompleteMeasureTypeFromNameResponse value) {
        return new JAXBElement<GetCompleteMeasureTypeFromNameResponse>(_GetCompleteMeasureTypeFromNameResponse_QNAME, GetCompleteMeasureTypeFromNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRemotePersonIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readRemotePersonIdResponse")
    public JAXBElement<ReadRemotePersonIdResponse> createReadRemotePersonIdResponse(ReadRemotePersonIdResponse value) {
        return new JAXBElement<ReadRemotePersonIdResponse>(_ReadRemotePersonIdResponse_QNAME, ReadRemotePersonIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasurement")
    public JAXBElement<SavePersonMeasurement> createSavePersonMeasurement(SavePersonMeasurement value) {
        return new JAXBElement<SavePersonMeasurement>(_SavePersonMeasurement_QNAME, SavePersonMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "Measure")
    public JAXBElement<LifeStatus> createMeasure(LifeStatus value) {
        return new JAXBElement<LifeStatus>(_Measure_QNAME, LifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureDefaultRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "measureDefaultRange")
    public JAXBElement<MeasureDefaultRange> createMeasureDefaultRange(MeasureDefaultRange value) {
        return new JAXBElement<MeasureDefaultRange>(_MeasureDefaultRange_QNAME, MeasureDefaultRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureByDates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasureByDates")
    public JAXBElement<ReadPersonMeasureByDates> createReadPersonMeasureByDates(ReadPersonMeasureByDates value) {
        return new JAXBElement<ReadPersonMeasureByDates>(_ReadPersonMeasureByDates_QNAME, ReadPersonMeasureByDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonRemoteWeightHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonRemoteWeightHistory")
    public JAXBElement<ReadPersonRemoteWeightHistory> createReadPersonRemoteWeightHistory(ReadPersonRemoteWeightHistory value) {
        return new JAXBElement<ReadPersonRemoteWeightHistory>(_ReadPersonRemoteWeightHistory_QNAME, ReadPersonRemoteWeightHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPersonList")
    public JAXBElement<GetPersonList> createGetPersonList(GetPersonList value) {
        return new JAXBElement<GetPersonList>(_GetPersonList_QNAME, GetPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRemotePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readRemotePersonResponse")
    public JAXBElement<ReadRemotePersonResponse> createReadRemotePersonResponse(ReadRemotePersonResponse value) {
        return new JAXBElement<ReadRemotePersonResponse>(_ReadRemotePersonResponse_QNAME, ReadRemotePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListByMeasurementRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonListByMeasurementRange")
    public JAXBElement<ReadPersonListByMeasurementRange> createReadPersonListByMeasurementRange(ReadPersonListByMeasurementRange value) {
        return new JAXBElement<ReadPersonListByMeasurementRange>(_ReadPersonListByMeasurementRange_QNAME, ReadPersonListByMeasurementRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonLocalHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonLocalHistoryResponse")
    public JAXBElement<ReadPersonLocalHistoryResponse> createReadPersonLocalHistoryResponse(ReadPersonLocalHistoryResponse value) {
        return new JAXBElement<ReadPersonLocalHistoryResponse>(_ReadPersonLocalHistoryResponse_QNAME, ReadPersonLocalHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonHealthProfile")
    public JAXBElement<UpdatePersonHealthProfile> createUpdatePersonHealthProfile(UpdatePersonHealthProfile value) {
        return new JAXBElement<UpdatePersonHealthProfile>(_UpdatePersonHealthProfile_QNAME, UpdatePersonHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasurement")
    public JAXBElement<ReadPersonMeasurement> createReadPersonMeasurement(ReadPersonMeasurement value) {
        return new JAXBElement<ReadPersonMeasurement>(_ReadPersonMeasurement_QNAME, ReadPersonMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonRemoteWeightHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonRemoteWeightHistoryResponse")
    public JAXBElement<ReadPersonRemoteWeightHistoryResponse> createReadPersonRemoteWeightHistoryResponse(ReadPersonRemoteWeightHistoryResponse value) {
        return new JAXBElement<ReadPersonRemoteWeightHistoryResponse>(_ReadPersonRemoteWeightHistoryResponse_QNAME, ReadPersonRemoteWeightHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

}
