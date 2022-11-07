package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetRequest2Test {
	
	@Test
	public void getRequest2Test() {
		
//		baseURI="http://localhost:8080";
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("/sportsclubs/name/Club62")
		
		.then()
		.assertThat().statusCode(200).body("message", equalTo("success"))
		.log().all();
		

	}

}
