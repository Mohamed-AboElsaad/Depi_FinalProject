import Pages.Cart;
import Pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends BaseTest{
    Cart cart;
    SoftAssert softAssert;
    HomePage homePage;

    @Test(priority = 0)
    public void Validate_User_Can_CheckOut(){
        cart = new Cart(driver);
        softAssert = new SoftAssert();
        homePage = new HomePage(driver);

        homePage.clickOnCartPage();
        System.out.println(cart.checkCartPageTitleValue());
        softAssert.assertEquals(cart.checkCartPageTitleValue(),"Automation Exercise - Checkout");
       softAssert.assertTrue(cart.checkOutButtonDisplay());
       softAssert.assertEquals(cart.checkOutButtonValue(),"Proceed To Checkout");
        cart.clickOnCheckOutCTA();
    }

}
