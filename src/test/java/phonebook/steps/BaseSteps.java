package phonebook.steps;

import phonebook.pages.ContactsPage;
import phonebook.pages.LoginPage;
import phonebook.pages.PasswordRecoveryPage;

public class BaseSteps {

    //classes
    public static LoginPage loginPage = new LoginPage();
    public static ContactsPage contactsPage = new ContactsPage();
    public static PasswordRecoveryPage pwdRecoveryPage = new PasswordRecoveryPage();
}
