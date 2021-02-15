
package au.net.electronichealth.ns.smd.core.types.encryptedpayload.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptedPayloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{http://ns.electronichealth.net.au/xsp/xsd/EncryptedPayload/2010}KeyListType"/>
 *         &lt;element name="encryptedPayloadData" type="{http://ns.electronichealth.net.au/xsp/xsd/EncryptedPayload/2010}EncryptedPayloadDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedPayloadType", propOrder = {
    "keys",
    "encryptedPayloadData"
})
public class EncryptedPayloadType {

    @XmlElement(required = true)
    protected KeyListType keys;
    @XmlElement(required = true)
    protected EncryptedPayloadDataType encryptedPayloadData;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link KeyListType }
     *     
     */
    public KeyListType getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyListType }
     *     
     */
    public void setKeys(KeyListType value) {
        this.keys = value;
    }

    /**
     * Gets the value of the encryptedPayloadData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedPayloadDataType }
     *     
     */
    public EncryptedPayloadDataType getEncryptedPayloadData() {
        return encryptedPayloadData;
    }

    /**
     * Sets the value of the encryptedPayloadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedPayloadDataType }
     *     
     */
    public void setEncryptedPayloadData(EncryptedPayloadDataType value) {
        this.encryptedPayloadData = value;
    }

}
