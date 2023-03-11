package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static phonebook.Constants.NONEXISTING_USER_EMAIL;
import static phonebook.Constants.USER_EMAIL;

/**
 * This class contains all Password Recovery page locators and methods.
 */
public class PasswordRecoveryPage {

    //locators
    protected static By emailField = By.xpath("//*[@id='defaultRegisterFormEmail']");
    protected static By sendButton = By.xpath("//*[@id='forgot-pass-form']/div[2]/div[1]/button");
    protected static By successMessage = By.xpath("//*[@id='success-message']/h6");
    protected static By errorMessage = By.xpath("//*[@id='error-message']");

    //methods
    public void inputExistingEmail() {
        $(emailField).setValue(USER_EMAIL);
    }

    public void clickOnSendButton() {
        $(sendButton).click();
    }

    public void checkSuccessfulMessage(String message) {
        $(successMessage).shouldHave(Condition.text(message));
    }

    public void inputNonExistingEmail() {
        $(emailField).setValue(NONEXISTING_USER_EMAIL);

    }

    public void checkUnsuccessfulMessage(String message) {
        $(errorMessage).shouldHave(Condition.text(message));
    }

}
