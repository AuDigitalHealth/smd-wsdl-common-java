
package au.net.electronichealth.ns.smd.types.sealedmessage.V2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherTransportMetadataEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTransportMetadataEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataType" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="metadataValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTransportMetadataEntryType", propOrder = {
    "metadataType",
    "metadataValue"
})
public class OtherTransportMetadataEntryType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String metadataType;
    @XmlElement(required = true)
    protected Object metadataValue;

    /**
     * Gets the value of the metadataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataType() {
        return metadataType;
    }

    /**
     * Sets the value of the metadataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataType(String value) {
        this.metadataType = value;
    }

    /**
     * Gets the value of the metadataValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMetadataValue() {
        return metadataValue;
    }

    /**
     * Sets the value of the metadataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMetadataValue(Object value) {
        this.metadataValue = value;
    }

}
