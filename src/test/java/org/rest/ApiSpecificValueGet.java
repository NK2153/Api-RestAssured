package org.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiSpecificValueGet {
	@Test
	private void ti() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification specification = RestAssured.given();

		specification.header("Content-Type", "application/json");
		specification.queryParam("page", "2");

		Response request = specification.request(Method.GET, "/api/users");
		System.out.println(request.getBody().asPrettyString());

		System.out.println(request.jsonPath().get("data[1].first_name"));
		System.out.println(request.jsonPath().get("data[1].email"));
		System.out.println(request.jsonPath().get("data[1].last_name"));
		System.out.println(request.jsonPath().get("data[1].avatar"));

	}

}
