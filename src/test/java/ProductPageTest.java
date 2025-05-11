import Pages.HomePage;
import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductPageTest extends BaseTest {
    HomePage homePage;
    SoftAssert softAssert;
    ProductPage productPage;

    @Test(priority = 1)
    public void testProductNavigationFromHomePage() {
         homePage = new HomePage(driver);
         softAssert = new SoftAssert();

        // Verify featured products exist
        int productCount = homePage.getFeatureProductsCount();
        softAssert.assertTrue(productCount > 0, "No featured products found");

        // Test first product
        String homePageProductName = homePage.getProductNameOfHomePage(0);
        String homePageProductPrice = homePage.getFeatureProductPriceOfHomePage(0);
        // Navigate to product details
        homePage.clickViewProduct(0);

        // Verify product details page
        productPage = new ProductPage(driver);
        softAssert.assertEquals(productPage.getProductName(), homePageProductName,
                "Product name doesn't match");
        softAssert.assertEquals(productPage.getProductPrice(),homePageProductPrice,
                "Product price doesn't match");
        homePage.clickOnHomeButton();
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testAddToCartFromProductPage() {
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);

        homePage.clickViewProduct(0);


        productPage.setQuantity(2);
        productPage.clickAddToCart();
        productPage.clickViewCart();
    homePage.clickOnHomeButton();
        // Here you would add cart verification
        // For example:
        // CartPage cartPage = new CartPage(driver);
        // assertTrue(cartPage.isProductInCart(homePageProductName));
    }

    @Test(priority = 3)
    public void testMultipleProductNavigation() {
         homePage = new HomePage(driver);
         softAssert = new SoftAssert();
        int productCount = homePage.getFeatureProductsCount();


        // Test navigating to each product
        for (int i = 0; i < Math.min(productCount, 3); i++) { // Limit to 3 products for demo
            String productName = homePage.getProductName(i);
            homePage.clickViewProduct(i);

            ProductPage productPage = new ProductPage(driver);
            softAssert.assertEquals(productPage.getProductName(), productName);

            // Go back to home page
            homePage.clickOnHomeButton();
        }
    }
}