package it.beije.ws.jaxws.pascal.domus;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface Domus {
	
	@WebMethod
	List<Integer> getAdvIds();

//	@WebMethod
//	List<Advs> getAdvs();

}
