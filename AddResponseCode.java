package org.com.message.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/responsecode")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddResponseCode {
	@PUT
	@Path("/{name}")
	public Response getResponseCode(@PathParam("name") String name) {
		
		
		return Response.status(Status.CREATED).entity(name).build();
		
	}
	
	
	
	

}
