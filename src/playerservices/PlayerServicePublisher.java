package playerservices;
import javax.xml.ws.Endpoint;

import exceptions.UnknownServerRegionException;

public class PlayerServicePublisher {
	public static void main(String[] args) {
			try {
				Endpoint endpointNA = Endpoint.publish(
						"http://localhost:8080/na", 
						new PlayerServiceImplementation("NA")
				   );
				System.out.println("Publication status (NA):" + endpointNA.isPublished());
				
				Endpoint endpointEU = Endpoint.publish(
						"http://localhost:8080/eu", 
						new PlayerServiceImplementation("EU")
				   );
				System.out.println("Publication status (EU):" + endpointEU.isPublished());
				
				Endpoint endpointAS = Endpoint.publish(
						"http://localhost:8080/as", 
						new PlayerServiceImplementation("AS")
				   );
				System.out.println("Publication status (AS):" + endpointAS.isPublished());
			} catch (UnknownServerRegionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}
