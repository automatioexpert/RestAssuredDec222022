package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAsObjectMapper {

	public static void main(String[] args) {
		baseURI = "https://reqres.in/api/users";
		
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
	
		
		JSONObject json=new JSONObject();
		json.put("name", "morpheus1");
		json.put("job", "leader78");
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		
		
	Response response=	
		given()
		.contentType(ContentType.JSON)
		.body(json)
		.when()
		.post();

	
	response.prettyPrint();
	System.out.println(response.getStatusCode());

	
	}

	
	
}



