
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="athlete_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="large_picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medium_picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="normal_picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="small_picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile", propOrder = {
    "athleteType",
    "birthday",
    "elite",
    "gender",
    "largePicture",
    "location",
    "mediumPicture",
    "name",
    "normalPicture",
    "profile",
    "smallPicture"
})
public class Profile {

    @XmlElement(name = "athlete_type")
    protected String athleteType;
    protected String birthday;
    protected Boolean elite;
    protected String gender;
    @XmlElement(name = "large_picture")
    protected String largePicture;
    protected String location;
    @XmlElement(name = "medium_picture")
    protected String mediumPicture;
    protected String name;
    @XmlElement(name = "normal_picture")
    protected String normalPicture;
    protected String profile;
    @XmlElement(name = "small_picture")
    protected String smallPicture;

    /**
     * Gets the value of the athleteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthleteType() {
        return athleteType;
    }

    /**
     * Sets the value of the athleteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthleteType(String value) {
        this.athleteType = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the elite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElite() {
        return elite;
    }

    /**
     * Sets the value of the elite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElite(Boolean value) {
        this.elite = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the largePicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargePicture() {
        return largePicture;
    }

    /**
     * Sets the value of the largePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargePicture(String value) {
        this.largePicture = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the mediumPicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumPicture() {
        return mediumPicture;
    }

    /**
     * Sets the value of the mediumPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumPicture(String value) {
        this.mediumPicture = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the normalPicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalPicture() {
        return normalPicture;
    }

    /**
     * Sets the value of the normalPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalPicture(String value) {
        this.normalPicture = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the smallPicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallPicture() {
        return smallPicture;
    }

    /**
     * Sets the value of the smallPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallPicture(String value) {
        this.smallPicture = value;
    }

}
