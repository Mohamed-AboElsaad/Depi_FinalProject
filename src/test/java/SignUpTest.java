import Pages.HomePage;
import Pages.SignUp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SignUpTest extends BaseTest{
    SignUp sign;
    SoftAssert softAssert;
    HomePage homePage;

    @DataProvider(name="SignUpData")
    public static Object [][] credentials() throws IOException {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(0,2, "src/main/resources/ValidData.xlsx");
    }
    @DataProvider(name="SignUpDataModal")
    public static Object [][] SignUpModal() throws IOException {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(1,9, "src/main/resources/ValidData.xlsx");
    }
    @DataProvider(name="Login")
    public static Object [][] LogIn() throws IOException {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(2,2, "src/main/resources/ValidData.xlsx");
    }

    @Test(priority = 0,dataProvider = "SignUpData")
    public void Validate_User_Can_SignUp(String name,String email){
        sign= new SignUp(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

        homePage.clickOnSignUpPage();
        Assert.assertEquals(sign.checkSignUpPageTitleValue(),"Automation Exercise - Signup / Login");
        Assert.assertTrue(sign.signUpMessageDisplay());
        softAssert.assertEquals(sign.signUpMessageValue(),"New User Signup!");
        softAssert.assertTrue(sign.nameFieldDisplay());
        softAssert.assertEquals(sign.checkNameFieldValue(),"Name");
        softAssert.assertTrue(sign.emailAddressFieldDisplay());
        softAssert.assertEquals(sign.checkEmailFieldValue(),"Email Address");
        sign.setNameField(name);
        sign.setEmailAddressField(email);
        sign.clickOnSignCTA();
    }

    @Test(priority = 1,dataProvider = "SignUpDataModal")
    public void fillingSignUPModel(String pass, String fname, String lname, String company, String address1, String state, String city, String zipcode, String mobileNum){
        sign= new SignUp(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

// In Sign up Model
        Assert.assertEquals(sign.checkModelTitleValue(),"Automation Exercise - Signup");
        sign.clickOnMrRadioButton();
        sign.setPasswordField(pass);
        sign.setDayList();
        sign.setMonthsList();
        sign.setYearList();
        sign.setFirstNameField(fname);
        sign.setLastNameField(lname);
        sign.setCompanyNameField(company);
        sign.setAddress1Field(address1);
        sign.setCountryList();
        sign.setStateField(state);
        sign.setCityField(city);
        sign.setZipCodeField(zipcode);
        sign.setMobileNumField(mobileNum);
        sign.clickOnCreateAccountCTA();

        Assert.assertTrue(sign.checkAccountCreatedMessageDisplay());
        softAssert.assertEquals(sign.accountCreatedMessageValue(),"Account Created!");
        sign.clickOnContinueButton();

    }
    @Test(priority = 2,dataProvider = "Login")
    public void Validate_User_Can_Login(String email,String pass) {
        sign = new SignUp(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

        Assert.assertEquals(homePage.checkHomePageTitleValue(), "Automation Exercise");
        homePage.clickOnLogoutButton();
        Assert.assertEquals(sign.checkSignUpPageTitleValue(), "Automation Exercise - Signup / Login");
        softAssert.assertTrue(sign.checkLoginEmailFieldDisplay());
        softAssert.assertTrue(sign.checkLoginPassFieldDisplay());
        sign.setLoginEmailField(email);
        sign.setLoginPassField(pass);
        sign.clickOnLoginCTA();
        softAssert.assertAll();
    }
}
