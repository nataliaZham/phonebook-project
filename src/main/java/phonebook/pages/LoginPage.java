package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains all Login page locators and methods.
 */
public class LoginPage {

    //locators
    protected static By emailField = By.xpath("//*[@id='defaultRegisterFormEmail']");
    protected static By invalidEmailErrorMessage = By.xpath("//*[@id='email-error-invalid']");
    protected static By emailIsRequiredErrorMessage = By.xpath("//*[@id='email-error-required']");
    protected static By passwordField = By.xpath("//*[@id='login-form']/div[2]/div[1]/div/input");
    protected static By longPasswordErrorMessage = By.xpath("//*[@id='password-error-maxlength']");
    protected static By shortPasswordErrorMessage = By.xpath("//*[@id='password-error-minlength']");
    protected static By loginButton = By.xpath("//*[@id='login-form']/div[3]/div[1]/button");


    //methods
    public void inputInvalidEmail(String email) {
        $(emailField).setValue(email);
    }

    public void seeErrorMessage(String text) {
        By locator = null;
        if (text.equals("Email must be a valid email address.")) {
            locator = invalidEmailErrorMessage;
        } else if (text.equals("Email is required.")) {
            locator = emailIsRequiredErrorMessage;
        } else if (text.equals("Password must be no longer than 20 characters.")) {
            locator = longPasswordErrorMessage;
        } else if (text.equals("Password must be at least 8 characters.")) {
            locator = shortPasswordErrorMessage;
        }
        $(locator).shouldHave(Condition.text(text));
    }

    public void inputEmptyEmail() {
        $(emailField).setValue(" ");
    }

    public void inputInvalidPassword(String password) {
        $(passwordField).setValue(password);
    }

    public void enterEmail(String email) {
        $(emailField).setValue(email);
    }

    public void enterPassword(String password) {
        $(passwordField).setValue(password);
    }

    public ContactsPage clickOnLoginBtn() {
        $(loginButton).click();
        return page(ContactsPage.class);
    }


}
