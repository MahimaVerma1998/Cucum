package StepDefinition;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class NewTest {
  @Test
  public void f() {
	  RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.abc@reqres.in");
	    requestParams.put("password", "pistol");
	    request.body(requestParams.toJSONString());
	    Response response = request.post("https://reqres.in/api/register");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	    
  }
}
