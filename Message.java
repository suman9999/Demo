package org.com.message.webservices;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String authour;
	
	public Message(Long id,String message ,String authour){
		this.id=id;
		this.message=message;
		this.authour=authour;
		this.created=new Date();
		
	}
	public Message(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
}
