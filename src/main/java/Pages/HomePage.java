package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private SoftAssert softAssert=new SoftAssert();
    // Top Section
    By pageTitle = By.xpath("//h2[normalize-space()='Features Items']");
    By pageLogo = By.xpath("//img[@alt='Website for automation practice']");
    By homeButton = By.xpath("//a[normalize-space()='Home']");
    By productsIcon = By.xpath("//i[@class='material-icons card_travel']");
    By getProductsIconValue = By.xpath("//a[@href='/products']");
    By cartIcon = By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']");
    By cartIconValue = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By signUpIcon = By.xpath("//i[@class='fa fa-lock']");
    By signUpIconValue = By.xpath("//a[normalize-space()='Signup / Login']");
    By contactUsIcon = By.xpath("//i[@class='fa fa-envelope']");
    By contactUsIconValue = By.xpath(" //a[normalize-space()='Contact us']");
    By youTubIcon = By.xpath("//i[@class='fa fa-youtube-play']");
    By recommendedItemsTitle = By.xpath("//h2[normalize-space()='recommended items']");
    By recommendedItemButtonParameter = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    By nextArrow = By.xpath("//a[@class='right recommended-item-control']//i[@class='fa fa-angle-right']");
    By wrongValue = By.xpath("//div[@class='productinfo text-center']//p[normalize-space()='Rs. 1000']");
    By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    By viewCartButton = By.xpath("//u[normalize-space()='View Cart']");
    By viewProductButton = By.xpath("//ul[@class='nav nav-pills nav-justified']//a[contains(@href,'product_details')]");

    By logoutButton = By.xpath("//a[normalize-space()='Logout']");
    By deleteAccButton = By.xpath("//a[normalize-space()='Delete Account']");
    By addToCartButton = By.xpath("//div[@class='productinfo text-center']//a[@class='btn btn-default add-to-cart']");
    By subscriptionField = By.xpath("//input[@placeholder='Your email address']");
    By subscriptionTitle = By.xpath("//h2[normalize-space()='Subscription']");
    By underSubscriptionFieldMessage = By.xpath("//div[@class='footer-widget']//p[1]");
    By successfullySubscribedMessage = By.xpath("//div[@class='alert-success alert']");
    By subscriptionButton = By.id("subscribe");
    By arrowUP = By.xpath("//i[@class='fa fa-angle-up']");
    By youtubeTutorialButton = By.xpath("//a[normalize-space()='Video Tutorials']");
    By youtubeChannelName = By.xpath("//span[normalize-space()='AutomationExercise']");

// Category Locators Section
    By categoryTitle = By.xpath("//h2[normalize-space()='Category']");

    By womenPlusIcon = By.xpath("//a[normalize-space()='Women']//i[@class='fa fa-plus']");
    By womenPlusIconValue = By.xpath("//a[normalize-space()='Women']");
    By womenList = By.id("Women");
    By clickableWomenList = By.xpath("//div[@id='Women']//a[contains(@href, 'category_products')]");
    By womenListValue = By.xpath("//div[@id='Women']//ul");
/* Subgroups of Women list */
    By dressPage = By.xpath("//h2[@class='title text-center']");
    By topsPage = By.xpath("//h2[@class='title text-center']");
    By sareePage = By.xpath("//h2[@class='title text-center']");

    By menPlusIcon = By.xpath("//a[normalize-space()='Men']//i[@class='fa fa-plus']");
    By menPlusIconValue = By.xpath("//a[normalize-space()='Men']");
    By menList = By.id("Men");
    By menListValue = By.xpath("//div[@id='Men']//ul");
    By clickableMenList = By.xpath("//div[@id='Men']//a[contains(@href, 'category_products')]");
/* Subgroups of Men list */
    By tShirtPage = By.xpath("//h2[@class='title text-center']");
    By jeansPage = By.xpath("//h2[@class='title text-center']");

    By kidsPlusIcon = By.xpath("//a[normalize-space()='Kids']//i[@class='fa fa-plus']");
    By kidsPlusIconValue = By.xpath("//a[normalize-space()='Kids']");
    By kidsList = By.id("Kids");
    By kidsListValue = By.xpath("//div[@id='Kids']//ul");
    By clickableKidsList = By.xpath("//div[@id='Kids']//a[contains(@href, 'category_products')]");
/* Subgroups of Kids Page */
    By dressKidsPage = By.xpath("//h2[@class='title text-center']");
    By shirtsKidsPage = By.xpath("//h2[@class='title text-center']");

// Brands Locators Section
    By brandsTitle = By.xpath("//h2[normalize-space()='Brands']");
    By brandsList = By.xpath("//ul[@class='nav nav-pills nav-stacked']");
    By clickableBrandList = By.xpath("//*[contains(@href, '/brand_products/')]");
    By polo = By.xpath("//a[@href='/brand_products/Polo']");
    By poloPageTitle = By.xpath("//h2[@class='title text-center']");
    By hm = By.xpath("//a[@href='/brand_products/H&M']");
    By hmPageTitle = By.xpath("//h2[@class='title text-center']");
    By madame = By.xpath("//a[@href='/brand_products/Madame']");
    By madamePageTitle = By.xpath("//h2[@class='title text-center']");
    By mastHarbour = By.xpath("//a[@href='/brand_products/Mast & Harbour']");
    By mastHarbourPageTitle = By.xpath("//h2[@class='title text-center']");
    By babyHug = By.xpath("//a[@href='/brand_products/Babyhug']");
    By babyHugPageTitle = By.xpath("//h2[@class='title text-center']");
    By allenSollyJunior = By.xpath("//a[@href='/brand_products/Allen Solly Junior']");
    By allenSollyJuniorPageTitle = By.xpath("//h2[@class='title text-center']");
    By kookieKids = By.xpath("//a[@href='/brand_products/Kookie Kids']");
    By kookieKidsPageTitle = By.xpath("//h2[@class='title text-center']");
    By biba = By.xpath("//a[@href='/brand_products/Biba']");
    By bibaPageTitle = By.xpath("//h2[@class='title text-center']");
    By productNames = By.xpath("//div[contains(@class,'productinfo')]//p");
    By productPrices = By.xpath("//div[contains(@class,'productinfo')]//h2");
    By featuredProducts = By.xpath("//div[contains(@class,'productinfo')]");
    By productNamesOfHomePage = By.xpath("//div[@class='productinfo text-center']//p[normalize-space()]");
    By productPricesOfHomePage = By.xpath("//div[@class='productinfo text-center']//h2[normalize-space()]");

// Methods Section
    /* Top Section Methods*/
    public boolean checkLogOutButtonDisplay(){
        waitUntilElementIsVisible(logoutButton,5);
        return checkingDisplay(logoutButton);
    }
    public void clickOnLogoutButton(){
        waitUntilElementIsClickable(logoutButton,5);
        clickOn(logoutButton);
    }
    public boolean checkDeleteAccButtonDisplay(){
        waitUntilElementIsVisible(deleteAccButton,5);
        return checkingDisplay(deleteAccButton);
    }
    public void clickOnDeleteAccButton(){
        waitUntilElementIsClickable(deleteAccButton,5);
        clickOn(deleteAccButton);
    }
   public boolean checkHomePageTitle(){
   waitUntilElementIsVisible(pageTitle,10);
    return checkingDisplay(pageTitle);
   }
    public String checkHomePageTitleValue(){
        return getTitle();
    }
    public boolean checkLogo(){
    waitUntilElementIsVisible(pageLogo,10);
    return checkingDisplay(pageLogo);
    }
    public boolean checkProductsIcon(){
        return checkingDisplay(productsIcon);
    }
    public String checkProductsIconValue(){
        return getText(getProductsIconValue);
    }
    public boolean checkCartIcon(){
       return checkingDisplay(cartIcon);
    }
    public String checkCartIconValue(){
        return getText(cartIconValue) ;
    }
    public boolean checkSignUpIcon(){
        return checkingDisplay(signUpIcon);
    }
    public String checkSignUpIconValue(){
        return getText(signUpIconValue);
    }
    public boolean checkContactUsIcon(){
        return checkingDisplay(contactUsIcon);
    }
    public String checkContactUsIconValue(){
        return getText(contactUsIconValue);
    }
    public boolean checkYouTubeIcon(){
        return checkingDisplay(youTubIcon);
    }
    public String checkYouTubeIconValue(){
        return getText(youtubeTutorialButton);
    }
    public boolean checkArrowUpDisplay(){
        return checkingEnabled(arrowUP);
    }
    public String checkSubscriptionField(){
        scrollTo(subscriptionField);
       return placeHolders(subscriptionField);
    }
    public boolean checkSubscribeTitleDisplay(){
       scrollTo(subscriptionTitle);
       return checkingDisplay(subscriptionTitle);
    }
    public String checkSubscribeTitleValue(){
       return getText(subscriptionTitle);
    }
    public boolean checkBottomSubscribeMessage(){
       scrollTo(underSubscriptionFieldMessage);
       return checkingDisplay(underSubscriptionFieldMessage);
    }
    public String checkBottomSubscribeMessageValue(){
       return getText(underSubscriptionFieldMessage);
    }
    public boolean checkSubscribeButtonDisplay(){
       return checkingDisplay(subscriptionButton);
    }
    public boolean checkSubscribeSuccessDisplay(){
        scrollTo(subscriptionField);
        setText(subscriptionField,"test@test.com");
        clickOn(subscriptionButton);
       return checkingDisplay(successfullySubscribedMessage);
    }
    public String checkSubscribeSuccessMessageValue(){

       return getText(successfullySubscribedMessage);
    }
    public boolean checkRecommendedItemsDisplay(){
        return checkingDisplay(recommendedItemsTitle);
    }
    public String checkRecommendedItemsValue(){
       return getText(recommendedItemsTitle);
    }
    public void searchForTheParameter(){
       scrollTo(nextArrow);
       if (!checkingEnabled(recommendedItemButtonParameter)){
           clickOn(nextArrow);
           waitUntilElementIsClickable(recommendedItemButtonParameter,5);
           clickOn(recommendedItemButtonParameter);
           waitUntilElementIsVisible(viewCartButton,5);
           clickOn(continueShoppingButton);
       }else {
           clickOn(recommendedItemButtonParameter);
           waitUntilElementIsVisible(viewCartButton,5);
           clickOn(continueShoppingButton);
       }
    }
    public String checkForWrongValue(){
        scrollTo(subscriptionField);
        if (!checkingEnabled(recommendedItemButtonParameter)){
            clickOn(nextArrow);
        }
        waitUntilElementIsVisible(wrongValue,5);
        return getText(wrongValue);
    }



// Category Section Method
    /* Upper Left side */
    public boolean checkCategoryTitleDisplay(){
        return checkingDisplay(categoryTitle);
    }
    public String checkCategoryTitleValue(){
        return getText(categoryTitle);
    }

    public List<String> checkWomenListValue(){
       waitUntilElementIsVisible(womenListValue,10);
        return List.of(getElementsTextAsArray(womenListValue));
    }
    public boolean checkWomenListDisplay(){
        return checkingDisplay(womenList);
    }
    public String checkWomenListIconValue(){
        return getText(womenPlusIconValue);
    }
    public boolean checkWomenPlusIconDisplay(){
        return checkingDisplay(womenPlusIcon);
    }
    public void clickOnWomenPlusIcon(){
       waitUntilElementIsClickable(womenPlusIcon,5);
       clickOn(womenPlusIcon);
    }
    public void clickOnWomenListOptions(){
        waitUntilElementIsClickable(clickableWomenList,5);
        int j = getElementsListSize(clickableWomenList);
        for (int i = 0; i < j; i++) {
            clickOnWomenPlusIcon();
            elementsList(clickableWomenList,i);
            waitUntilElementIsVisible(womenPlusIcon,10);
            switch (i){
                case 0:
                    softAssert.assertTrue(checkDressPage());
                    softAssert.assertEquals(checkDressPageTitle().replaceAll("\\s+",""),"Women - Dress Products".toUpperCase().replaceAll("\\s+",""));
                    break;
                case 1:
                    softAssert.assertTrue(checkTopsPage());
                    softAssert.assertEquals(checkingTopsPageTitle().replaceAll("\\s+",""),"Women - Tops Products".toUpperCase().replaceAll("\\s+",""));
                    break;
                case 2:
                    softAssert.assertTrue(checkSareePage());
                    softAssert.assertEquals(checkingSareePageTitle().replaceAll("\\s+",""),"Women - Saree Products".toUpperCase().replaceAll("\\s+",""));
                    break;
            }
        }
        softAssert.assertAll();
    }
    //Subgroups Assertion of Women
    public boolean checkDressPage(){
        return checkingDisplay(dressPage);
    }
    public String checkDressPageTitle(){
        return getText(dressPage);
    }
    public boolean checkTopsPage(){
        return checkingDisplay(topsPage);
    }
    public String checkingTopsPageTitle(){
        return getText(topsPage);
    }
    public boolean checkSareePage(){
        return checkingDisplay(sareePage);
    }
    public String checkingSareePageTitle(){
        return getText(sareePage);
    }


    public List<String> checkMenListValue(){
        waitUntilElementIsVisible(menListValue,10);
        return List.of(getElementsTextAsArray(menListValue));
    }
    public boolean checkMenPlusIconDisplay(){
        return checkingDisplay(menPlusIcon);
    }
    public boolean checkMenListDisplay(){
        return checkingDisplay(menList);
    }
    public String checkMenListIconValue(){
        return getText(menPlusIconValue);
    }
    public void clickOnMenPlusIcon(){
        waitUntilElementIsClickable(menPlusIcon,5);
        clickOn(menPlusIcon);
    }
    public void clickOnMenListOptions(){
        waitUntilElementIsClickable(clickableMenList,5);
        int j = getElementsListSize(clickableMenList);
        for (int i = 0; i < j; i++) {
            clickOnMenPlusIcon();
            elementsList(clickableMenList,i);
            waitUntilElementIsVisible(menPlusIcon,10);
            switch (i){
                case 0:
                    softAssert.assertTrue(checkTShirtPage());
                    softAssert.assertEquals(checkingTShirtPageTitle().replaceAll("\\s+",""),"Men - Tshirts Products".toUpperCase().replaceAll("\\s+",""));
                    break;
                case 1:
                    softAssert.assertTrue(checkJeansPage());
                    softAssert.assertEquals(checkingJeansPageTitle().replaceAll("\\s+",""),"Men - Jeans Products".toUpperCase().replaceAll("\\s+",""));
                    break;
            }
        }
    }
    //Subgroups Assertion of Men
    public boolean checkTShirtPage(){
        return checkingDisplay(tShirtPage);
    }
    public String checkingTShirtPageTitle(){
        return getText(tShirtPage);
    }
    public boolean checkJeansPage(){
        return checkingDisplay(jeansPage);
    }
    public String checkingJeansPageTitle(){
        return getText(jeansPage);
    }

    public List<String> checkKidsListValue(){
        waitUntilElementIsVisible(kidsListValue,10);
        return List.of(getElementsTextAsArray(kidsListValue));
    }
    public boolean checkKidsPlusIconDisplay(){
        return checkingDisplay(kidsPlusIcon);
    }
    public boolean checkKidsListDisplay(){
        return checkingDisplay(kidsList);
    }
    public String checkKidsListIconValue(){
        return getText(kidsPlusIconValue);
    }
    public void clickOnKidsPlusIcon(){
        waitUntilElementIsClickable(kidsPlusIcon,5);
        clickOn(kidsPlusIcon);
    }
    public void clickOnKidsListOptions(){
        waitUntilElementIsClickable(clickableKidsList,5);
        int j = getElementsListSize(clickableKidsList);
        for (int i = 0; i < j; i++) {
            clickOnKidsPlusIcon();
            elementsList(clickableKidsList,i);
            waitUntilElementIsVisible(kidsPlusIcon,10);
            switch (i){
                case 0:
                    softAssert.assertTrue(checkDressKidsPage());
                    softAssert.assertEquals(checkingDressKidsPageTitle().replaceAll("\\s+",""),"Kids - Dress Products".toUpperCase().replaceAll("\\s+",""));
                    break;
                case 1:
                    softAssert.assertTrue(checkTopsShirtsKidsPage());
                    softAssert.assertEquals(checkingTopsShirtsPageTitle().replaceAll("\\s+",""),"Kids - Tops & Shirts Products".toUpperCase().replaceAll("\\s+",""));
                    break;
            }
        }
    }
    //Subgroups Assertion Of kids
    public boolean checkDressKidsPage(){
        return checkingDisplay(dressKidsPage);
    }
    public String checkingDressKidsPageTitle(){
        return getText(dressKidsPage);
    }
    public boolean checkTopsShirtsKidsPage(){
        return checkingDisplay(shirtsKidsPage);
    }
    public String checkingTopsShirtsPageTitle(){
        return getText(shirtsKidsPage);
    }


// Brands Section Method
    public boolean checkBrandsTitleDisplay(){
        return checkingDisplay(brandsTitle);
    }
    public String checkBrandsTitleValue(){
        return getText(brandsTitle);
    }
    public boolean checkPoloTitleDisplay(){
        return checkingDisplay(poloPageTitle);
    }
    public String checkPoloTitleValue(){
        return getText(poloPageTitle);
    }
    public boolean checkHMTitleDisplay(){
        return checkingDisplay(hmPageTitle);
    }
    public String checkHMTitleValue(){
        return getText(hmPageTitle);
    }
    public boolean checkMadameTitleDisplay(){
        return checkingDisplay(madamePageTitle);
    }
    public String checkMadameTitleValue(){
        return getText(madamePageTitle);
    }
    public boolean checkMastTitleDisplay(){
        return checkingDisplay(mastHarbourPageTitle);
    }
    public String checkMastTitleValue(){
        return getText(mastHarbourPageTitle);
    }
    public boolean checkBabyHugTitleDisplay(){
        return checkingDisplay(babyHugPageTitle);
    }
    public String checkBabyHugTitleValue(){
        return getText(babyHugPageTitle);
    }
    public boolean checkAllenSollyTitleDisplay(){
        return checkingDisplay(allenSollyJuniorPageTitle);
    }
    public String checkAllenSollyTitleValue(){
        return getText(allenSollyJuniorPageTitle);
    }
    public boolean checkKookieKidsTitleDisplay(){
        return checkingDisplay(kookieKidsPageTitle);
    }
    public String checkKookieKidsTitleValue(){
        return getText(kookieKidsPageTitle);
    }
    public boolean checkBibaTitleDisplay(){
        return checkingDisplay(bibaPageTitle);
    }
    public String checkBibaTitleValue(){
        return getText(bibaPageTitle);
    }

    public boolean checkBrandsListDisplay(){
        return checkingDisplay(brandsList);
    }

    public String checkBrandsListValue(){
        waitUntilElementIsVisible(brandsList,10);
        String[] items = getElementsTextAsArray(brandsList);
        return Arrays.toString(items);
    }
    public void clickOnBrandsOptions(){
        waitUntilElementIsVisible(clickableBrandList,5);
        int j = getElementsListSize(clickableBrandList);
        for (int i = 0; i < j; i++) {
            elementsList(clickableBrandList,i);
            switch (i){
                case 0:
                    softAssert.assertTrue(checkPoloTitleDisplay());
                    softAssert.assertEquals(checkPoloTitleValue(),"Brand - Polo Products".toUpperCase());
                    break;
                case 1:
                    softAssert.assertTrue(checkHMTitleDisplay());
                    softAssert.assertEquals(checkHMTitleValue(),"Brand - H&M Products".toUpperCase());
                    break;
                case 2:
                    softAssert.assertTrue(checkMadameTitleDisplay());
                    softAssert.assertEquals(checkMadameTitleValue(),"Brand - Madame Products".toUpperCase());
                    break;
                case 3:
                    softAssert.assertTrue(checkMastTitleDisplay());
                    softAssert.assertEquals(checkMastTitleValue(),"Brand - Mast & Harbour Products".toUpperCase());
                    break;
                case 4:
                    softAssert.assertTrue(checkBabyHugTitleDisplay());
                    softAssert.assertEquals(checkBabyHugTitleValue(),"Brand - Babyhug Products".toUpperCase());
                    break;
                case 5:
                    softAssert.assertTrue(checkAllenSollyTitleDisplay());
                    softAssert.assertEquals(checkAllenSollyTitleValue(),"Brand - Allen Solly Junior Products".toUpperCase());
                    break;
                case 6:
                    softAssert.assertTrue(checkKookieKidsTitleDisplay());
                    softAssert.assertEquals(checkKookieKidsTitleValue(),"Brand - Kookie Kids Products".toUpperCase());
                    break;
                case 7:
                    softAssert.assertTrue(checkBibaTitleDisplay());
                    softAssert.assertEquals(checkBibaTitleValue(),"Brand - Biba Products".toUpperCase());
                    break;
            }
        }
        softAssert.assertAll();
    }

/* Additional Methods to this Section To Be Used if needed *//*
        public boolean checkPoloDisplay () {
        return checkingDisplay(polo);
    }
        public boolean checkHMDisplay () {
        return checkingDisplay(hm);
    }
        public boolean checkMadameDisplay () {
        return checkingDisplay(madame);
    }
        public boolean checkMastHarbourDisplay () {
        return checkingDisplay(mastHarbour);
    }
        public boolean checkBabyHugDisplay () {
        return checkingDisplay(babyhug);
    }
        public boolean checkKookieKidsDisplay () {
        return checkingDisplay(kookieKids);
    }
        public boolean checkAllenSollyJuniorDisplay () {
        return checkingDisplay(allenSollyJunior);
    }
        public boolean checkBibaDisplay () {
        return checkingDisplay(biba);
    }
*/

// perform action Methods
    public String getChannelName(){
//       switchTabs("https://www.youtube.com/c/AutomationExercise",youtubeChannelName);
        return getText(youtubeChannelName);
    }
    public void checkChannelNameValue(){
    switchTabs("https://www.youtube.com/c/AutomationExercise",youtubeChannelName);
    softAssert.assertEquals(youtubeChannelName,"AutomationExercise");

    }
    public void clickAddToCart() {
        waitUntilElementIsClickable(addToCartButton,10);
        int j = getElementsListSize(addToCartButton);
        int counter = 0;

        for (int i = 0; i < j; i++) {
            int random = (int) (Math.random() * j);
            if (counter != 3) {
                elementsList(addToCartButton, random);
                waitUntilElementIsVisible(continueShoppingButton,5);
                clickOn(continueShoppingButton);
                counter++;
            }else {
                waitUntilElementIsVisible(signUpIcon,5);
                clickOn(signUpIconValue);
            }
            if (counter ==3) break;
        }
    }
    public void clickViewProduct() {
        waitUntilElementIsClickable(viewProductButton,10);
        int j = getElementsListSize(viewProductButton);
        int counter = 0;
        for (int i = 0; i < j; i++) {
            int random = (int) (Math.random() * j);
            if (checkingEnabled(addToCartButton) && counter<3) {
                elementsList(viewProductButton, random);
                counter++;
            }else continue;
        }
    }
    public void clickViewProduct(int index) {
        waitUntilElementIsClickable(viewProductButton,10);
        elementsList(viewProductButton,index);
    }
    public void clickOnArrowUp(){
        clickOn(arrowUP);
    }
    public void clickOnHomeButton(){
        waitUntilElementIsVisible(homeButton,10);
        clickOn(homeButton);
    }
    public void clickOnProductsPage(){
        clickOn(productsIcon);
    }
    public void clickOnCartPage(){
        clickOn(cartIcon);
    }
    public void clickOnSignUpPage(){
        waitUntilElementIsClickable(signUpIcon,5);
        clickOn(signUpIcon);
    }
    public void clickOnContactUsPage(){
        clickOn(contactUsIcon);
    }
    public void clickOnYoutubeIcon(){
        waitUntilElementIsVisible(youtubeTutorialButton,5);
        clickOn(youtubeTutorialButton);

    }
    public void clickYoutubeChannelButton(){
       waitUntilElementIsVisible(youtubeTutorialButton,5);
        clickOn(youtubeTutorialButton);
    }
    public int getFeatureProductsCount() {
        waitUntilElementIsVisible(featuredProducts, 5);
        return getElementsListSize(featuredProducts);
    }

    public String getProductName(int index) {
        waitUntilElementIsVisible(productNames, 5);
       return elementsListValue(productNames,index);
    }
    public String getProductNameOfHomePage(int index) {
        waitUntilElementIsVisible(productNamesOfHomePage, 5);
        return elementsListValue(productNamesOfHomePage,index);
    }
    public String getFeatureProductPrice(int index) {
        waitUntilElementIsVisible(productPrices, 5);
       return elementsListValue(productPrices,index);
    }
    public String getFeatureProductPriceOfHomePage(int index) {
        waitUntilElementIsVisible(productPricesOfHomePage, 5);
        return elementsListValue(productPricesOfHomePage,index);
    }
}
