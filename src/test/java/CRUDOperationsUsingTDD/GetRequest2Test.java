package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetRequest2Test {
	
	@Test
	public void getRequest2Test() {
		
//		baseURI="http://localhost:8080";
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("/sportsclubs/?name=Belagavi_Club")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		

	}

}
