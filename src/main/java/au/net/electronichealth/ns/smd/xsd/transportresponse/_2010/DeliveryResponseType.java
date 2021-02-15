
package au.net.electronichealth.ns.smd.xsd.transportresponse._2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseClass" type="{http://ns.electronichealth.net.au/smd/xsd/TransportResponse/2010}ResponseClassType"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="digestValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryResponseType", propOrder = {
    "responseClass",
    "responseCode",
    "message",
    "digestValue"
})
public class DeliveryResponseType {

    @XmlElement(required = true)
    protected ResponseClassType responseClass;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String responseCode;
    @XmlElement(required = true)
    protected String message;
    protected byte[] digestValue;

    /**
     * Gets the value of the responseClass property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClassType }
     *     
     */
    public ResponseClassType getResponseClass() {
        return responseClass;
    }

    /**
     * Sets the value of the responseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClassType }
     *     
     */
    public void setResponseClass(ResponseClassType value) {
        this.responseClass = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigestValue(byte[] value) {
        this.digestValue = ((byte[]) value);
    }

}
