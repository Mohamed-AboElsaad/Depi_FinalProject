package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By nameOnCard = By.name("name_on_card");
    private final By cardNumber = By.name("card_number");
    private final By cvc = By.name("cvc");
    private final By expiryMonth = By.name("expiry_month");
    private final By expiryYear = By.name("expiry_year");
    private final By payBtn = By.id("submit");
    private final By successMsg = By.xpath("//div[contains(@class,'alert-success')]");

    // Methods
    public void enterPaymentDetails(String name, String number, String cvcNum, String month, String year) {
        setText(nameOnCard, name);
        setText(cardNumber, number);
        setText(cvc, cvcNum);
        setText(expiryMonth, month);
        setText(expiryYear, year);
    }

    public void clickPayButton() {
        clickOn(payBtn);
    }

    public boolean isPaymentSuccessful() {
        return checkingDisplay(successMsg);
    }
}