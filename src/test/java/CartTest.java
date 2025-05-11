import Pages.Cart;
import Pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends BaseTest {
    Cart cart;
    SoftAssert softAssert;
    HomePage homePage;

    @Test(priority = 0)
    public void Validate_User_Can_See_Cart() {
        cart = new Cart(driver);
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);

        homePage.clickOnCartPage();
        System.out.println(cart.checkCartPageTitleValue());
        softAssert.assertEquals(cart.checkCartPageTitleValue(), "Automation Exercise - Checkout");
        softAssert.assertTrue(cart.checkOutButtonDisplay());
        softAssert.assertEquals(cart.checkOutButtonValue(), "Proceed To Checkout");
        cart.clickOnCheckOutCTA();
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void Validate_That_User_Can_Checkout() {
        cart = new Cart(driver);
        homePage = new HomePage(driver);
        
        cart.addOrderComment("Test order");
        cart.clickPlaceOrder();
        cart.enterPaymentDetails("Test User", "4111111111111111", "123", "12", "2025");
        cart.clickPayButton();
        
        softAssert.assertTrue(cart.checkingDisplay(
            By.xpath("//b[normalize-space()='Order Placed!']")), 
            "Order success message not displayed");
        softAssert.assertAll();
    }
}
