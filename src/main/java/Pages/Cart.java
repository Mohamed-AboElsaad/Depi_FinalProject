package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends BasePage {
    public Cart(WebDriver driver) {
        super(driver);
    }

    // Add these new methods
    public void verifyCartItem(String productName, String price, String quantity, String total) {
        String cartText = getText(By.id("cart_info_table"));
        assert cartText.contains(productName) &&
                cartText.contains(price) &&
                cartText.contains(quantity) &&
                cartText.contains(total);
    }

    public void proceedToCheckout() {
        clickOn(By.xpath("//a[contains(@class,'check_out')]"));
    }
}