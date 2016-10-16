package learn.j2ee.rest.jersey;

import learn.j2ee.rest.jersey.util.ExceptionResolver;
import learn.j2ee.rest.jersey.util.ObjectMapperResolver;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig{

	public Application() {
		packages(this.getClass().getPackage().toString());
		register(JacksonFeature.class);
		register(ObjectMapperResolver.class);
		register(ExceptionResolver.class);
	}

	
	
}
