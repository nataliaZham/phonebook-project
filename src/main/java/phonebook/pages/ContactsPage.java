package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains all Contacts page locators and methods.
 */
public class ContactsPage {

    //locators
    protected static By changeLangButton = By.xpath("//*[@id='langSelect']");


    //methods
    public void clickOnChangeLanguage() {
        $(changeLangButton).click();
    }

    public void chooseLanguage(String text) {
        $(By.xpath("//*[contains(text(),'" + text + "')]")).click();
    }

    public void checkLanguage(String text) {
        $(By.xpath("//*[contains(text(),'" + text + "')]")).shouldHave(Condition.text(text));
    }
}
