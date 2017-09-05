package org.com.message.webservices;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotfoundException> {

	public Response toResponse(DataNotfoundException ex) {
		ErrorMessage errormessage = new ErrorMessage(ex.getMessage(),404,"www.google.com");
		return Response.status(Status.NOT_FOUND).entity(errormessage).build();
	}

}
