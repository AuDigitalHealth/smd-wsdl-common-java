
package au.net.electronichealth.ns.smd.types.sealedmessage.V2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SealedMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SealedMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{http://ns.electronichealth.net.au/smd/xsd/SealedMessage/2010}MessageMetadataType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/xsp/xsd/EncryptedPayload/2010}encryptedPayload"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SealedMessageType", propOrder = {
    "metadata",
    "encryptedPayload"
})
public class SealedMessageType {

    @XmlElement(required = true)
    protected MessageMetadataType metadata;
    @XmlAnyElement
    protected Element encryptedPayload;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MessageMetadataType }
     *     
     */
    public MessageMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMetadataType }
     *     
     */
    public void setMetadata(MessageMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the encryptedPayload property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getEncryptedPayload() {
        return encryptedPayload;
    }

    /**
     * Sets the value of the encryptedPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setEncryptedPayload(Element value) {
        this.encryptedPayload = value;
    }

}
