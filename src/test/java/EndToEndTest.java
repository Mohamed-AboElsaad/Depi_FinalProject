

import Pages.*;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void testCompleteUserJourney() throws InterruptedException {
        // Initialize all page objects
        HomePage homePage = new HomePage(driver);
        SignUp signUpPage = new SignUp(driver);
        ProductPage productPage = new ProductPage(driver);
        Cart cartPage = new Cart(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);

        // 1. Navigate to Sign Up
        homePage.clickOnSignUpPage();

        // 2. Register new user
        String email = "testuser" + System.currentTimeMillis() + "@test.com";
        signUpPage.setNameField("Test User");
        signUpPage.setEmailAddressField(email);
        signUpPage.clickOnSignCTA();

        // 3. Fill account details
        signUpPage.clickOnMrRadioButton();
        signUpPage.setPasswordField("password123");
        signUpPage.setDayList();
        signUpPage.setMonthsList();
        signUpPage.setYearList();
        signUpPage.setFirstNameField("Test");
        signUpPage.setLastNameField("User");
        signUpPage.setAddress1Field("123 Test St");
        signUpPage.setCountryList();
        signUpPage.setStateField("Test State");
        signUpPage.setCityField("Test City");
        signUpPage.setZipCodeField("12345");
        signUpPage.setMobileNumField("1234567890");
        signUpPage.clickOnCreateAccountCTA();
        signUpPage.clickOnContinueButton();

        // 4. Add product to cart
//        homePage.clickOnHomeButton();
        homePage.clickViewProduct((int) (Math.random() * 34));
        productPage.setQuantity((int) (Math.random() * 10));
        productPage.clickAddToCart();
        productPage.clickViewCart();

        // 5. Proceed to checkout
        cartPage.clickOnCheckOutCTA();

        // 6. Verify checkout and place order
        String asciiArt =
                "+----------------------+\n" +
                        "|  GOOD BYE            |\n" +
                        "|  GOOD FRIENDS        |\n" +
                        "+----------------------+";
        checkoutPage.verifyAddressesDisplayed();
        checkoutPage.addOrderComment(asciiArt);
        Thread.sleep(2000);
        checkoutPage.clickPlaceOrder();

        // 7. Complete payment
        paymentPage.enterPaymentDetails("Test User", "4111111111111111", "123", "12", "2025");
        paymentPage.clickPayButton();

        // 8. Verify payment success
        paymentPage.isPaymentSuccessful();

        // 9. Delete account (cleanup)
        homePage.clickOnDeleteAccButton();
        signUpPage.clickOnContinueButton();
    }
}