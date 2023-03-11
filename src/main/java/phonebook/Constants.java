package phonebook;

import com.github.javafaker.Faker;

/**
 * This class contains constants url,test data and credentials
 */
public class Constants {
    //classes
    static Faker faker = new Faker();

    //constants url
    public static final String LOGIN_URL = "http://phonebook.telran-edu.de:8080/user/login";
    public static final String PASSWORD_RECOVERY_URL = "http://phonebook.telran-edu.de:8080/user/forgot-password";

    //test credentials
    public static String USER_EMAIL = "test@gmail.com";
    public static String USER_PASSWORD = "test@gmail.com";

    //test data
    public static String NONEXISTING_USER_EMAIL = faker.internet().emailAddress();
    public static String ADD_CONTACT_NAME = faker.name().firstName();
    public static String ADD_CONTACT_LASTNAME = faker.name().lastName();

}
