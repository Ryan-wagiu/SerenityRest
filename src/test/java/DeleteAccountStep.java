import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Account.DeleteAccount;
import starter.Account.GetAccount;

public class DeleteAccountStep {

    @Steps
    DeleteAccount deleteAccount;

    @When("I request Delete Account")
    public void iRequestDeleteAccount() {
        deleteAccount.requestDeleteAccount();
    }

    @And("I input valid userid")
    public void iInputValidUserid() {
        deleteAccount.validUserid();
    }

    @And("Delete success message")
    public void deleteSuccessMessage() {
    deleteAccount.validateSuccessMessage();
    }


    @And("I input invalid userid")
    public void iInputInvalidUserid() {
        deleteAccount.invalidUserid();
    }

    @And("Delete forbiden message")
    public void deleteForbidenMessage() {
        deleteAccount.validateForbiddenMessage();
    }

}
