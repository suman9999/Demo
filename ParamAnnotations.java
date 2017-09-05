package org.com.message.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParamAnnotations {
	
	@GET
	@Path("/getparam")
	public String getParamsUsingAnnotations(@MatrixParam("id") int id,@HeaderParam("name") String name) {
		
		
		
		
		return id+"  "+name;
		
		
		
	}
	@GET
	@Path("/context")
	public String getParamsUsingContext(@Context UriInfo uriinfo,@Context HttpHeaders headers) {
		String path=uriinfo.getAbsolutePath().toString();
		String cookies=headers.getCookies().toString();
		
		return "path"+"    "+path+"   "+"cookies"+cookies;
		
		
	}
	
	
	
	

}
