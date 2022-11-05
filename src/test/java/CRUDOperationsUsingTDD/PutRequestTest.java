package CRUDOperationsUsingTDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutRequestTest {
	
	@Test
	public void putRequestTest() {
		
		baseURI="http://localhost:8080";
		
		JSONObject object = new JSONObject();
		object.put("id", "7");
		object.put("address", "Vijayanagar1");
		object.put("description", "All sports activities");
		object.put("name", "8848765423");
		object.put("leader", "ABC");
		object.put("ranking","2");
		

		given()
		.body(object)
		.contentType(ContentType.JSON)
		
		.when()
		.put("/sportsclubs")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();

		
	}

}
