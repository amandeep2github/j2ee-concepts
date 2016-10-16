package learn.j2ee.rest.jersey.util;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class ObjectMapperResolver implements ContextResolver<ObjectMapper>{
	private ObjectMapper context;
	
	
	public ObjectMapperResolver() {
		context = new ObjectMapper();
		context.configure(SerializationFeature.INDENT_OUTPUT, true);
	}


	public ObjectMapper getContext(Class<?> arg0) {
		
		return context;
	}

	

}
