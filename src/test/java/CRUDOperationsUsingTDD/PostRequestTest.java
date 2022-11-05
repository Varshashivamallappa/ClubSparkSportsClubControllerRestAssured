package CRUDOperationsUsingTDD;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestTest {
	
	@Test
	public void postRequestTest() {
		
		baseURI="http://localhost:8080";
		
		JSONObject object = new JSONObject();
		object.put("address", "Bogadi");
		object.put("description", "All sports activities");
		object.put("name", "8848760023");
		object.put("leader", "Harshitha");
		object.put("ranking","1");
		

		given()
		.body(object)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/sportsclubs")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
