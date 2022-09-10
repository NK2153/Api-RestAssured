package org.rest;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

public class BaseRestAssured extends BaseClass {
@Test
public static void restAssured() {
	requestObject("https://reqres.in/");
	addHeader("Content-Type", "application/json");
	addQuaryParameter("delay", "3");
	responseObject("GET", "/api/users");
	printresponseBody();
	
	
	
}
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

