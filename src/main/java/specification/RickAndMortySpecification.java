package specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RickAndMortySpecification {
    public static void createEMspecification(String baseURL){
        RestAssured.requestSpecification= new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setBaseUri(baseURL)
                .setContentType(ContentType.JSON)
           //     .addFilter(new AllureRestAssured())
                .build();
        RestAssured.responseSpecification=new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

    }
}
