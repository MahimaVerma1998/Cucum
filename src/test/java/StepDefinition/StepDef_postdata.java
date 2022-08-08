package StepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class StepDef_postdata {
	@Given("create post  data")
	public void create_post_data() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("name", "Mahima");
	    requestParams.put("job", "Verma");
	    request.body(requestParams.toJSONString());
	    Response response = request.post("https://reqres.in/api/users");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	}

	@Given("register data sucessfully")
	public void register_data_sucessfully() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    requestParams.put("password", "pistol");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post("https://reqres.in/api/register");
	    System.out.println(response.getStatusLine());
	}
	
	@Given("register data unsucessfully")
	public void register_data_unsucessfully() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post("https://reqres.in/api/register");
	    System.out.println(response.getStatusLine());
	}

	@Given("login data sucessfully")
	public void login_data_sucessfully() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    requestParams.put("password", "pistol");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post("https://reqres.in/api/login");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	}

	@Given("login data unsucessfully")
	public void login_data_unsucessfully() {
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post("https://reqres.in/api/login");
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	   
	}

}
