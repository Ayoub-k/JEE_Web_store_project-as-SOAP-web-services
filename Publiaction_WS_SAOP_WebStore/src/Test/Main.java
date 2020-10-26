package Test;

import javax.xml.ws.Endpoint;

import com.DAO.CataloguelivreImpl;

public class Main {

	public static void main(String[] args) {

		try {
			Endpoint.publish("http://localhost:11824/CataloguelivreImpl", new CataloguelivreImpl());
			System.out.println("Fait...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
