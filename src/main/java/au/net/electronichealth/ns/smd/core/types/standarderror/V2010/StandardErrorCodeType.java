
package au.net.electronichealth.ns.smd.core.types.standarderror.V2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="servicePermanentUnavailable"/>
 *     &lt;enumeration value="serviceTemporaryUnavailable"/>
 *     &lt;enumeration value="certificateSkiMissing"/>
 *     &lt;enumeration value="certificateKeyUsage"/>
 *     &lt;enumeration value="invalidCredentials"/>
 *     &lt;enumeration value="notAuthenticated"/>
 *     &lt;enumeration value="notAuthorised"/>
 *     &lt;enumeration value="badParam"/>
 *     &lt;enumeration value="badlyFormedMsg"/>
 *     &lt;enumeration value="badTimestamp"/>
 *     &lt;enumeration value="badSignature"/>
 *     &lt;enumeration value="badEncryption"/>
 *     &lt;enumeration value="badSigEncOrder"/>
 *     &lt;enumeration value="badCertificateTransmitted"/>
 *     &lt;enumeration value="badWsaAction"/>
 *     &lt;enumeration value="badWsaMessageId"/>
 *     &lt;enumeration value="badWsaTo"/>
 *     &lt;enumeration value="badAlgorithmDataEncryption"/>
 *     &lt;enumeration value="badAlgorithmKeyEncryption"/>
 *     &lt;enumeration value="badAlgorithmC14N"/>
 *     &lt;enumeration value="badAlgorithmDigest"/>
 *     &lt;enumeration value="badAlgorithmSignature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StandardErrorCodeType")
@XmlEnum
public enum StandardErrorCodeType {

    @XmlEnumValue("servicePermanentUnavailable")
    SERVICE_PERMANENT_UNAVAILABLE("servicePermanentUnavailable"),
    @XmlEnumValue("serviceTemporaryUnavailable")
    SERVICE_TEMPORARY_UNAVAILABLE("serviceTemporaryUnavailable"),
    @XmlEnumValue("certificateSkiMissing")
    CERTIFICATE_SKI_MISSING("certificateSkiMissing"),
    @XmlEnumValue("certificateKeyUsage")
    CERTIFICATE_KEY_USAGE("certificateKeyUsage"),
    @XmlEnumValue("invalidCredentials")
    INVALID_CREDENTIALS("invalidCredentials"),
    @XmlEnumValue("notAuthenticated")
    NOT_AUTHENTICATED("notAuthenticated"),
    @XmlEnumValue("notAuthorised")
    NOT_AUTHORISED("notAuthorised"),
    @XmlEnumValue("badParam")
    BAD_PARAM("badParam"),
    @XmlEnumValue("badlyFormedMsg")
    BADLY_FORMED_MSG("badlyFormedMsg"),
    @XmlEnumValue("badTimestamp")
    BAD_TIMESTAMP("badTimestamp"),
    @XmlEnumValue("badSignature")
    BAD_SIGNATURE("badSignature"),
    @XmlEnumValue("badEncryption")
    BAD_ENCRYPTION("badEncryption"),
    @XmlEnumValue("badSigEncOrder")
    BAD_SIG_ENC_ORDER("badSigEncOrder"),
    @XmlEnumValue("badCertificateTransmitted")
    BAD_CERTIFICATE_TRANSMITTED("badCertificateTransmitted"),
    @XmlEnumValue("badWsaAction")
    BAD_WSA_ACTION("badWsaAction"),
    @XmlEnumValue("badWsaMessageId")
    BAD_WSA_MESSAGE_ID("badWsaMessageId"),
    @XmlEnumValue("badWsaTo")
    BAD_WSA_TO("badWsaTo"),
    @XmlEnumValue("badAlgorithmDataEncryption")
    BAD_ALGORITHM_DATA_ENCRYPTION("badAlgorithmDataEncryption"),
    @XmlEnumValue("badAlgorithmKeyEncryption")
    BAD_ALGORITHM_KEY_ENCRYPTION("badAlgorithmKeyEncryption"),
    @XmlEnumValue("badAlgorithmC14N")
    BAD_ALGORITHM_C_14_N("badAlgorithmC14N"),
    @XmlEnumValue("badAlgorithmDigest")
    BAD_ALGORITHM_DIGEST("badAlgorithmDigest"),
    @XmlEnumValue("badAlgorithmSignature")
    BAD_ALGORITHM_SIGNATURE("badAlgorithmSignature");
    private final String value;

    StandardErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardErrorCodeType fromValue(String v) {
        for (StandardErrorCodeType c: StandardErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
