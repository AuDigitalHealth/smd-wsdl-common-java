
package au.net.electronichealth.ns.smd.core.types.encryptedpayload.v2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.smd.core.types.encryptedpayload.v2010 package. 
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

    private final static QName _EncryptedPayload_QNAME = new QName("http://ns.electronichealth.net.au/xsp/xsd/EncryptedPayload/2010", "encryptedPayload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.smd.core.types.encryptedpayload.v2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncryptedPayloadType }
     * 
     */
    public EncryptedPayloadType createEncryptedPayloadType() {
        return new EncryptedPayloadType();
    }

    /**
     * Create an instance of {@link KeyListType }
     * 
     */
    public KeyListType createKeyListType() {
        return new KeyListType();
    }

    /**
     * Create an instance of {@link EncryptedPayloadDataType }
     * 
     */
    public EncryptedPayloadDataType createEncryptedPayloadDataType() {
        return new EncryptedPayloadDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedPayloadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/xsp/xsd/EncryptedPayload/2010", name = "encryptedPayload")
    public JAXBElement<EncryptedPayloadType> createEncryptedPayload(EncryptedPayloadType value) {
        return new JAXBElement<EncryptedPayloadType>(_EncryptedPayload_QNAME, EncryptedPayloadType.class, null, value);
    }

}
