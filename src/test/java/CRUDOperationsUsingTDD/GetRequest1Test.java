package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

public class GetRequest1Test {
	
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("/sportsclubs")
		
		.then()
		.assertThat()
		.statusCode(200)
		.body("message", equalTo("success"))
//		.body("data[0].leader", equalTo("Varsha"))
		.log().all();

	}

}
