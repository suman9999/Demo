package org.com.message.webservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/message")
public class MessageResourse {
	MessageService msr = new MessageService();
	
	


	@Path("/mess")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(@QueryParam("start") int start ,@QueryParam("size") int size){
		if(start>=0&&size>=0) {
			return msr.getAllpagenateMessages(start, size);
			
			
		}
		
		return 	msr.getAllMessage();
		
		
	}
	@GET
	@Path("/allmessages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages1(){
		
		return 	msr.getAllMessage();
		
		
	}
		
	
	
	
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		
		
		return msr.addMessage(message);
		
		
		
	}
	@PUT
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	
	public Message updateMessage(@PathParam("messageid") long id,Message message) {
		message.setId(id);
		return msr.updateMessage(message);
		
		
	}
	@DELETE
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public void deleteMesage(@PathParam("messageid") long id) {
		
		msr.removeMessage(id);
		
	}
	@Path("/{messageid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageid") long id) {
		
		
		return msr.getMessage(id);
		
		
	}

}
