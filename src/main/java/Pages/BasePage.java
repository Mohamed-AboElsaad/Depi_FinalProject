package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
    private SoftAssert softAssert = new SoftAssert();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementIsVisible(By by, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilElementIsClickable(By by, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitUntilUrlToBe(String url) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void setText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void clickOn(By by) {
        driver.findElement(by).click();
    }

    public void clear(By by) {
        driver.findElement(by).clear();
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void select(By by, int index) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByIndex(index);
//        dropDown.selectByValue(value);
//        dropDown.selectByVisibleText(value);
    }

    public boolean checkingDisplay(By by) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).isDisplayed();
    }

    public boolean checkingEnabled(By by) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).isDisplayed();
    }

    public void elementsList(By by, int i) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> elements = driver.findElements(by);
        elements.get(i).click();
    }

    public int getElementsListSize(By by) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> elements = driver.findElements(by);
        return elements.size();
    }

    public String[] getElementsTextAsArray(By by) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement ulElement = driver.findElement(by);
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        String[] textValues = new String[liElements.size()];

        for (int i = 0; i < liElements.size(); i++) {
            textValues[i] = liElements.get(i).getText();
        }
        return textValues;
    }
    public int onlyDisplayedElements(By by){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> allElements = driver.findElements(by);
        List<WebElement> displayedElements = new ArrayList<>();
        for (WebElement element : allElements) {
            if (element.isDisplayed()) {
                displayedElements.add(element);
            }
        }
        return displayedElements.size();
    }

    public void clearTextField(By by){
        driver.findElement(by).clear();
    }
    public void selectFromDropDownList(By by, String value){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select dropDown = new Select(driver.findElement(by));
//        dropDown.selectByValue(value);
//        dropDown.selectByIndex();
        dropDown.selectByVisibleText(value);
    }
    public void scrollTo(By by){
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        action.moveToElement(driver.findElement(by)).perform();
        /*To Scroll to desired element*/
    }
    public void getTabs(By by){

    }
    public void switchTabs(String url,By by){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
        tabs.addAll(driver.getWindowHandles());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public String placeHolders(By by){
       return driver.findElement(by).getAttribute("placeholder");
    }
}
