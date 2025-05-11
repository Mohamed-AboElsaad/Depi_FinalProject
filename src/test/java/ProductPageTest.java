import Pages.HomePage;
import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductPageTest extends BaseTest {
    HomePage homePage;
    SoftAssert softAssert;
    @Test(priority = 1)
    public void testProductNavigationFromHomePage() {
         homePage = new HomePage(driver);
         softAssert = new SoftAssert();

        // Verify featured products exist
        int productCount = homePage.getFeaturedProductsCount();
        softAssert.assertTrue(productCount > 0, "No featured products found");

        // Test first product
        String homePageProductName = homePage.getProductName(0);
        String homePageProductPrice = homePage.getProductPrice(0);

        // Navigate to product details
        homePage.clickViewProduct(0);

        // Verify product details page
        ProductPage productPage = new ProductPage(driver);
        softAssert.assertEquals(productPage.getProductName(), homePageProductName,
                "Product name doesn't match");
        softAssert.assertTrue(productPage.getProductPrice().contains(homePageProductPrice),
                "Product price doesn't match");

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testAddToCartFromProductPage() {
        homePage = new HomePage(driver);
        homePage.clickViewProduct(0);

        ProductPage productPage = new ProductPage(driver);
        productPage.setQuantity(2);
        productPage.clickAddToCart();
        productPage.clickViewCart();

        // Here you would add cart verification
        // For example:
        // CartPage cartPage = new CartPage(driver);
        // assertTrue(cartPage.isProductInCart(homePageProductName));
    }

    @Test(priority = 3)
    public void testMultipleProductNavigation() {
         homePage = new HomePage(driver);
        int productCount = homePage.getFeaturedProductsCount();


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