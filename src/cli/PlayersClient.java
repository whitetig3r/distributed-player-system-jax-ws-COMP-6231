package cli;

import java.util.Scanner;

public class PlayersClient extends CoreClient {

	private static Scanner sc = new Scanner(System.in);
	
	private static clients.wsimports.na.PlayerServiceNAImplementation serviceNA; 
	private static clients.wsimports.eu.PlayerServiceEUImplementation serviceEU;
	private static clients.wsimports.as.PlayerServiceASImplementation serviceAS;
	
	
	public static void main(String[] args) {
		setRegionServices();
		
		final String MENU_STRING = "\n-- Player Client CLI --\n"
				+ "Pick an option ...\n"
				+ "1. Create a Player account\n"
				+ "2. Sign a Player in\n"
				+ "3. Sign a Player out\n"
				+ "4. Transfer Player account\n"
				+ "5. Exit the CLI\n"
				+ "--------------------------\n";
		try {
			System.out.println("NOTE -- Player Logs available at " + System.getProperty("user.dir") + "/player_logs/");
			System.out.println("Seeded Accounts -- \"whiteallen7\" , "
					+ "\"billy20\" , \"petula71\" -- "
					+ "Password for all these accounts is \"password\"");
			while(true) {
				System.out.println(MENU_STRING);
				switch(sc.nextLine()) {
					case "1": {
						createPlayerAccount();
						break;
					}
					case "2": {
						playerSignIn();
						break;
					}
					case "3": {
						playerSignOut();
						break;
					}
					case "4": {
						playerTransferAccount();
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
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	private static void createPlayerAccount() {
		String fName;
		String lName;
		String uName;
		String password;
		String ipAddress;
		int age;
		
		setLoggingContext("UNRESOLVED_PLAYER", "UnresolvedIP");
		fName = getSafeStringInput("Enter First Name:");
		lName = getSafeStringInput("Enter Last Name:");
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		age = getSafeIntInput("Enter Age:");
		
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizeCreatePlayerAccount(fName, lName, uName, password, age, ipAddress);
	}
		
	private static void playerSignIn() {
		String uName;
		String password;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED_PLAYER", "UnresolvedIP");
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizePlayerSignIn(uName, password, ipAddress);

	}
	
	private static void playerSignOut() {
		String uName;
		String ipAddress;
		
		setLoggingContext("UNRESOLVED_PLAYER", "UnresolvedIP");
		uName = getSafeStringInput("Enter User Name:");
		System.out.println("Enter IP Address:");
		ipAddress = getIpAddressInput();
		realizePlayerSignOut(uName, ipAddress);

	}
	
	private static void playerTransferAccount() {
		String uName;
		String password;
		String oldIpAddress;
		String newIpAddress = "";
		
		setLoggingContext("UNRESOLVED_PLAYER", "UnresolvedIP");
		uName = getSafeStringInput("Enter User Name:");
		password = getSafeStringInput("Enter Password:");
		System.out.println("Enter old IP Address:");
		oldIpAddress = getIpAddressInput();
		System.out.println("Enter new IP Address:");
		do {
			System.out.println("NOTE: Ensure that the region of the IP Address to Transfer is different from your current region!");
			newIpAddress = getIpAddressInput();
		} while(newIpAddress.startsWith(oldIpAddress.substring(0,3)));
		
		realizePlayerTransferAccount(uName, password, oldIpAddress, newIpAddress);

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
	
	private static void realizePlayerTransferAccount(String uName, String password, String oldIpAddress,
			String newIpAddress) {
		String regionString = getRegionServer(oldIpAddress); 
		String retStatement = "Server not found for this IP address"; 
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.transferAccount(uName, password, oldIpAddress, newIpAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.transferAccount(uName, password, oldIpAddress, newIpAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.transferAccount(uName, password, oldIpAddress, newIpAddress);
				break;
			}
		}
		
		System.out.println(retStatement);
		playerLog(retStatement, uName, oldIpAddress);
		
	}

	private static void realizeCreatePlayerAccount(String fName, String lName, String uName, String password, int age, String ipAddress){
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address"; 
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.createPlayerAccount(fName, lName, uName, password, ipAddress, age);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.createPlayerAccount(fName, lName, uName, password, ipAddress, age);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.createPlayerAccount(fName, lName, uName, password, ipAddress, age);
				break;
			}
		}
		
		System.out.println(retStatement);
		playerLog(retStatement, uName, ipAddress);
	}
	
	private static void realizePlayerSignIn(String uName, String password, String ipAddress) {
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address";
		
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.playerSignIn(uName, password, ipAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.playerSignIn(uName, password, ipAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.playerSignIn(uName, password, ipAddress);
				break;
			}
		}
		
		System.out.println(retStatement);
		playerLog(retStatement, uName, ipAddress);
	}

	private static void realizePlayerSignOut(String uName, String ipAddress) {
		String regionString = getRegionServer(ipAddress);
		String retStatement = "Server not found for this IP address";
			
		switch(regionString) {
			case "GameServerNA": {
				retStatement = serviceNA.playerSignOut(uName, ipAddress);
				break;
			}
			case "GameServerEU": {
				retStatement = serviceEU.playerSignOut(uName, ipAddress);
				break;
			}
			case "GameServerAS": {
				retStatement = serviceAS.playerSignOut(uName, ipAddress);
				break;
			}
		}
		
		System.out.println(retStatement);
		playerLog(retStatement, uName, ipAddress);
	}
	
	private static void handleServerDown(String uName, String ipAddress, Exception e) {
		String err = "ERROR: Region server is not active";
		System.out.println(err);
		playerLog(err, uName, ipAddress);
	}

}