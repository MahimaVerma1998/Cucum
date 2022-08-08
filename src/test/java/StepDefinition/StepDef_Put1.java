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

public class StepDef_Put1 {
	@Given("update user data1")
	public void update_user_data1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("name", "morpheus");
	    requestParams.put("job", "zion resident");
	    request.body(requestParams.toJSONString());
	    Response response = request.put(prob.getProperty("url15"));
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	    
	}
}
