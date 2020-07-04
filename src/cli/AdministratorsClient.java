package cli;

import java.util.Scanner;

public class AdministratorsClient extends CoreClient {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static clients.wsimports.na.PlayerServiceNAImplementation serviceNA; 
	private static clients.wsimports.eu.PlayerServiceEUImplementation serviceEU;
	private static clients.wsimports.as.PlayerServiceASImplementation serviceAS;

	public static void main(String[] args) {
		setRegionServices();
		
		System.out.println("NOTE -- Admin Logs available at " + System.getProperty("user.dir") + "/admin_logs");
		final String MENU_STRING = "\n-- Admin Client CLI --\n"
				+ "Pick an option ...\n"
				+ "1. Sign in with admin privileges\n"
				+ "2. Sign out admin\n"
				+ "3. Get status of all players playing the game\n"
				+ "4. Suspend a Player account\n"
				+ "5. Exit the CLI\n"
				+ "--------------------------\n";
		try {
			while(true) {
				System.out.println(MENU_STRING);
				switch(sc.nextLine()) {
					case "1": {
						adminSignIn();
						break;
					}
					case "2": {
						adminSignOut();
						break;
					}
					case "3": {
						adminGetPlayerStatus();
						break;
					}
					case "4": {
						adminSuspendAccount();
						break;
					}
					case "5": {
						System.out.println("Goodbye!");
						System.exit(0);
					}
					default: {
						System.out.println("Invalid Option selected!");
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void adminSignIn() {
		String uName;
		String password;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED", "UnresolvedIP", true);
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizeAdminSignIn(uName, password, ipAddress);

	}
	
	private static void adminSignOut() {
		String uName;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED", "UnresolvedIP", true);
		uName = getSafeStringInput("Enter User Name:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizeAdminSignOut(uName, ipAddress);
	}
	
	private static void adminGetPlayerStatus() {
		String uName;
		String password;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED", "UnresolvedIP", true);
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizeAdminGetPlayerStatus(uName, password, ipAddress);

	}
	
	private static void adminSuspendAccount() {
		String uName;
		String uNameToSuspend;
		String password;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED", "UnresolvedIP", true);
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		uNameToSuspend = getSafeStringInput("Enter User Name To Suspend:");
		realizeSuspendAccount(uName, password, ipAddress, uNameToSuspend);

	}

	private static void realizeAdminSignIn(String uName, String password, String ipAddress) {
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address";
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.adminSignIn(uName, password, ipAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.adminSignIn(uName, password, ipAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.adminSignIn(uName, password, ipAddress);
				break;
			}
		}
		
		System.out.println(retStatement);
		adminLog(retStatement, uName, getRegionServer(ipAddress));
	}
	
	private static void realizeAdminSignOut(String uName, String ipAddress) {
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address"; 
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.adminSignOut(uName, ipAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.adminSignOut(uName, ipAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.adminSignOut(uName, ipAddress);
				break;
			}
		}
		
		System.out.println(retStatement);
		adminLog(retStatement, uName, getRegionServer(ipAddress));
	}
	
	private static void realizeAdminGetPlayerStatus(String uName, String password, String ipAddress) {
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address";
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.getPlayerStatus(uName, password, ipAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.getPlayerStatus(uName, password, ipAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.getPlayerStatus(uName, password, ipAddress);
				break;
			}
		}
	
		System.out.println(retStatement);
		adminLog(retStatement, uName, getRegionServer(ipAddress));

	}
	
	private static void realizeSuspendAccount(String uName, String password, String ipAddress, String uNameToSuspend){
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address";
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.suspendAccount(uName, password, ipAddress, uNameToSuspend);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.suspendAccount(uName, password, ipAddress, uNameToSuspend);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.suspendAccount(uName, password, ipAddress, uNameToSuspend);
				break;
			}
		}
		
		System.out.println(retStatement);
		adminLog(retStatement, uName, getRegionServer(ipAddress));
	}
	
	private static void setRegionServices() {
		clients.wsimports.na.PlayerServiceNAImplementationService implNA;
		implNA = new clients.wsimports.na.PlayerServiceNAImplementationService();
		serviceNA = implNA.getPlayerServiceNAImplementationPort();

		clients.wsimports.eu.PlayerServiceEUImplementationService implEU;
		implEU = new clients.wsimports.eu.PlayerServiceEUImplementationService();
		serviceEU = implEU.getPlayerServiceEUImplementationPort();

		clients.wsimports.as.PlayerServiceASImplementationService implAS;
		implAS = new clients.wsimports.as.PlayerServiceASImplementationService();
		serviceAS = implAS.getPlayerServiceASImplementationPort();
	}

	private static void handleServerDown(String uName, String ipAddress, Exception e) {
		String err = "ERROR: Region server is not active";
		System.out.println(err);
		adminLog(err, uName, ipAddress);
	}
	

}
