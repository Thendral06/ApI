package org.petstore;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class Putmethod {
	public static void main(String[]args){
		System.out.println("out");
//    RestAssured.baseURI="https://petstore.swagger.io/v2";
//		
//		String res=given().log().all().header("Content-Type","application/json").body("{\r\n" + 
//				"  \"id\": 1000,\r\n" + 
//				"  \"category\": {\r\n" + 
//				"    \"id\": 1,\r\n" + 
//				"    \"name\": \"Dog\"\r\n" + 
//				"  },\r\n" + 
//				"  \"name\": \"doggie\",\r\n" + 
//				"  \"photoUrls\": [\r\n" + 
//				"    \"string\"\r\n" + 
//				"  ],\r\n" + 
//				"  \"tags\": [\r\n" + 
//				"    {\r\n" + 
//				"      \"id\": 12,\r\n" + 
//				"      \"name\": \"doggie\"\r\n" + 
//				"    }\r\n" + 
//				"  ],\r\n" + 
//				"  \"status\": \"available\"\r\n" + 
//				"}").
//		when().put("/pet").
//		then().log().all().assertThat().statusCode(200).extract().response().asString();
//		JsonPath js = new JsonPath(res);
//		int id = js.get("id");
//		System.out.println(id);
		
//		given().log().all().header("Content-Type","application/json").pathParam("petId",id).
//        when().get("/pet/{petId}").
//        then().log().all().assertThat().statusCode(200);
//		
//		given().log().all().header("Content-Type","application/json").queryParam("Status","available").
//		when().get("/pet/findByStatus").
//	    then().log().all().assertThat().statusCode(200);

		
		
	}

}
