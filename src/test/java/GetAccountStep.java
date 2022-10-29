import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Account.GetAccount;

public class GetAccountStep {

    @Steps
    GetAccount getAccount;

    @Given("I set url and valid token to get account")
    public void ISetUrlAndValidTokenToGetAccount() {
        getAccount.setUrlAndvalidToken();
    }

    @When("I request get Account")
    public void iRequestGetAccount() {
        getAccount.requestGetAccount();
    }

    @Then("I will get 401")
    public void iWillGet() {
        getAccount.validateStatusCode();
    }

    @And("get forbiden message")
    public void getForbidenMessage() {
        getAccount.validateForbiddenMessage();
    }

    @And("I input userid")
    public void iInputUserid() {
        getAccount.validUserid();
    }

    @And("I input null userid")
    public void iInputNullUserid() {
    }

    @Then("I will get 200")
    public void iWillGet(int arg0) {
        getAccount.validateStatus200();
    }

    @And("get success message")
    public void getSuccessMessage() {
        getAccount.validateSuccessMessage();
    }

    @Given("I set url and invalid token to get account")
    public void iSetUrlAndInvalidTokenToGetAccount() {
    getAccount.setNullUrlAndToken();
    }
}
