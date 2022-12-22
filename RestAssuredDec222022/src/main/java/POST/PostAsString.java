package POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAsString {

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
		
	//prettyPrintResponse(response);
	String resp=getResponseInStringFormat(response);
	System.out.println(resp);
	
//{"name":"morpheus","job":"leader","id":"447",
	//"createdAt":"2022-12-22T05:58:31.878Z"}

	}

	public static void prettyPrintResponse(Response response) {
		
		response.prettyPrint();
		
	}
	public static String getResponseInStringFormat(Response response) {
		
		
		return (response.asString());
		
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
