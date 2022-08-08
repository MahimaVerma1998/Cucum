package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class StepDef_PostData1 {
	@Given("create post  data1")
	public void create_post_data1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("name", "Mahima");
	    requestParams.put("job", "Verma");
	    request.body(requestParams.toJSONString());
	    Response response = request.post(prob.getProperty("url8"));
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	}

	@Given("register data sucessfully1")
	public void register_data_sucessfully1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    requestParams.put("password", "pistol");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post(prob.getProperty("url9"));
	    System.out.println(response.getStatusLine());
	}
	
	@Given("register data unsucessfully1")
	public void register_data_unsucessfully1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post(prob.getProperty("url10"));
	    System.out.println(response.getStatusLine());
	}

	@Given("login data sucessfully1")
	public void login_data_sucessfully1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    requestParams.put("password", "pistol");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post(prob.getProperty("url11"));
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	}

	@Given("login data unsucessfully1")
	public void login_data_unsucessfully1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("email", "eve.holt@reqres.in");
	    request.header("Content-Type", "application/json");
	    request.body(requestParams.toString());
	    Response response = request.post(prob.getProperty("url12"));
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	   
	}

}
