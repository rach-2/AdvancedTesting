package com.qa.avancedRestAsurred;

import cucumber.api.PendingException;
import org.json.JSONObject;
import org.junit.Test;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
public class stepDefination 
{
	RequestSpecification request;
	Response response;
	@Before
	public void setUp(){
		
	}
	@Given("the server adress")
	public void serrverAdresss()
	{
		request = given().contentType(ContentType.JSON);
	}
	@When("^I post a the a hotel to the server$")
	public void i_post_a_the_a_hotel_to_the_server() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

	@Then("^the hotel exsits$")
	public void the_hotel_exsits() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^hotel id$")
	public void hotel_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I deatleate the hotel$")
	public void i_deatleate_the_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^then the hotel does not exsist$")
	public void then_the_hotel_does_not_esits() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
