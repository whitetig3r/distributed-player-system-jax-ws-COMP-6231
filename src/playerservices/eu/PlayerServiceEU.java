package playerservices.eu;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;  

@WebService
@SOAPBinding(style = Style.RPC)  
public interface PlayerServiceEU {
	@WebMethod
	public String createPlayerAccount(String fName, String lName, String uName, String password, String ipAddress, int age);
	
	@WebMethod
	public String playerSignIn(String uName, String password, String ipAddress);
	
	@WebMethod
	public String playerSignOut(String uName, String ipAddress);
	
	@WebMethod
	public String transferAccount(String uName, String password, String oldIpAddress, String newIpAddress);
	
	@WebMethod
	public String adminSignIn(String uName, String password, String ipAddress);
	
	@WebMethod
	public String adminSignOut(String uName, String ipAddress);
	
	@WebMethod
	public String getPlayerStatus(String uName, String password, String ipAddress);
	
	@WebMethod
	public String suspendAccount(String uName, String password, String ipAddress, String uNameToSuspend);
}
