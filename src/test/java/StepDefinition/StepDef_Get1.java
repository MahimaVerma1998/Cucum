package StepDefinition;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StepDef_Get1 {
	@Given("get url1")
	public void i_want_to_get_url1() throws IOException {
		Properties prob = new Properties();
		InputStream input = new FileInputStream(
				"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
				prob.load(input);
				RestAssured.baseURI = prob.getProperty("url1");
				RequestSpecification httprequest = RestAssured.given();
				Response res = httprequest.request(Method.GET);
				System.out.println("Status code:" + res.getStatusCode());
				System.out.println("Response Body:" + res);
	}

@Given("get the url1")
public void get_url1() throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url2");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
	}


@Given("get this url1")
public void get_this_url1() throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url3");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
    
    
	}
@Given("get list url1")
public void get_list_url1()throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url4");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get single resource  url1")
public void get_single_resource_url1() throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url5");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get single resource not found  url1")
public void get_single_resource_not_found_url1() throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url6");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get delayed response url1")
public void get_delayed_response_url1() throws IOException {
	Properties prob = new Properties();
	InputStream input = new FileInputStream(
			"C:\\JavaProgram\\workspace\\Cucum\\src\\test\\java\\StepDefinition\\data.properties");
			prob.load(input);
	RestAssured.baseURI = prob.getProperty("url7");
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);


}
}

