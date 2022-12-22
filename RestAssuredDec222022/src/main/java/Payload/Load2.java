package Payload;

import org.json.JSONArray;
import org.json.JSONObject;

public class Load2 {
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
		
		JSONArray mobile=new JSONArray();
		mobile.put("Airtel");
		mobile.put("Jio");
		mobile.put("Vodafone");
		
		System.out.println(mobile); //["Airtel","Jio","Vodafone"]
		
		//Above data is inside a parent json object
		JSONObject parent=new JSONObject();
		parent.put("basic", json);
		parent.put("mobile", mobile);
		
		System.out.println(parent);
		
		
	}
}
