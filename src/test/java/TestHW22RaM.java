import config.BaseClass;

import jsonObj.RaM.Location.Result;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.when;

public class TestHW22RaM extends BaseClass {
    @Test
    public void testParsObj(){
        List<Result> list=when()
                .get("location")
                .then().extract().jsonPath().getList("results",Result.class);
        for (Result result : list) {
            System.out.println(result.dimension);
        }

    }

    @Test
    public void testNotParsObj(){
        for (String l : when().get("location").then().extract().jsonPath().getList("results.dimension", String.class)) {
            System.out.println(l);
        }

    }
}
