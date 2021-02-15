
package au.net.electronichealth.ns.smd.els.types.V2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.core.types.qualifiedcertref.V2010.QualifiedCertRefType;


/**
 * <p>Java class for ElsCertRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElsCertRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useQualifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/qcr/xsd/QualifiedCertRef/2010}qualifiedCertRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElsCertRefType", propOrder = {
    "useQualifier",
    "qualifiedCertRef"
})
public class ElsCertRefType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String useQualifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/qcr/xsd/QualifiedCertRef/2010", required = true)
    protected QualifiedCertRefType qualifiedCertRef;

    /**
     * Gets the value of the useQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseQualifier() {
        return useQualifier;
    }

    /**
     * Sets the value of the useQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseQualifier(String value) {
        this.useQualifier = value;
    }

    /**
     * Gets the value of the qualifiedCertRef property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedCertRefType }
     *     
     */
    public QualifiedCertRefType getQualifiedCertRef() {
        return qualifiedCertRef;
    }

    /**
     * Sets the value of the qualifiedCertRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedCertRefType }
     *     
     */
    public void setQualifiedCertRef(QualifiedCertRefType value) {
        this.qualifiedCertRef = value;
    }

}
