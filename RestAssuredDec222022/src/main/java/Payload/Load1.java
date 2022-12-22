package Payload;

import org.json.JSONObject;

public class Load1 {
	/*
	 * Below is a simple JSONObject 
	 * { 
	 * "name":"Steve Jobs", 
	 * 
	 * "salary":10000000
	 * 
	 * }
	 */

	public static void main(String[] args) {

		JSONObject json = new JSONObject();
		json.put("name", "Steve");
		json.put("salary", 100000000);
		
		System.out.println(json);
		System.out.println(json.toString());
	}
}
