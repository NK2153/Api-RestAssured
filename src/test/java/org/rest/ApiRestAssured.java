package org.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiRestAssured {
	
	@Test
	public static void tc1() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification main = RestAssured.given();
		
		main.queryParam("page", "2");
		
		Response request = main.request(Method.GET, "/api/users");
		String prettyString = request.getBody().asPrettyString();
		System.out.println(prettyString);
		
	}
}
