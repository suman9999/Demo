package org.com.message.webservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class MessageService {
	private static Map<Long,Message> messages=Database.getMessages();
	public MessageService(){
		messages.put(1L, new Message(1L,"goodmorning","suman"));
		messages.put(2L, new Message(2L,"goodevining","anil"));
		messages.put(3L, new Message(3L,"goodni8","pavan"));
		messages.put(4L, new Message(4L,"hiiiii","pratap"));
		messages.put(5L, new Message(5L,"hello","eswar"));
		messages.put(6L, new Message(6L,"how r u","raja"));
		messages.put(7L, new Message(7L,"wht r u doing","suri"));
	}
	 
	
	
	
	public List<Message> getAllpagenateMessages(int start,int size){
		
		ArrayList<Message> list=new ArrayList(messages.values());
		if(start+size>list.size()) {
			return new ArrayList<Message>();
			
			
		}
		
		
		return list.subList(start, start+size);
		
	}
	
	
	public List<Message> getAllMessage(){
		
	return new ArrayList<Message>(messages.values());
		}
	public Message getMessage(long id){
		
		
		
		Message message= messages.get(id);
		if(message==null) {
			throw new DataNotfoundException("message with id"+id+"notfound");
			
		}
		return message;
		
		
	}
	
	
	
	
	
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		
		
		
		
		return message;
		
		
		
	}
	public Message updateMessage(Message message){
		
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		
		
		return message;
		
	}
	public Message removeMessage(long id){
		return messages.remove(id);
		
		
		
		
	}

}
