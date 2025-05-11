package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends BasePage {

    public Cart(WebDriver driver) {
        super(driver);
    }

    By checkOutButton = By.xpath("//a[@class='btn btn-default check_out']");
    By cartPageTitle = By.xpath("//li[@class='active']");

    By checkoutPageTitle = By.xpath("//li[@class='active']");
    By placeOrderButton = By.xpath("//a[@class='btn btn-default check_out']");
    By commentField = By.xpath("//textarea[@name='message']");

// Payment Page
    By paymentPageTitle = By.xpath("//li[@class='active']");
    By orderPlacedSuccessfullyMessage = By.xpath("//b[normalize-space()='Order Placed!']");
    By continueButton = By.xpath("//a[@class='btn btn-primary']");
    By downloadInvoiceButton = By.xpath("//a[@class='btn btn-default check_out']");
    By nameOnCardField = By.xpath("//input[@name='name_on_card']");
    By cardNumField = By.xpath("//input[@name='card_number']");
    By cvvField = By.xpath("//input[@placeholder='ex. 311']");
    By expirationMonthField = By.xpath("//input[@placeholder='MM']");
    By expirationYearField = By.xpath("//input[@placeholder='YYYY']");
    By payButton = By.id("submit");
    By deleteAccountMessage= By.xpath("//b[normalize-space()='Account Deleted!']");


    public String checkCartPageTitleValue() {
        waitUntilElementIsVisible(cartPageTitle, 5);
        return getTitle();
    }
    public boolean checkCheckoutTitleDisplay(){
        waitUntilElementIsVisible(checkoutPageTitle,10);
        return checkingDisplay(checkoutPageTitle);
    }
    public boolean checkOutButtonDisplay() {
        waitUntilElementIsVisible(checkOutButton, 5);
        return checkingDisplay(checkOutButton);
    }
    
    public String checkOutButtonValue() {
        return getText(checkOutButton);
    }
    
    public void clickOnCheckOutCTA() {
        waitUntilElementIsClickable(checkOutButton, 5);
        clickOn(checkOutButton);
    }

    public void addOrderComment(String comment) {
        setText(commentField, comment);
    }
    public void clickPlaceOrder(){
        waitUntilElementIsClickable(placeOrderButton,5);
        scrollTo(placeOrderButton);
        clickOn(placeOrderButton);
    }

    public void enterPaymentDetails(String name, String cardNum, String cvv, String month, String year) {
        setText(nameOnCardField, name);
        setText(cardNumField, cardNum);
        setText(cvvField, cvv);
        setText(expirationMonthField, month);
        setText(expirationYearField, year);
    }
    public void clickOnPayButton(){
        waitUntilElementIsClickable(payButton,5);
        clickOn(payButton);
    }
    public boolean checkAccountDeletedMessageDisplay(){
        waitUntilElementIsVisible(deleteAccountMessage,5);
        return checkingDisplay(deleteAccountMessage);
    }
    public String checkAccountDeletedMessageValue(){
        waitUntilElementIsVisible(deleteAccountMessage,5);
        return getText(deleteAccountMessage);
    }
    public boolean checkPaymentPageTitleDisplay(){
        waitUntilElementIsVisible(paymentPageTitle,10);
        return checkingDisplay(paymentPageTitle);
    }
    public String checkPaymentPageTitleValue(){
        waitUntilElementIsVisible(paymentPageTitle,5);
        return getText(paymentPageTitle);
    }
    public String checkOrderPlacedSuccessfullyMessageValue(){
        waitUntilElementIsVisible(orderPlacedSuccessfullyMessage,10);
        return getText(orderPlacedSuccessfullyMessage);
    }
    public void clickOnContinueButton(){
        waitUntilElementIsClickable(continueButton,5);
        clickOn(continueButton);
    }
    public boolean checkDownloadInvoiceCTADisplay(){
        waitUntilElementIsVisible(downloadInvoiceButton,5);
        return checkingDisplay(downloadInvoiceButton);
    }

}
