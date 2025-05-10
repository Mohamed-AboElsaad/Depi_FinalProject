package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends BasePage{

    public Cart(WebDriver driver) {
        super(driver);
    }

    By checkOutButton = By.xpath("//a[@class='btn btn-default check_out']");
    By cartPageTitle = By.xpath("//li[@class='active']");

//Checkout Page
    By checkoutPageTitle= By.xpath("//li[@class='active']");
    By placeOrderButton = By.xpath("//a[@class='btn btn-default check_out']");
    By commentField = By.xpath("//textarea[@name='message']");

// Payment Page
    By paymentPageTitle = By.xpath("//li[@class='active']");
    By orderPlacedSuccessfullyMessage=By.xpath("//b[normalize-space()='Order Placed!']");
    By continueButton = By.xpath("//a[@class='btn btn-primary']");
    By downloadInvoiceButton=By.xpath("//a[@class='btn btn-default check_out']");
    By nameOnCardField=By.xpath("//input[@name='name_on_card']");
    By cardNumField =By.xpath("//input[@name='card_number']");
    By cvvField = By.xpath("//input[@placeholder='ex. 311']");
    By expirationMonthField = By.xpath("//input[@placeholder='MM']");
    By expirationYearField = By.xpath("//input[@placeholder='YYYY']");
    By payButton = By.id("submit");


    public String checkCartPageTitleValue(){
        waitUntilElementIsVisible(cartPageTitle,5);
        return getTitle();
    }
    public boolean checkOutButtonDisplay(){
        waitUntilElementIsVisible(checkOutButton,5);
        return checkingDisplay(checkOutButton);
    }
    public String checkOutButtonValue(){
        return getText(checkOutButton);
    }
    public void clickOnCheckOutCTA(){
        waitUntilElementIsClickable(checkOutButton,5);
        clickOn(checkOutButton);
    }
}
