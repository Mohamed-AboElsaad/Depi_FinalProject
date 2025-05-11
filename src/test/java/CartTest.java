import Pages.Cart;
import Pages.HomePage;
import Pages.SignUp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends BaseTest{
    Cart cart;
    SoftAssert softAssert;
    HomePage homePage;
    SignUp sign;

    @Test(priority = 0)
    public void Validate_User_Can_See_Cart() {
        cart = new Cart(driver);
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);

        homePage.clickOnCartPage();
//        System.out.println(cart.checkCartPageTitleValue());
        softAssert.assertEquals(cart.checkCartPageTitleValue(),"Automation Exercise - Checkout");
       softAssert.assertTrue(cart.checkOutButtonDisplay());
       softAssert.assertEquals(cart.checkOutButtonValue(),"Proceed To Checkout");
        cart.clickOnCheckOutCTA();
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void Validate_That_User_Can_Checkout(){
        cart = new Cart(driver);
        sign = new SignUp(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

        Assert.assertTrue(cart.checkCheckoutTitleDisplay());
        cart.addOrderComment("⦿ B E S T   T E A M ⦿ → ★ B E S T   T E A M ★");
        cart.clickPlaceOrder();
        Assert.assertTrue(cart.checkPaymentPageTitleDisplay());
        softAssert.assertEquals(cart.checkPaymentPageTitleValue(),"Payment");
        cart.enterPaymentDetails("Test User", "4111111111111111", "123", "12", "2025");
        cart.clickOnPayButton();

        Assert.assertEquals(cart.checkOrderPlacedSuccessfullyMessageValue(),"Order Placed!".toUpperCase());
        softAssert.assertTrue(cart.checkDownloadInvoiceCTADisplay());
        cart.clickOnContinueButton();
        homePage.clickOnDeleteAccButton();
        Assert.assertTrue(cart.checkAccountDeletedMessageDisplay());
        softAssert.assertEquals(cart.checkAccountDeletedMessageValue(),"Account Deleted!".toUpperCase());
        cart.clickOnContinueButton();
        softAssert.assertAll();
    }
}
