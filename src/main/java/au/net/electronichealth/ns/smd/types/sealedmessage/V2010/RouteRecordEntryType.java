
package au.net.electronichealth.ns.smd.types.sealedmessage.V2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.els.types.V2010.InteractionType;


/**
 * <p>Java class for RouteRecordEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteRecordEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendIntermediateResponses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interaction" type="{http://ns.electronichealth.net.au/els/xsd/DataTypes/2010}InteractionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteRecordEntryType", propOrder = {
    "sendIntermediateResponses",
    "interaction"
})
public class RouteRecordEntryType {

    protected boolean sendIntermediateResponses;
    @XmlElement(required = true)
    protected InteractionType interaction;

    /**
     * Gets the value of the sendIntermediateResponses property.
     * 
     */
    public boolean isSendIntermediateResponses() {
        return sendIntermediateResponses;
    }

    /**
     * Sets the value of the sendIntermediateResponses property.
     * 
     */
    public void setSendIntermediateResponses(boolean value) {
        this.sendIntermediateResponses = value;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionType }
     *     
     */
    public InteractionType getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionType }
     *     
     */
    public void setInteraction(InteractionType value) {
        this.interaction = value;
    }

}
