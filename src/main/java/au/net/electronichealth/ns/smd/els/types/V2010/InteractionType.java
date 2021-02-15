
package au.net.electronichealth.ns.smd.els.types.V2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceInterface" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceEndpoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="certRef" type="{http://ns.electronichealth.net.au/els/xsd/DataTypes/2010}ElsCertRefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionType", propOrder = {
    "target",
    "serviceCategory",
    "serviceInterface",
    "serviceEndpoint",
    "serviceProvider",
    "certRef"
})
public class InteractionType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceInterface;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceEndpoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceProvider;
    protected List<ElsCertRefType> certRef;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInterface() {
        return serviceInterface;
    }

    /**
     * Sets the value of the serviceInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInterface(String value) {
        this.serviceInterface = value;
    }

    /**
     * Gets the value of the serviceEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    /**
     * Sets the value of the serviceEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEndpoint(String value) {
        this.serviceEndpoint = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the certRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElsCertRefType }
     * 
     * 
     */
    public List<ElsCertRefType> getCertRef() {
        if (certRef == null) {
            certRef = new ArrayList<ElsCertRefType>();
        }
        return this.certRef;
    }

}
