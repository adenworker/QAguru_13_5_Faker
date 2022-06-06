package TestData;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RegistrationFakerTestData {
    /* This class contains user datasets in each object (which are created also here using Java Faker library)*/

    static Faker faker = new Faker(new Locale("pl"));
    //Faker allows us to use various languages
    public static RegistrationTestUserData user1 = new RegistrationTestUserData(faker.address().firstName(), faker.address().lastName(),
            faker.internet().emailAddress(), "Male", "4812345678","15 August,1966", "English",
            "Reading, Music", "meh.jpg", faker.address().fullAddress(), "Haryana",
            "Karnal");

    //Here we could add infinite number of users
    public static RegistrationTestUserData user2 = new RegistrationTestUserData(faker.address().firstName(), faker.address().lastName(),
            faker.internet().emailAddress(), "Male", "4812345678","15 August,1966", "English",
            "Reading, Music", "meh.jpg", faker.address().fullAddress(), "Haryana",
            "Karnal");

}
