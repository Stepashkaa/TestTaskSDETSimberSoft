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
        //Configuration.browser = "edge";
        Configuration.timeout = 30000;

        open(Configuration.baseUrl);
        formPage = page(MainFormPage.class);
    }

    @Test(description = "Проверка ввода имени", priority = 1)
    void testSetFirstNameField() {
        formPage.setFirstName("Stepan");
    }

    @Test(description = "Проверка ввода фамилии", priority = 2)
    void testSetLastNameField() {
        formPage.setLastName("Afanasev");
    }

    @Test(description = "Проверка ввода почты", priority = 3)
    void testSetEmailField() {
        formPage.setEmailField("stepan@yandex.ru");
    }

    @Test(priority = 4)
    void testClickGenderRadioButton() {
        formPage.clickOnRadioButtonGender();
    }

    @Test(description = "Проверка ввода телефона", priority = 5)
    void testSetNumberField() {
        formPage.setNumber("9996667432");
    }

    @Test(description = "Проверка выбора даты рождения", priority = 6)
    void testSetDateField() {
        formPage.setDate("2004", "October", "10");
    }

    @Test(description = "Проверка ввода предмета", priority = 7)
    void testSetSubjectField() {
        formPage.setSubjects("Information");
    }

    @Test(description = "Проверка работоспособности checkbox-а", priority = 8)
    void testClickCheckBox() {
        formPage.clickCheckBox();
    }

    @Test(description = "Провера загрузки фото", priority = 9)
    void testSetPhoto() {
        File file = new File("src/main/resources/javaPicture.jpg");
        formPage.setPhoto(file);
    }

    @Test(description = "Проверка ввода адреса", priority = 10)
    void testSetTextOnCurrentAddressField() {
        formPage.setTextOnCurrentAddress("Промышленная, 10");
    }

    @Test(description = "Проверка работоспособности selectState", priority = 11)
    void testSelectState() {
        formPage.selectState("Haryana");
    }

    @Test(description = "Проверка работоспособности selectCity", priority = 12)
    void testSelectCity() {
        formPage.selectCity("Karnal");
    }

    @Test(description = "Нажатие кнопки submit и проверка полей", priority = 13)
    void testClickSubmitButton() {
        formPage.clickSubmitButton();
        sleep(10000);
    }
}
