package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAsMap {

	@Test
	public  void main() {
		baseURI = "https://reqres.in/api/users";
		
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+"\r\n"
				+ "}";
		
//In Map , we keep the value in Key and Value format

//java.lang.IllegalStateException: Cannot serialize object because no JSON serializer found in classpath. Please put Jackson (Databind), Gson, Johnzon, or Yasson in the classpath.

//In Order to fix the issue, put the JackSon databin in the project
	Map<String,String> map =new HashMap<String,String>();
	map.put("name", "morpheus");
	map.put("job", "leader");
		
	Response response=	
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post();
	
	System.out.println(response.getStatusCode());
	response.prettyPrint();
		
	

	}

	
}




