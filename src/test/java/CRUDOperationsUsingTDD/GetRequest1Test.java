package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetRequest1Test {
	
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("/sportsclubs")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}

}
