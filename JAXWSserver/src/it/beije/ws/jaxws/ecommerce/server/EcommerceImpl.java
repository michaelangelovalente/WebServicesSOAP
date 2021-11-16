package it.beije.ws.jaxws.ecommerce.server;

import javax.jws.WebService;

@WebService(endpointInterface = "it.beije.ws.jaxws.ecommerce.server.Ecommerce")
public class EcommerceImpl implements Ecommerce {

	@Override
	public String[] getProductNames() {
		//...
		
		return new String[] {"Computer", "TV", "Smartphone"};
	}

}
