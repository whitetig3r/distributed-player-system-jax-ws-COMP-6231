package playerservices;
import javax.xml.ws.Endpoint;

import exceptions.UnknownServerRegionException;
import playerservices.as.PlayerServiceASImplementation;
import playerservices.eu.PlayerServiceEUImplementation;
import playerservices.na.PlayerServiceNAImplementation;

public class PlayerServicePublisher {
	public static void main(String[] args) {
			try {
				Endpoint endpointNA = Endpoint.publish(
						"http://localhost:8080/na", 
						new PlayerServiceNAImplementation()
				   );
				System.out.println("Publication status (NA):" + endpointNA.isPublished());
				
				Endpoint endpointEU = Endpoint.publish(
						"http://localhost:8080/eu", 
						new PlayerServiceEUImplementation()
				   );
				System.out.println("Publication status (EU):" + endpointEU.isPublished());
				
				Endpoint endpointAS = Endpoint.publish(
						"http://localhost:8080/as", 
						new PlayerServiceASImplementation()
				   );
				System.out.println("Publication status (AS):" + endpointAS.isPublished());
			} catch (UnknownServerRegionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}
