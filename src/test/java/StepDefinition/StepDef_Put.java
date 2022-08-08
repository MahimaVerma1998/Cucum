package StepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class StepDef_Put {
	@Given("update user data")
	public void update_user_data() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("name", "morpheus");
	    requestParams.put("job", "zion resident");
	    request.body(requestParams.toJSONString());
	    Response response = request.put("https://reqres.in/api/users/2");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	    
	}
}
