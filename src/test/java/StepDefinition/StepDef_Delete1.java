package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import cucumber.api.java.en.Given;

public class StepDef_Delete1 {
	@Given("delete data1")
	public void delete_data1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
		RequestSpecification request = RestAssured.given();
	    Response response = request.delete(prob.getProperty("url14"));
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	}
}
