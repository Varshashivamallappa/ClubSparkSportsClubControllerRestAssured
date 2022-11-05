package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerTokenTest {
	
	@Test
	public void bearerTokenTest() {
		
		baseURI = "https://api.github.com";
		
		JSONObject object = new JSONObject();
		
		object.put("name", "Rep9");
		
		given()
		.auth().oauth2("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")
		.body(object).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}

}
