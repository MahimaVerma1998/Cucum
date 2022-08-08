package StepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class StepDef_Delete {
	@Given("delete data")
	public void delete_data() {
		RequestSpecification request = RestAssured.given();
	    Response response = request.delete("https://reqres.in/api/users/2");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	}
}
