package utils;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class RestUtils {

	public static Response performGet(String endPoint) {
		return RestAssured.given().log().all().
				baseUri(endPoint).when().get().then()
				.log().all().extract().response();
	}
}
