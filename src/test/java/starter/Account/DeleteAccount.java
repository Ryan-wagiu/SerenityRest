package starter.Account;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteAccount {

    private String url, token;

    public void setUrlAndvalidToken(){
        url = "https://demoqa.com/swagger/#/";
        token = "valid"; //penamaan variabel token
    }
    public void setNullUrlAndToken(){
        url = null;
        token = null;
    }

    public void requestDeleteAccount(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().get(url); //method dan url apa yg akan kita request dan melakukan requestnya
    }

    public void validUserid() {then().statusCode(Integer.parseInt("14025"))}
    public void invalidUserid() {then().statusCode(Integer.parseInt("1"))}
    public void validateForbiddenMessage(){
        then().body(equalTo("Forbidden"));
    }
    public void validateSuccessMessage(){
        then().body(equalTo("Success"));
    }

   }
