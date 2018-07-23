package com.qa.intermateRest0assuredl;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
public class infroTest 
{
  
	   @Given("^a film exists with the Title Guardians of the Galaxy Two$")
	   public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two()  {
	       given().get("http://www.omdbapi.com/?apikey=83608b19&t='Title Guardians of the Galaxy Two'");
	   }

	   @When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	   public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       throw new PendingException();
	   }

	   @Then("^the status code reads (\\d+)$")
	   public void the_status_code_reads(int arg1) throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       throw new PendingException();
	   }

	   @Given("^a film exists with the Title IT$")
	   public void a_film_exists_with_the_Title_IT() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       throw new PendingException();
	   }

	   @When("^a user retrieves the film by the title IT$")
	   public void a_user_retrieves_the_film_by_the_title_IT() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       throw new PendingException();
	   }

	   @Then("^the Rated Field is equal to R$")
	   public void the_Rated_Field_is_equal_to_R() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       throw new PendingException();
	   }
   }
	

