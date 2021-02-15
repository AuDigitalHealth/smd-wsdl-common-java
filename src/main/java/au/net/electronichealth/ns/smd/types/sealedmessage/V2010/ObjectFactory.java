
package au.net.electronichealth.ns.smd.types.sealedmessage.V2010;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.smd.types.sealedmessage.V2010 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.smd.types.sealedmessage.V2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SealedMessageType }
     * 
     */
    public SealedMessageType createSealedMessageType() {
        return new SealedMessageType();
    }

    /**
     * Create an instance of {@link MessageMetadataType }
     * 
     */
    public MessageMetadataType createMessageMetadataType() {
        return new MessageMetadataType();
    }

    /**
     * Create an instance of {@link RouteRecordEntryType }
     * 
     */
    public RouteRecordEntryType createRouteRecordEntryType() {
        return new RouteRecordEntryType();
    }

    /**
     * Create an instance of {@link OtherTransportMetadataEntryType }
     * 
     */
    public OtherTransportMetadataEntryType createOtherTransportMetadataEntryType() {
        return new OtherTransportMetadataEntryType();
    }

}