package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post1 {

	public static void main(String[] args) {
		baseURI = "https://reqres.in/api/users";
		
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
	Response response=	
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post();
		
	response.prettyPrint();
	System.out.println(response.getStatusCode());
	System.out.println(response.getSessionId());
	System.out.println(response.getStatusLine());
	System.out.println(response.getContentType());
	
//	201
//	null
//	HTTP/1.1 201 Created
//	application/json; charset=utf-8


	}

	
}






/*
{
    "name": "morpheus",
    "job": "leader",
    "id": "283",
    "createdAt": "2022-12-22T05:49:50.769Z"
}
*/
