package StepDefinition;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class StepDef_Get {
	@Given("get url")
	public void i_want_to_get_url() {
				RestAssured.baseURI = "https://reqres.in/api/users?page=2";
				RequestSpecification httprequest = RestAssured.given();
				Response res = httprequest.request(Method.GET);
				System.out.println("Status code:" + res.getStatusCode());
				System.out.println("Response Body:" + res);
	}

@Given("get the url")
public void get_url() {
	RestAssured.baseURI = "https://reqres.in/api/users/2";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
	}


@Given("get this url")
public void get_this_url() {
	RestAssured.baseURI = "https://reqres.in/api/users/23";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
    
    
	}
@Given("get list url")
public void get_list_url() {
	RestAssured.baseURI = "https://reqres.in/api/unknown";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get single resource  url")
public void get_single_resource_url() {
	RestAssured.baseURI = "https://reqres.in/api/unknown/2";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get single resource not found  url")
public void get_single_resource_not_found_url() {
	RestAssured.baseURI = "https://reqres.in/api/unknown/23";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);
}

@Given("get delayed response url")
public void get_delayed_response_url() {
	RestAssured.baseURI = "https://reqres.in/api/users?delay=3";
	RequestSpecification httprequest = RestAssured.given();
	Response res = httprequest.request(Method.GET);
	System.out.println("Status code:" + res.getStatusCode());
	System.out.println("Response Body:" + res);


}
}

