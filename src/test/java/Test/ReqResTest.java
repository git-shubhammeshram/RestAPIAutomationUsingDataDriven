package Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ReqResTest {
	@Test
	public void testReqRes() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.getBody().asString());
	}
}
