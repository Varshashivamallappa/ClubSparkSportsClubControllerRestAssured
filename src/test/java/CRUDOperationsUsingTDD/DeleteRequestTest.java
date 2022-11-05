package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequestTest {
	
	@Test
	public void deleteRequestTest(){
		
		baseURI="http://localhost:8080";
		
		when()
		.delete("/sportsclubs/Mysuru_Club")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}

}
