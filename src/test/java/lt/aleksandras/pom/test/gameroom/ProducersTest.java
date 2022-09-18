package lt.aleksandras.pom.test.gameroom;

import lt.aleksandras.pom.pages.Locators;
import lt.aleksandras.pom.pages.gameroom.LoginPage;
import lt.aleksandras.pom.pages.gameroom.ProducersPage;
import lt.aleksandras.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProducersTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        ProducersPage.open();
    }

    @Test
    public void testAddProductFromProducers() {
        String expectedResult = "1";
        String actualResult;


        ProducersPage.clickActivisionProducer();
        ProducersPage.sleep(2000);
        ProducersPage.clickFirstProducerProduct();
        ProducersPage.waitForPopup();
        ProducersPage.clickClosePopup();

        actualResult = ProducersPage.readShoppingCartNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
