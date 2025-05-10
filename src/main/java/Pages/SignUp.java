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

}
