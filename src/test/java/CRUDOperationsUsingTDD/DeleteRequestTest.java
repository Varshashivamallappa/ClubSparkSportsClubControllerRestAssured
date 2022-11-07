package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequestTest {
	
	@Test
	public void deleteRequestTest(){
		
		baseURI="http://localhost:8080";
		
		given()
		.contentType("application/json")
		
		.when()
		.delete("/sportsclubs/heritageClub56")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}

}
