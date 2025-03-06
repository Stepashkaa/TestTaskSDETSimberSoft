import com.codeborne.selenide.Configuration;
import org.pages.MainFormPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestForm {

    private MainFormPage formPage;

    @BeforeClass
    void init() {
        Configuration.baseUrl = "https://demoqa.com/automation-practice-form";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "edge";
        Configuration.timeout = 1500000;

        open(Configuration.baseUrl);
        formPage = page(MainFormPage.class);
    }

    @Test(description = "Проверка ввода имени")
    void testSetFirstNameField() {
        formPage.setFirstName("Alex");
    }
    /*
    @Test(description = "Проверка ввода фамилии", priority = 2, dataProvider = "testData")
    void testSetLastNameField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setLastName(lastName);
    }

    @Test(description = "Проверка ввода почты", priority = 3, dataProvider = "testData")
    void testSetEmailField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setEmailField(email);
    }

    @Test(priority = 4)
    void testClickGenderRadioButton() {
        formPage.clickOnRadioButtonGender();
    }

    @Test(description = "Проверка ввода телефона", priority = 5, dataProvider = "testData")
    void testSetNumberField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setNumber(number);
    }

    @Test(description = "Проверка выбора даты рождения", priority = 6, dataProvider = "testData")
    void testSetDateField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setDate(date, month, day);
    }

    @Test(description = "Проверка ввода предмета", priority = 7, dataProvider = "testData")
    void testSetSubjectField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setSubjects(subject);
    }

    @Test(description = "Проверка работоспособности checkbox-а", priority = 8)
    void testClickCheckBox() {
        formPage.clickCheckBox();
    }

    @Test(description = "Провера загрузки фото", priority = 9, dataProvider = "testData")
    void testSetPhoto(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        File file = new File(photoPath);
        formPage.setPhoto(file);
    }

    @Test(description = "Проверка ввода адреса", priority = 10, dataProvider = "testData")
    void testSetTextOnCurrentAddressField(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.setTextOnCurrentAddress(address);
    }

    @Test(description = "Проверка работоспособности selectState", priority = 11, dataProvider = "testData")
    void testSelectState(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.selectState(state);
    }

    @Test(description = "Проверка работоспособности selectCity", priority = 12, dataProvider = "testData")
    void testSelectCity(String firstName, String lastName, String email, String number, String date, String month, String day, String subject, String photoPath, String address, String state, String city) {
        formPage.selectCity(city);
    }

    @Test(description = "Нажатие кнопки submit и проверка полей", priority = 13)
    void testClickSubmitButton() {
        formPage.clickSubmitButton();
        sleep(10000);
    }*/
}
