
package clients.wsimports.as;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clients.wsimports.as package. 
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

    private final static QName _AdminSignIn_QNAME = new QName("http://as.playerservices/", "adminSignIn");
    private final static QName _GetPlayerStatusResponse_QNAME = new QName("http://as.playerservices/", "getPlayerStatusResponse");
    private final static QName _AdminSignOut_QNAME = new QName("http://as.playerservices/", "adminSignOut");
    private final static QName _GetPlayerStatus_QNAME = new QName("http://as.playerservices/", "getPlayerStatus");
    private final static QName _PlayerSignOut_QNAME = new QName("http://as.playerservices/", "playerSignOut");
    private final static QName _SuspendAccountResponse_QNAME = new QName("http://as.playerservices/", "suspendAccountResponse");
    private final static QName _PlayerSignOutResponse_QNAME = new QName("http://as.playerservices/", "playerSignOutResponse");
    private final static QName _TransferAccountResponse_QNAME = new QName("http://as.playerservices/", "transferAccountResponse");
    private final static QName _AdminSignInResponse_QNAME = new QName("http://as.playerservices/", "adminSignInResponse");
    private final static QName _TransferAccount_QNAME = new QName("http://as.playerservices/", "transferAccount");
    private final static QName _CreatePlayerAccountResponse_QNAME = new QName("http://as.playerservices/", "createPlayerAccountResponse");
    private final static QName _CreatePlayerAccount_QNAME = new QName("http://as.playerservices/", "createPlayerAccount");
    private final static QName _PlayerSignIn_QNAME = new QName("http://as.playerservices/", "playerSignIn");
    private final static QName _PlayerSignInResponse_QNAME = new QName("http://as.playerservices/", "playerSignInResponse");
    private final static QName _AdminSignOutResponse_QNAME = new QName("http://as.playerservices/", "adminSignOutResponse");
    private final static QName _SuspendAccount_QNAME = new QName("http://as.playerservices/", "suspendAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clients.wsimports.as
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SuspendAccountResponse }
     * 
     */
    public SuspendAccountResponse createSuspendAccountResponse() {
        return new SuspendAccountResponse();
    }

    /**
     * Create an instance of {@link PlayerSignOut }
     * 
     */
    public PlayerSignOut createPlayerSignOut() {
        return new PlayerSignOut();
    }

    /**
     * Create an instance of {@link GetPlayerStatus }
     * 
     */
    public GetPlayerStatus createGetPlayerStatus() {
        return new GetPlayerStatus();
    }

    /**
     * Create an instance of {@link AdminSignOut }
     * 
     */
    public AdminSignOut createAdminSignOut() {
        return new AdminSignOut();
    }

    /**
     * Create an instance of {@link AdminSignIn }
     * 
     */
    public AdminSignIn createAdminSignIn() {
        return new AdminSignIn();
    }

    /**
     * Create an instance of {@link GetPlayerStatusResponse }
     * 
     */
    public GetPlayerStatusResponse createGetPlayerStatusResponse() {
        return new GetPlayerStatusResponse();
    }

    /**
     * Create an instance of {@link SuspendAccount }
     * 
     */
    public SuspendAccount createSuspendAccount() {
        return new SuspendAccount();
    }

    /**
     * Create an instance of {@link CreatePlayerAccount }
     * 
     */
    public CreatePlayerAccount createCreatePlayerAccount() {
        return new CreatePlayerAccount();
    }

    /**
     * Create an instance of {@link PlayerSignIn }
     * 
     */
    public PlayerSignIn createPlayerSignIn() {
        return new PlayerSignIn();
    }

    /**
     * Create an instance of {@link PlayerSignInResponse }
     * 
     */
    public PlayerSignInResponse createPlayerSignInResponse() {
        return new PlayerSignInResponse();
    }

    /**
     * Create an instance of {@link AdminSignOutResponse }
     * 
     */
    public AdminSignOutResponse createAdminSignOutResponse() {
        return new AdminSignOutResponse();
    }

    /**
     * Create an instance of {@link CreatePlayerAccountResponse }
     * 
     */
    public CreatePlayerAccountResponse createCreatePlayerAccountResponse() {
        return new CreatePlayerAccountResponse();
    }

    /**
     * Create an instance of {@link TransferAccount }
     * 
     */
    public TransferAccount createTransferAccount() {
        return new TransferAccount();
    }

    /**
     * Create an instance of {@link AdminSignInResponse }
     * 
     */
    public AdminSignInResponse createAdminSignInResponse() {
        return new AdminSignInResponse();
    }

    /**
     * Create an instance of {@link PlayerSignOutResponse }
     * 
     */
    public PlayerSignOutResponse createPlayerSignOutResponse() {
        return new PlayerSignOutResponse();
    }

    /**
     * Create an instance of {@link TransferAccountResponse }
     * 
     */
    public TransferAccountResponse createTransferAccountResponse() {
        return new TransferAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminSignIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "adminSignIn")
    public JAXBElement<AdminSignIn> createAdminSignIn(AdminSignIn value) {
        return new JAXBElement<AdminSignIn>(_AdminSignIn_QNAME, AdminSignIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "getPlayerStatusResponse")
    public JAXBElement<GetPlayerStatusResponse> createGetPlayerStatusResponse(GetPlayerStatusResponse value) {
        return new JAXBElement<GetPlayerStatusResponse>(_GetPlayerStatusResponse_QNAME, GetPlayerStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminSignOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "adminSignOut")
    public JAXBElement<AdminSignOut> createAdminSignOut(AdminSignOut value) {
        return new JAXBElement<AdminSignOut>(_AdminSignOut_QNAME, AdminSignOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "getPlayerStatus")
    public JAXBElement<GetPlayerStatus> createGetPlayerStatus(GetPlayerStatus value) {
        return new JAXBElement<GetPlayerStatus>(_GetPlayerStatus_QNAME, GetPlayerStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerSignOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "playerSignOut")
    public JAXBElement<PlayerSignOut> createPlayerSignOut(PlayerSignOut value) {
        return new JAXBElement<PlayerSignOut>(_PlayerSignOut_QNAME, PlayerSignOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "suspendAccountResponse")
    public JAXBElement<SuspendAccountResponse> createSuspendAccountResponse(SuspendAccountResponse value) {
        return new JAXBElement<SuspendAccountResponse>(_SuspendAccountResponse_QNAME, SuspendAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerSignOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "playerSignOutResponse")
    public JAXBElement<PlayerSignOutResponse> createPlayerSignOutResponse(PlayerSignOutResponse value) {
        return new JAXBElement<PlayerSignOutResponse>(_PlayerSignOutResponse_QNAME, PlayerSignOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "transferAccountResponse")
    public JAXBElement<TransferAccountResponse> createTransferAccountResponse(TransferAccountResponse value) {
        return new JAXBElement<TransferAccountResponse>(_TransferAccountResponse_QNAME, TransferAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminSignInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "adminSignInResponse")
    public JAXBElement<AdminSignInResponse> createAdminSignInResponse(AdminSignInResponse value) {
        return new JAXBElement<AdminSignInResponse>(_AdminSignInResponse_QNAME, AdminSignInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "transferAccount")
    public JAXBElement<TransferAccount> createTransferAccount(TransferAccount value) {
        return new JAXBElement<TransferAccount>(_TransferAccount_QNAME, TransferAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlayerAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "createPlayerAccountResponse")
    public JAXBElement<CreatePlayerAccountResponse> createCreatePlayerAccountResponse(CreatePlayerAccountResponse value) {
        return new JAXBElement<CreatePlayerAccountResponse>(_CreatePlayerAccountResponse_QNAME, CreatePlayerAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlayerAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "createPlayerAccount")
    public JAXBElement<CreatePlayerAccount> createCreatePlayerAccount(CreatePlayerAccount value) {
        return new JAXBElement<CreatePlayerAccount>(_CreatePlayerAccount_QNAME, CreatePlayerAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerSignIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "playerSignIn")
    public JAXBElement<PlayerSignIn> createPlayerSignIn(PlayerSignIn value) {
        return new JAXBElement<PlayerSignIn>(_PlayerSignIn_QNAME, PlayerSignIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerSignInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "playerSignInResponse")
    public JAXBElement<PlayerSignInResponse> createPlayerSignInResponse(PlayerSignInResponse value) {
        return new JAXBElement<PlayerSignInResponse>(_PlayerSignInResponse_QNAME, PlayerSignInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminSignOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "adminSignOutResponse")
    public JAXBElement<AdminSignOutResponse> createAdminSignOutResponse(AdminSignOutResponse value) {
        return new JAXBElement<AdminSignOutResponse>(_AdminSignOutResponse_QNAME, AdminSignOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://as.playerservices/", name = "suspendAccount")
    public JAXBElement<SuspendAccount> createSuspendAccount(SuspendAccount value) {
        return new JAXBElement<SuspendAccount>(_SuspendAccount_QNAME, SuspendAccount.class, null, value);
    }

}
