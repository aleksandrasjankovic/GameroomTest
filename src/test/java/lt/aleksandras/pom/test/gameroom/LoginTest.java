package lt.aleksandras.pom.test.gameroom;

import lt.aleksandras.pom.pages.gameroom.HomePage;
import lt.aleksandras.pom.pages.gameroom.LoginPage;
import lt.aleksandras.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.open();
    }

    @Test
    public void testInvalidLogin(){
        String expectedResult = "Prisijungimas nepavyko.";
        String actualResult;

        LoginPage.enterEmailText("batonas@test.lt");
        LoginPage.enterPasswordText("kepalas123");
        LoginPage.clickButtonLogin();
        LoginPage.sleep(2000);

        actualResult = LoginPage.readErrorLoginMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
