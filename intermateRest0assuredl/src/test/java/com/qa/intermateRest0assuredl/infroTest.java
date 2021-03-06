package com.qa.intermateRest0assuredl;
import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import javax.swing.text.AbstractDocument.Content;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class infroTest 
{
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
  
	   @Given("^a film exists with the Title Guardians of the Galaxy Two$")
	   public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two()  {
		   request = given().contentType(ContentType.JSON);
		   request.get("http://www.omdbapi.com/?apikey=83608b19&t='Title Guardians of the Galaxy Two'");
		  
	   }
	   
	   @When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	   public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       response = when().get("^a user retrieves the film by the title Guardians of the Galaxy Two$");
	   }

	  
	   
	   
  
//   @Before 
//   public void setUp()
//   {
//	    
//	    		
//   }
	   


	@Given("^a film exists with the Title IT$")
	   public void a_film_exists_with_the_Title_IT() {
	       // Write code here that turns the phrase above into concrete actions
		  request = given().contentType(ContentType.JSON);
	      request.get("http://www.omdbapi.com/?apikey=83608b19&t='IT");
	   }

	   @When("^a user retrieves the film by the title IT$")
	   public void a_user_retrieves_the_film_by_the_title_IT()  {
	       // Write code here that turns the phrase above into concrete actions
		 response =   when().get("http://www.omdbapi.com/?apikey=83608b19&t='IT'");
	   }

	   @Given("^a film exists with the Title \"([^\"]*)\"$")
	   public void a_film_exists_with_the_Title(String arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
		      //given.get("http://www.omdbapi.com/?apikey=83608b19&t='IT")
	   }
	   
	   @When("^a user retrieves the film by the title \"([^\"]*)\"$")
	   public void a_user_retrieves_the_film_by_the_title(String arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
		    when().get("http://www.omdbapi.com/?apikey=83608b19t=arg1");
	           
	   }

	   @Then("^the Rated Field is equal to \"([^\"]*)\"$")
	   public void the_Rated_Field_is_equal_to(String arg1)  {
	       request.then();
	   }
	   
	   @Then("^the Rated Field is equal to R$")
	   public void the_Rated_Field_is_equal_to_R() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       request.then().body("Rated", equalTo("R"));
	   }


	   @Then("^the status code reads (\\d+)$")
	   public void the_status_code_reads(int arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       request.then().statusCode(arg1);
	   }
	   

   }
	

