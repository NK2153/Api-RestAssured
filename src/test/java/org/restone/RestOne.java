package org.restone;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class RestOne {
	// serialization
	@Test
	private void t1() {
		RestAssured.baseURI = "https://petstore.swagger.io/";
		RequestSpecification specification = RestAssured.given();

		specification.header("Content-Type", "application/json");

		Two t = new Two(20, "NK");

		ArrayList<String> li = new ArrayList<String>();
		li.add("string");
		li.add("int");

		ArrayList<Three> th = new ArrayList<Three>();
		Three th1 = new Three(22, "Mersal");
		Three th2 = new Three(22, "Mersal");

		th.add(th1);
		th.add(th2);
		One o = new One(0, t, "doggie", li, th, "available");
		specification.body(o);
		
		specification.request(Method.POST,)

	}

}
