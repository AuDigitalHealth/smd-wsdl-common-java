
package au.net.electronichealth.ns.smd.xsd.transportresponse._2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.smd.types.sealedmessage.V2010.OtherTransportMetadataEntryType;


/**
 * <p>Java class for TransportResponseMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportResponseMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="sourceOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="invocationId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="receiverOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="senderOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
@XmlType(name = "TransportResponseMetadataType", propOrder = {
    "transportResponseTime",
    "responseId",
    "sourceOrganisation",
    "serviceCategory",
    "invocationId",
    "receiverOrganisation",
    "senderOrganisation",
    "otherTransportMetadata"
})
public class TransportResponseMetadataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transportResponseTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String responseId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceOrganisation;
    @XmlSchemaType(name = "anyURI")
    protected String serviceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String invocationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String receiverOrganisation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String senderOrganisation;
    protected List<OtherTransportMetadataEntryType> otherTransportMetadata;

    /**
     * Gets the value of the transportResponseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransportResponseTime() {
        return transportResponseTime;
    }

    /**
     * Sets the value of the transportResponseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransportResponseTime(XMLGregorianCalendar value) {
        this.transportResponseTime = value;
    }

    /**
     * Gets the value of the responseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the sourceOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOrganisation() {
        return sourceOrganisation;
    }

    /**
     * Sets the value of the sourceOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOrganisation(String value) {
        this.sourceOrganisation = value;
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
