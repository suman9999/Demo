package org.com.message.webservices;

import java.util.HashMap;
import java.util.Map;

public class Database {
private static Map<Long,Message> messages=new HashMap();

	

	public static Map<Long, Message> getMessages() {
		return messages;
	}


}
