package rest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

  @Test
  public void canAddNewTodo() {
    RestAssured.baseURI = System.getProperty("app.url","http://127.0.0.1:9999");
    String expectedTitle = "Yet another todo item";
    given().log().all()
        .formParam("todo-title", expectedTitle)
    .when().
        post("/todos").
    then().log().all().
        statusCode(200).
        body("html.body.section.section.ul.li.div.label", equalTo(expectedTitle));
  }
}
