package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAsJSONObject {

	public static void main(String[] args) {
		baseURI = "https://reqres.in/api/users";
		
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		JSONObject json=new JSONObject();
		json.put("name", "morpheus1");
		json.put("job", "leader78");
		
	Response response=	
		given()
		.contentType(ContentType.JSON)
		.body(json)
		.when()
		.post();

	
	response.prettyPrint();
	System.out.println(response.getStatusCode());
	//2022-12-22T06:15:42.314Z

	
	}

	
	
}



