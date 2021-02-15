
package au.net.electronichealth.ns.smd.types.sealedmessage.V2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="invocationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiverIndividual" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="receiverOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="senderIndividual" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="senderOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceInterface" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="routeRecord" type="{http://ns.electronichealth.net.au/smd/xsd/SealedMessage/2010}RouteRecordEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherTransportMetadata" type="{http://ns.electronichealth.net.au/smd/xsd/SealedMessage/2010}OtherTransportMetadataEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageMetadataType", propOrder = {
    "creationTime",
    "expiryTime",
    "invocationId",
    "receiverIndividual",
    "receiverOrganisation",
    "senderIndividual",
    "senderOrganisation",
    "serviceCategory",
    "serviceInterface",
    "routeRecord",
    "otherTransportMetadata"
})
public class MessageMetadataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryTime;
    @XmlElement(required = true)
    protected String invocationId;
    @XmlSchemaType(name = "anyURI")
    protected String receiverIndividual;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String receiverOrganisation;
    @XmlSchemaType(name = "anyURI")
    protected String senderIndividual;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String senderOrganisation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceInterface;
    protected List<RouteRecordEntryType> routeRecord;
    protected List<OtherTransportMetadataEntryType> otherTransportMetadata;

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryTime(XMLGregorianCalendar value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the invocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationId() {
        return invocationId;
    }

    /**
     * Sets the value of the invocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationId(String value) {
        this.invocationId = value;
    }

    /**
     * Gets the value of the receiverIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverIndividual() {
        return receiverIndividual;
    }

    /**
     * Sets the value of the receiverIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverIndividual(String value) {
        this.receiverIndividual = value;
    }

    /**
     * Gets the value of the receiverOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverOrganisation() {
        return receiverOrganisation;
    }

    /**
     * Sets the value of the receiverOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverOrganisation(String value) {
        this.receiverOrganisation = value;
    }

    /**
     * Gets the value of the senderIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderIndividual() {
        return senderIndividual;
    }

    /**
     * Sets the value of the senderIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderIndividual(String value) {
        this.senderIndividual = value;
    }

    /**
     * Gets the value of the senderOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderOrganisation() {
        return senderOrganisation;
    }

    /**
     * Sets the value of the senderOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderOrganisation(String value) {
        this.senderOrganisation = value;
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
     * Gets the value of the routeRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteRecordEntryType }
     * 
     * 
     */
    public List<RouteRecordEntryType> getRouteRecord() {
        if (routeRecord == null) {
            routeRecord = new ArrayList<RouteRecordEntryType>();
        }
        return this.routeRecord;
    }

    /**
     * Gets the value of the otherTransportMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTransportMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTransportMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTransportMetadataEntryType }
     * 
     * 
     */
    public List<OtherTransportMetadataEntryType> getOtherTransportMetadata() {
        if (otherTransportMetadata == null) {
            otherTransportMetadata = new ArrayList<OtherTransportMetadataEntryType>();
        }
        return this.otherTransportMetadata;
    }

}
