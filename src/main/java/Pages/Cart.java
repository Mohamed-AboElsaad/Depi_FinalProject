package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends BasePage{

    public Cart(WebDriver driver) {
        super(driver);
    }

    By checkOutButton = By.xpath("//a[@class='btn btn-default check_out']");

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
