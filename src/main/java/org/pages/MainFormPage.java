package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainFormPage {

    @FindBy(xpath = "//input[@id='firstName']")
    private SelenideElement nameField;

    @FindBy(xpath = "//input[@id='lastName']")
    private SelenideElement lastNameField;

    @FindBy(xpath = "//input[@id='userEmail']")
    private SelenideElement emailField;

    @FindBy(xpath = "//div[@id='genterWrapper']//label[@for='gender-radio-1']")
    private SelenideElement genderRadioButton;

    @FindBy(xpath = "//div[@id='userNumber-wrapper']//input[@id='userNumber']")
    private SelenideElement numberField;

    @FindBy(xpath = "//div[@id='dateOfBirth-wrapper']//input[@id='dateOfBirthInput']")
    private SelenideElement dateField;

    @FindBy(xpath = "//div[@id='subjectsWrapper']//input[@id='subjectsInput']")
    private SelenideElement subjectsField;

    @FindBy(xpath = "//div[@class='mt-2 row']//input[@id='uploadPicture']")
    private SelenideElement photoField;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@for='hobbies-checkbox-1']")
    private SelenideElement checkBox;

    @FindBy(xpath = "//div[@id='currentAddress-wrapper']//textarea[@id='currentAddress']")
    private SelenideElement currentAddress;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']//div[@class=' css-yk16xz-control']")
    private SelenideElement state;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']//div[@id='city']")
    private SelenideElement city;

    @FindBy(xpath = "//div[@class='mt-4 justify-content-end row']//button[@id='submit']")
    private SelenideElement submitButton;

    public MainFormPage setFirstName(String name) {
        nameField
                .shouldBe(appear)
                .setValue(name);
        return this;
    }

    public MainFormPage setLastName(String lastName) {
        lastNameField
                .shouldBe(appear)
                .setValue(lastName);
        return this;
    }

    public MainFormPage setEmailField(String email) {
        emailField
                .shouldBe(visible)
                .setValue(email)
                .shouldHave(value(email));
        return this;
    }

    public MainFormPage clickOnRadioButtonGender() {
        genderRadioButton
                .click();
        return this;
    }

    public MainFormPage setNumber(String number) {
        numberField
                .shouldBe(visible)
                .setValue(number)
                .shouldHave(value(number));

        return this;
    }

    public MainFormPage setDate(String year, String month, String day) {
        dateField.click();

        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__day--0" + day).click();
        return this;
    }

    public MainFormPage setSubjects(String subjects) {
        subjectsField
                .shouldHave(visible)
                .setValue(subjects)
                .pressEnter();
        return this;
    }

    public MainFormPage setPhoto(File path){
        photoField
                .uploadFile(path);

        photoField.shouldHave(value(path.getName()));

        return this;
    }

    public MainFormPage clickCheckBox(){
        checkBox
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    public MainFormPage setTextOnCurrentAddress(String address){
        currentAddress
                .shouldHave(visible)
                .setValue(address);
        return this;
    }

    public MainFormPage selectState(String stateName){
        state.click();
        $$(" .css-26l3qy-menu ").findBy(text(stateName)).click();
        return this;
    }

    public MainFormPage selectCity(String cityName){
        city.click();
        $$(" .css-26l3qy-menu .css-11unzgr").findBy(text(cityName)).click();
        return this;
    }

    public MainFormPage clickSubmitButton(){
        submitButton
                .shouldHave(visible)
                .click();
        return this;
    }
}
