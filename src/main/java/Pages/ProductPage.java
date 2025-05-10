package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Product Details Locators
    By productName = By.xpath("//h2[contains(@class,'name')]");
    By productCategory = By.xpath("//p[contains(text(),'Category')]");
    By productPrice = By.xpath("//span[contains(@class,'price')]");
    By quantityInput = By.id("quantity");
    By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");

    // Methods
    public String getProductName() {
        waitUntilElementIsVisible(productName, 10);
        return getText(productName);
    }

    public String getProductCategory() {
        return getText(productCategory);
    }

    public String getProductPrice() {
        return getText(productPrice);
    }

    public void setQuantity(int quantity) {
        clear(quantityInput);
        setText(quantityInput, String.valueOf(quantity));
    }

    public void clickAddToCart() {
        clickOn(addToCartButton);
    }

    public void clickViewCart() {
        waitUntilElementIsVisible(viewCartButton, 5);
        clickOn(viewCartButton);
    }
}