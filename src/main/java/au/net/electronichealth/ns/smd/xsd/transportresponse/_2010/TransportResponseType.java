
package au.net.electronichealth.ns.smd.xsd.transportresponse._2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{http://ns.electronichealth.net.au/smd/xsd/TransportResponse/2010}TransportResponseMetadataType"/>
 *         &lt;element name="deliveryResponse" type="{http://ns.electronichealth.net.au/smd/xsd/TransportResponse/2010}DeliveryResponseType"/>
 *         &lt;element name="final" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportResponseType", propOrder = {
    "metadata",
    "deliveryResponse",
    "_final"
})
public class TransportResponseType {

    @XmlElement(required = true)
    protected TransportResponseMetadataType metadata;
    @XmlElement(required = true)
    protected DeliveryResponseType deliveryResponse;
    @XmlElement(name = "final")
    protected boolean _final;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link TransportResponseMetadataType }
     *     
     */
    public TransportResponseMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportResponseMetadataType }
     *     
     */
    public void setMetadata(TransportResponseMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the deliveryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponseType }
     *     
     */
    public DeliveryResponseType getDeliveryResponse() {
        return deliveryResponse;
    }

    /**
     * Sets the value of the deliveryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponseType }
     *     
     */
    public void setDeliveryResponse(DeliveryResponseType value) {
        this.deliveryResponse = value;
    }

    /**
     * Gets the value of the final property.
     * 
     */
    public boolean isFinal() {
        return _final;
    }

    /**
     * Sets the value of the final property.
     * 
     */
    public void setFinal(boolean value) {
        this._final = value;
    }

}
