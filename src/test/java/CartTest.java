import Pages.Cart;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends BaseTest{
    Cart cart;
    SoftAssert softAssert;

    @Test(priority = 0)
    public void Validate_User_Can_CheckOut(){
       softAssert.assertTrue(cart.checkOutButtonDisplay());
       softAssert.assertEquals(cart.checkOutButtonValue(),"Proceed To Checkout");
        cart.clickOnCheckOutCTA();
    }
}
