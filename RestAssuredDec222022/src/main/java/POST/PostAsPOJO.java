package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAsPOJO {

	public static void main(String[] args) {
		baseURI = "https://reqres.in/api/users";
		
		/*
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		JSONObject json=new JSONObject();
		json.put("name", "morpheus1");
		json.put("job", "leader78"); */
		
		User user= new User("Steve22","Leader2383");
		//user.setName("Steve");
		//user.setJob("Leader");
		
	//Convert a java class object to a JSON payload	as String
	//JSON processing exception
		
		ObjectMapper objectMapper=new ObjectMapper();
	try {
		objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectMapper);
	} catch (JsonProcessingException e) {
		
		
			}
	

	Response response=	
		given()
		.contentType(ContentType.JSON)
		.body(objectMapper)
		.log()
		.all()
		.when()
		.post();
	

	
	response.prettyPrint();
	System.out.println(response.getStatusCode());
	//2022-12-22T06:15:42.314Z

	
	}

	
	
}



