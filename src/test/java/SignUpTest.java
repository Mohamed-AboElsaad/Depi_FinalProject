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

    @DataProvider(name="Data")
    public static Object [][] credentials() throws IOException {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData(0,2, "src/main/resources/ValidData.xlsx");
    }

    @Test(priority = 0,dataProvider = "Data")
    public void Validate_User_Can_SignUp(String name,String email){
        sign= new SignUp(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();

        homePage.clickOnSignUpPage();
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
}
