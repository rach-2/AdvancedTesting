package com.qa.avancedRestAsurred;

import org.json.JSONObject;
import org.junit.Test;

import cucumber.api.java.Before;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import  org.junit.Assert;
import org.junit.Ignore;
public class restAsuuredAvanced 
{
  
	@Before
	   
   @Test
   public void putAndPostTest()
   {

	  JSONObject requestParams = new JSONObject();
	   
	  // set the base URI we are communicating with
	   String server =  "http://localhost:8090/example/v1/hotels/";
	 //setup our request  
	  RequestSpecification request = given().contentType(ContentType.JSON);
	   //define the type of content we are dealing with - JSON
	 //start building the request parameters
       requestParams.put("city", "Manchesterrrrrrrrrrrrr");
	   requestParams.put("description", "This is a test");
	   requestParams.put("name", "rachel");
	   requestParams.put("rating", 10);
       System.out.println(request.body(requestParams.toString()));
	  // finally send the request we have built up
	   Response response = request.post(server);
       System.out.println(response.getStatusCode());
	   Assert.assertEquals(201,response.getStatusCode());
}
	
    @Test
    public void deleateTest()
    {
             RequestSpecification request = given().contentType(ContentType.JSON);
             Response response   = request.delete("http://localhost:8090/example/v1/hotels/20");
             System.out.println(response.statusCode());
             Assert.assertEquals(204,response.statusCode());
           
    }
    
   

    @Test
    public void getTest() 
    {
    	    RequestSpecification request = given().contentType(ContentType.JSON);
    	    Response resposne = request.get("http://localhost:8090/example/v1/hotels/");
    	    System.out.println(resposne.statusCode());
    	    Assert.assertEquals(200, resposne.statusCode());
   }
	
}

