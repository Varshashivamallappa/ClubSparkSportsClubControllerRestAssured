package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BasicAuthTest {
	
	@Test
	public void basicAuthTest() {
		
		baseURI = "https://github.com";
		
		given().auth().basic("varshashivamallappa@gmail.com", "123VARsha")
		.when().get("/login")
		.then().log().all();
		
	}

}
