package phonebook.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsSteps extends BaseSteps {

    @When("I click on change language button")
    public void iClickOnChangeLanguageButton() {
        contactsPage.clickOnChangeLanguage();
    }

    @When("I choose {} language")
    public void iChooseLanguage(String language) {
        contactsPage.chooseLanguage(language);
    }

    @Then("I see {} the following text")
    public void iSeeTheFollowingText(String language) {
        contactsPage.checkLanguage(language);
    }
}
