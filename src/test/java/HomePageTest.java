import Pages.Cart;
import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class HomePageTest extends BaseTest {
    public SoftAssert softAssert;
    HomePage homePage;
    ProductPage productPage;
    Cart cart;
    By arrowUPs = By.xpath("//i[@class='fa fa-angle-up']");

//    @AfterMethod
//    public void ReloadPage(){
//        driver.get("https://www.automationexercise.com");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }

//    @DataProvider(name="ValidData")
//    public static Object [][] credentials() throws IOException {
//        ExcelReader excelReader = new ExcelReader();
//        return excelReader.getExcelData(0,6, "src/main/resources/ValidData.xlsx");
//    }

    @Test(priority = 0)
    public void Validate_UserInterface() throws InterruptedException {
        // ONLY ASSERTION TEST
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

    Assert.assertEquals(homePage.checkHomePageTitleValue(),"Automation Exercise");
    softAssert.assertTrue(homePage.checkHomePageTitle());
    softAssert.assertTrue(homePage.checkLogo());
    softAssert.assertTrue(homePage.checkProductsIcon());
    softAssert.assertEquals(homePage.checkProductsIconValue(),"\uE8F8 Products");
    softAssert.assertTrue(homePage.checkCartIcon());
    softAssert.assertEquals(homePage.checkCartIconValue(),"Cart");
    softAssert.assertTrue(homePage.checkSignUpIcon());
    softAssert.assertEquals(homePage.checkSignUpIconValue(),"Signup / Login");
    softAssert.assertTrue(homePage.checkContactUsIcon());
    softAssert.assertEquals(homePage.checkContactUsIconValue(), "Contact us");
    softAssert.assertTrue(homePage.checkYouTubeIcon());
    softAssert.assertEquals(homePage.checkYouTubeIconValue(),"Video Tutorials");
    softAssert.assertEquals(homePage.checkSubscriptionField(),"Your email address");
    softAssert.assertTrue(homePage.checkSubscribeTitleDisplay());
    softAssert.assertEquals(homePage.checkSubscribeTitleValue(),"SUBSCRIPTION");
    softAssert.assertTrue(homePage.checkBottomSubscribeMessage());
    softAssert.assertEquals(homePage.checkBottomSubscribeMessageValue(),"Get the most recent updates from\n" +
            "our site and be updated your self...");
    softAssert.assertTrue(homePage.checkSubscribeButtonDisplay());
    softAssert.assertTrue(homePage.checkSubscribeSuccessDisplay()); //It also, Assert that Subscribe Button is Clickable
    softAssert.assertEquals(homePage.checkSubscribeSuccessMessageValue(),"You have been successfully subscribed!");
    softAssert.assertTrue(homePage.checkRecommendedItemsDisplay());
    softAssert.assertEquals(homePage.checkRecommendedItemsValue(),"RECOMMENDED ITEMS");
    homePage.searchForTheParameter(); //Assertion for existing products in Recommended Section & CLickable (Add to cart buttons, Next arrow)

    System.out.println(driver.findElement(arrowUPs).isDisplayed());
    homePage.clickOnArrowUp();
    Thread.sleep(500); /* To give the page time to get on top */
    System.out.println(driver.findElement(arrowUPs).isDisplayed());
    softAssert.assertFalse(homePage.checkArrowUpDisplay());

// Assert Category Section
    softAssert.assertTrue(homePage.checkCategoryTitleDisplay());
    softAssert.assertEquals(homePage.checkCategoryTitleValue(),"Category".toUpperCase());
    softAssert.assertTrue(homePage.checkWomenPlusIconDisplay());
    softAssert.assertEquals(homePage.checkWomenListIconValue(),"WOMEN");
    homePage.clickOnWomenPlusIcon();
    softAssert.assertTrue(homePage.checkWomenListDisplay());
    Thread.sleep(200);
        System.out.println("This is the Woman Section options:");
        System.out.println(homePage.checkWomenListValue());
        System.out.println("==============================");
    softAssert.assertTrue(homePage.checkMenPlusIconDisplay());
    softAssert.assertEquals(homePage.checkMenListIconValue(),"MEN");
        homePage.clickOnMenPlusIcon();
    softAssert.assertTrue(homePage.checkMenListDisplay());
    Thread.sleep(200);
        System.out.println("This is the Man Section options:");
        System.out.println(homePage.checkMenListValue());
        System.out.println("==============================");
    softAssert.assertTrue(homePage.checkKidsPlusIconDisplay());
    softAssert.assertEquals(homePage.checkKidsListIconValue(),"KIDS");
        homePage.clickOnKidsPlusIcon();
    softAssert.assertTrue(homePage.checkKidsListDisplay());
    Thread.sleep(200);
        System.out.println("This is the Kids Section options:");
        System.out.println(homePage.checkKidsListValue());
        System.out.println("==============================");

// Assert Brands Section
        softAssert.assertTrue(homePage.checkBrandsTitleDisplay());
        softAssert.assertEquals(homePage.checkBrandsTitleValue(),"BRANDS");
        softAssert.assertTrue(homePage.checkBrandsListDisplay());

        System.out.println("Available Brands List:\n"+homePage.checkBrandsListValue());
        softAssert.assertEquals(homePage.checkBrandsListValue(),"[(6)\n" +
                "POLO, (5)\n" +
                "H&M, (5)\n" +
                "MADAME, (3)\n" +
                "MAST & HARBOUR, (4)\n" +
                "BABYHUG, (3)\n" +
                "ALLEN SOLLY JUNIOR, (3)\n" +
                "KOOKIE KIDS, (5)\n" +
                "BIBA]");

    softAssert.assertAll();
    }

    @Test(priority = 1)
    public void Validate_That_User_Can_Navigate_Through_Page_Menus(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

    homePage.clickOnProductsPage();
//    softAssert.assertTrue(homePage.checkProd);
//    softAssert.assertEquals(homePage);
    homePage.clickOnCartPage();
    homePage.clickOnSignUpPage();
    homePage.clickOnContactUsPage();
    homePage.clickOnHomeButton();

//Category Section
    homePage.clickOnWomenPlusIcon();
    homePage.clickOnWomenListOptions(); //Include Page Title Assertion to ensure the right page is opened
    homePage.clickOnMenPlusIcon();
    homePage.clickOnMenListOptions();//Include Page Title Assertion to ensure the right page is opened
    homePage.clickOnKidsPlusIcon();
    homePage.clickOnKidsListOptions();//Include Page Title Assertion to ensure the right page is opened

//Brands Section
    homePage.clickOnBrandsOptions();//Include Page Title Assertion to ensure the right page is opened
//    homePage.clickOnYoutubeIcon();
    homePage.clickOnHomeButton();
    }

    @Test(priority = 2)
    public void Validate_User_Can_Add_To_Cart(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.checkHomePageTitle());
        homePage.clickAddToCart();
    }

    @Test(priority = 3)
    public void Validate_Product_View_Page_Details(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
        homePage.clickOnHomeButton();
        homePage.clickViewProduct(20);
        productPage = new ProductPage(driver);


        softAssert.assertTrue(productPage.productNameDisplay(),
                "Product name not displayed");
        softAssert.assertTrue(productPage.productCategoryDisplay(),
                "Category not displayed");
        softAssert.assertTrue(productPage.productPriceDisplay(),
                "Price not displayed");
        softAssert.assertTrue(productPage.productQuantityDisplay(),
                "Quantity input not displayed");
        softAssert.assertTrue(productPage.addToCartDisplay(),
                "Add to cart button not displayed");

        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void Validate_Product_Quantity_Update(){
        homePage = new HomePage(driver);

        homePage.clickOnHomeButton();
        homePage.clickViewProduct(32);

        WebElement quantityInput = driver.findElement(By.id("quantity"));
        String newQuantity = "3";
        quantityInput.clear();
        quantityInput.sendKeys(newQuantity);

        Assert.assertEquals(quantityInput.getAttribute("value"), newQuantity,
                "Quantity not updated correctly");
    }

    @Test(priority = 5)
    public void Validate_Add_To_Cart_From_Product_Page(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);

//        homePage.clickViewProduct();

        driver.findElement(By.xpath("//button[@type='button']")).click();

        Assert.assertTrue(productPage.viewCartButtonDisplay(),
                "View Cart button not displayed after adding to cart");

        productPage.clickOnContinueButton();
        homePage.clickOnHomeButton();
    }

    @Test(priority = 6)
    public void Validate_Multiple_Product_Views(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();


        for(int i = 0; i < 3; i++) {
            homePage.clickViewProduct(19);

            softAssert.assertTrue(productPage.productNameDisplay(),
                    "Product name not displayed on attempt " + (i+1));

            driver.navigate().back();
        }

        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void Test_To_Fail(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

        homePage.clickOnHomeButton();
        softAssert.assertNotEquals(homePage.checkForWrongValue(),"Sleeveless Dress");
        softAssert.assertAll();
    }
}