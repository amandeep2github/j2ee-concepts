package learn.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jersey-rest")
public class JerseyRestHome {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String home(){
		return "Welcome! this is Jersey Rest.";
	}
	
	/*@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String home2(){
		return "Welcome! this is Jersey Rest again.";
	}*/
}
