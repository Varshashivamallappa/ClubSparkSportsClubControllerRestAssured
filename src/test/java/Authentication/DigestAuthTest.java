package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DigestAuthTest {

	@Test
	public void digestAuthTest() {

		baseURI = "https://github.com";

		given().auth().digest("varshashivamallappa@gmail.com", "123VARsha")

				.when().get("/login").then().log().all();

	}

}
