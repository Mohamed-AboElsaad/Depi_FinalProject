package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp extends BasePage{

    public SignUp(WebDriver driver) {
        super(driver);
    }

    By signUpMessage = By.xpath("//h2[normalize-space()='New User Signup!']");
    By nameField = By.xpath("//input[@placeholder='Name']");
    By emailAddressField = By.xpath("//input[@data-qa='signup-email']");
    By signUpButton = By.xpath("//button[normalize-space()='Signup']");
// Model Locators Section
    By mrRadioButton = By.id("id_gender1");
    By passwordField = By.id("password");
    By dayList = By.id("days");
    By monthsList = By.id("months");
    By yearList = By.id("years");
    By fNameField = By.id("first_name");
    By lnNameField = By.id("last_name");
    By companyNameField = By.id("last_name");
    By address1Field = By.id("address1");
    By countryList = By.id("country");
    By stateField = By.id("state");
    By cityField = By.id("city");
    By zipCodeField = By.id("zipcode");
    By mobileNumField = By.id("mobile_number");
    By createAccCTA = By.xpath("//button[normalize-space()='Create Account']");

    By accountCreatedSuccessfullyMessage = By.xpath("//b[normalize-space()='Account Created!']");
    By continueButton = By.xpath("//a[@class='btn btn-primary']");

    public String checkSignUpPageTitleValue(){
        waitUntilElementIsVisible(signUpMessage,5);
        return getTitle();
    }
    public boolean signUpMessageDisplay(){
        waitUntilElementIsVisible(signUpMessage,5);
        return checkingDisplay(signUpMessage);
    }
    public String signUpMessageValue(){
        waitUntilElementIsVisible(signUpMessage,5);
        return getText(signUpMessage);
    }
    public boolean nameFieldDisplay(){
        waitUntilElementIsVisible(nameField,10);
        return checkingDisplay(nameField);
    }
    public boolean emailAddressFieldDisplay(){
        waitUntilElementIsVisible(emailAddressField,5);
        return checkingDisplay(emailAddressField);
    }
    public boolean signUpCTADisplay(){
        waitUntilElementIsVisible(signUpButton,5);
        return checkingDisplay(signUpButton);
    }
    public String checkNameFieldValue(){
        return placeHolders(nameField);
    }
    public String checkEmailFieldValue(){
        return placeHolders(emailAddressField);
    }
    public void setNameField(String name){
        waitUntilElementIsVisible(nameField,10);
        setText(nameField,name);
    }
    public void setEmailAddressField(String email){
        waitUntilElementIsVisible(emailAddressField,5);
        setText(emailAddressField,email);
    }
    public void clickOnSignCTA(){
        waitUntilElementIsClickable(signUpButton,10);
        clickOn(signUpButton);
    }

// Sign up page model
    public String checkModelTitleValue(){
        waitUntilElementIsVisible(mrRadioButton,5);
        return getTitle();
    }
    public void clickOnMrRadioButton(){
        waitUntilElementIsClickable(mrRadioButton,10);
        clickOn(mrRadioButton);
    }
    public void setPasswordField(String password){
        waitUntilElementIsVisible(passwordField,10);
        setText(passwordField,password);
    }
    public void setFirstNameField(String fName){
        scrollTo(createAccCTA);
        waitUntilElementIsVisible(fNameField,10);
        setText(fNameField,fName);
    }
    public void setLastNameField(String Lname){
        waitUntilElementIsVisible(lnNameField,10);
        setText(lnNameField,Lname);
    }
    public void setCompanyNameField(String company){
        waitUntilElementIsVisible(companyNameField,10);
        setText(companyNameField,company);
    }
    public void setAddress1Field(String address1){
        waitUntilElementIsVisible(address1Field,10);
        setText(address1Field,address1);
    }
    public void setStateField(String state){
        waitUntilElementIsVisible(stateField,10);
        setText(stateField,state);
    }
    public void setCityField(String city){
        waitUntilElementIsVisible(cityField,10);
        setText(cityField,city);
    }
    public void setZipCodeField(String zipCode){
        waitUntilElementIsVisible(zipCodeField,10);
        setText(zipCodeField,zipCode);
    }
    public void setMobileNumField(String mobileNum){
        waitUntilElementIsVisible(mobileNumField,10);
        setText(mobileNumField,mobileNum);
    }
    public void setDayList(){
        waitUntilElementIsVisible(dayList,10);
        selectFromDropDownList(dayList,"11");
    }
    public void setMonthsList(){
        waitUntilElementIsVisible(monthsList,10);
        selectFromDropDownList(monthsList,"January");
    }
    public void setYearList(){
        waitUntilElementIsVisible(yearList,10);
        selectFromDropDownList(yearList,"2004");
    }
    public void setCountryList(){
        waitUntilElementIsVisible(countryList,10);
        selectFromDropDownList(countryList,"United States");
    }
    public void clickOnCreateAccountCTA(){
        waitUntilElementIsClickable(createAccCTA,10);
        clickOn(createAccCTA);
    }
    public boolean checkAccountCreatedMessageDisplay(){
        waitUntilElementIsVisible(accountCreatedSuccessfullyMessage,5);
        return checkingDisplay(accountCreatedSuccessfullyMessage);
    }
    public String accountCreatedMessageValue(){
        waitUntilElementIsVisible(accountCreatedSuccessfullyMessage,5);
        return getTitle();
    }
    public void clickOnContinueButton(){
        waitUntilElementIsClickable(continueButton,5);
        clickOn(continueButton);
    }

}
