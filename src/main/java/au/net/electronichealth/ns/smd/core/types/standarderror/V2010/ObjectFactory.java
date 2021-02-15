
package au.net.electronichealth.ns.smd.core.types.standarderror.V2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.smd.core.types.standarderror.V2010 package. 
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

    private final static QName _StandardError_QNAME = new QName("http://ns.electronichealth.net.au/wsp/xsd/StandardError/2010", "standardError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.smd.core.types.standarderror.V2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StandardErrorType }
     * 
     */
    public StandardErrorType createStandardErrorType() {
        return new StandardErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/wsp/xsd/StandardError/2010", name = "standardError")
    public JAXBElement<StandardErrorType> createStandardError(StandardErrorType value) {
        return new JAXBElement<StandardErrorType>(_StandardError_QNAME, StandardErrorType.class, null, value);
    }

}
