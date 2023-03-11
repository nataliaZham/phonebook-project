package phonebook.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static phonebook.Constants.PASSWORD_RECOVERY_URL;


public class PasswordRecoverySteps extends BaseSteps {

    @Given("I am on the Password recovery page")
    public void iAmOnThePasswordRecoveryPage() {
        open(PASSWORD_RECOVERY_URL);
    }

    @When("I input existing email")
    public void iInputExistingEmail() {
        pwdRecoveryPage.inputExistingEmail();
    }

    @When("I click on Send button")
    public void iClickOnSendButton() {
        pwdRecoveryPage.clickOnSendButton();
    }

    @Then("I see successful message sending")
    public void iSeeSuccessfulMessage(DocString successMessage) {
        String message = successMessage.getContent();
        pwdRecoveryPage.checkSuccessfulMessage(message);
    }

    @When("I input nonexisting email")
    public void iInputNonexistingEmail() {
        pwdRecoveryPage.inputNonExistingEmail();
    }

    @Then("I see unsuccessful message sending")
    public void iSeeUnsuccessfulMessage(DocString errorMess) {
        String message = errorMess.getContent();
        pwdRecoveryPage.checkUnsuccessfulMessage(message);
    }
}
