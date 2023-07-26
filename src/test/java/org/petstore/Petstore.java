package org.petstore;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Petstore {
	public static void main(String[]args){
		RestAssured.baseURI="https://petstore.swagger.io/v2/";
		
		String response =given().log().all().header("Content-Type","application/json").body("{\r\n" + 
				"  \"id\": 12121,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 2,\r\n" + 
				"    \"name\": \"Doggie\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 12,\r\n" + 
				"      \"name\": \"Good\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}").
		
		when().post("/pet").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		int id = js.get("id");
		System.out.println(id);
		
		
		
		given().log().all().header("Content-Type","application/json").pathParam("petid",id).
        when().get("/pet/{petid}").
        then().log().all().assertThat().statusCode(200);
}}