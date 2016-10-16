package learn.j2ee.rest.jersey.resources;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Path("jersey-rest")

public class JerseyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String index(){
		return "Hello! this is Jersey Response";
	}
	
	@GET
	@Path("sys-info")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonSerialize()
	public Map<String, String> systemInfo(){
		return System.getenv();
	}
	
	@GET
	@Path("restricted")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonSerialize()
	public void more() throws Exception{
		throw new Exception("not yet implemented");
	}
	
}
