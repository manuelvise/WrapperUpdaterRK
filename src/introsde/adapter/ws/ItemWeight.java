
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bmi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fat_percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="free_mass" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mass_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemWeight", propOrder = {
    "bmi",
    "fatPercent",
    "freeMass",
    "massWeight",
    "timestamp",
    "uri",
    "weight"
})
public class ItemWeight {

    protected Double bmi;
    @XmlElement(name = "fat_percent")
    protected Double fatPercent;
    @XmlElement(name = "free_mass")
    protected Double freeMass;
    @XmlElement(name = "mass_weight")
    protected Double massWeight;
    protected String timestamp;
    protected String uri;
    protected Double weight;

    /**
     * Gets the value of the bmi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBmi() {
        return bmi;
    }

    /**
     * Sets the value of the bmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBmi(Double value) {
        this.bmi = value;
    }

    /**
     * Gets the value of the fatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFatPercent() {
        return fatPercent;
    }

    /**
     * Sets the value of the fatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFatPercent(Double value) {
        this.fatPercent = value;
    }

    /**
     * Gets the value of the freeMass property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFreeMass() {
        return freeMass;
    }

    /**
     * Sets the value of the freeMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFreeMass(Double value) {
        this.freeMass = value;
    }

    /**
     * Gets the value of the massWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMassWeight() {
        return massWeight;
    }

    /**
     * Sets the value of the massWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMassWeight(Double value) {
        this.massWeight = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
