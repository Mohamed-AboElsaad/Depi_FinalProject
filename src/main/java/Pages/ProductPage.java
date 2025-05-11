package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Product Details Locators
    By productName = By.xpath("//div[@class='product-information']//h2[normalize-space()]");
    By productCategory = By.xpath("//p[contains(text(),'Category')]");
    By productPrice = By.xpath("//div[@class='product-information']//span[text() and not(*)]");
    By quantityInput = By.id("quantity");
    By addToCartButton = By.xpath("//button[@type='button']");
    By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");
    By continueButton = By.xpath("//button[@class='btn btn-success close-modal btn-block']");

    // Methods
    public boolean viewCartButtonDisplay(){
        waitUntilElementIsVisible(viewCartButton,5);
        return checkingDisplay(viewCartButton);
    }
    public String getProductName() {
        waitUntilElementIsVisible(productName, 10);
        return getText(productName);
    }
    public boolean productNameDisplay(){
        waitUntilElementIsVisible(productName,5);
        return checkingDisplay(productName);
    }
    public boolean productCategoryDisplay(){
        waitUntilElementIsVisible(productCategory,5);
        return checkingDisplay(productCategory);
    }
    public boolean productPriceDisplay(){
        waitUntilElementIsVisible(productPrice,5);
        return checkingDisplay(productPrice);
    }
    public boolean productQuantityDisplay(){
        waitUntilElementIsVisible(quantityInput,5);
        return checkingDisplay(quantityInput);
    }
    public boolean addToCartDisplay(){
        waitUntilElementIsVisible(addToCartButton,5);
        return checkingDisplay(addToCartButton);
    }
    public String getProductCategory() {
        return getText(productCategory);
    }

    public String getProductPrice() {
        waitUntilElementIsVisible(productPrice,5);
        return getText(productPrice);
    }

    public void setQuantity(int quantity) {
        waitUntilElementIsVisible(quantityInput,5);
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
    public void clickOnContinueButton(){
        waitUntilElementIsClickable(continueButton,5);
        clickOn(continueButton);
    }
}