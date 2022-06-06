package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTest extends RegistrationTestBase {

    @Test
    void registrationTest() {

        registrationTestPO.openPage()
                .setFirstName()
                .setLastName()
                .setEmail()
                .setGender()
                .setMobile()
                .setDateOfBirth()
                .setSubjects()
                .setHobbies()
                .setPicture()
                .setAddress()
                .setState()
                .setCity()
                .submit()
                .checkResult();
    }
}