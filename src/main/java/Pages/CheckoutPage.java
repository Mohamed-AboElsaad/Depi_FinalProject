package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By deliveryAddress = By.id("address_delivery");
    private final By billingAddress = By.id("address_invoice");
    private final By commentField = By.name("message");
    private final By placeOrderBtn = By.xpath("//a[contains(@href,'payment')]");
    private final By orderSummary = By.id("cart_info_table");

    // Methods
    public boolean verifyAddressesDisplayed() {
        return checkingDisplay(deliveryAddress) && checkingDisplay(billingAddress);
    }

    public void addOrderComment(String comment) {
        setText(commentField, comment);
    }

    public void clickPlaceOrder() {
        clickOn(placeOrderBtn);
    }

    public boolean verifyOrderSummary(String productName, String quantity, String total) {
        String summaryText = getText(orderSummary);
        return summaryText.contains(productName) &&
                summaryText.contains(quantity) &&
                summaryText.contains(total);
    }
}