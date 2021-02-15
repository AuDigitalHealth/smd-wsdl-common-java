
package au.net.electronichealth.ns.smd.core.types.qualifiedcertref.V2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.smd.core.types.qualifiedcertref.V2010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QualifiedCertRef_QNAME = new QName("http://ns.electronichealth.net.au/qcr/xsd/QualifiedCertRef/2010", "qualifiedCertRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.smd.core.types.qualifiedcertref.V2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualifiedCertRefType }
     * 
     */
    public QualifiedCertRefType createQualifiedCertRefType() {
        return new QualifiedCertRefType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedCertRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/qcr/xsd/QualifiedCertRef/2010", name = "qualifiedCertRef")
    public JAXBElement<QualifiedCertRefType> createQualifiedCertRef(QualifiedCertRefType value) {
        return new JAXBElement<QualifiedCertRefType>(_QualifiedCertRef_QNAME, QualifiedCertRefType.class, null, value);
    }

}
