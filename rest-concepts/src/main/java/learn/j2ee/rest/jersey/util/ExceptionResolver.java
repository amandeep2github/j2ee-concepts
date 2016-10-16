package learn.j2ee.rest.jersey.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionResolver implements ExceptionMapper<Exception>{

	public Response toResponse(Exception ex) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode())
				.entity(ex.getMessage())
				.type(MediaType.APPLICATION_JSON).build();
	}

}
