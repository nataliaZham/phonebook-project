package phonebook.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import phonebook.pages.ContactsPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static phonebook.Constants.*;

public class LoginSteps extends BaseSteps {

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        open(LOGIN_URL);
    }

    @When("I input {} invalid email")
    public void iInputInvalidEmailInvalidEmail(String email) {
        loginPage.inputInvalidEmail((email));
    }

    @Then("I see error message")
    public void iSeeErrorMessage(DocString text) {
        String message = text.getContent();
        loginPage.seeErrorMessage(message);
    }

    @When("I input empty email")
    public void iInputEmptyEmail() {
        loginPage.inputEmptyEmail();
    }

    @When("I input {} long password")
    public void iInputInvalidPassword(String password) {
        loginPage.inputInvalidPassword(password);
    }


    @When("I input {} short password")
    public void iInputShortPasswordShortPassword(String password) {
        loginPage.inputInvalidPassword(password);
    }

    @Given("I am logged in")
    public ContactsPage iAmLoggedIn() {
        open(LOGIN_URL);
        loginPage.enterEmail(USER_EMAIL);
        loginPage.enterPassword(USER_PASSWORD);
        loginPage.clickOnLoginBtn();
        return page(ContactsPage.class);
    }

}
