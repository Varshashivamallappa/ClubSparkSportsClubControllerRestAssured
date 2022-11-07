package CRUDOperationsUsingTDD;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestTest {
	
	@Test
	public void postRequestTest() {
		
		baseURI="http://localhost:8080";
		
		JSONObject object = new JSONObject();
		object.put("address", "Vijayanagar");
		object.put("description", "All sports activities");
		object.put("name", "heritageClub56");
		object.put("leader", "Bhuvana");
		object.put("ranking","1");
		

		given()
		.body(object)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/sportsclubs")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.body("data.name", equalTo("heritageClub56"))
		.log().all();
	}

}
