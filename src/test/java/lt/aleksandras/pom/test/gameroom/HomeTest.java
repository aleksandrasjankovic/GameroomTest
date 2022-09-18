package lt.aleksandras.pom.test.gameroom;

import lt.aleksandras.pom.pages.Common;
import lt.aleksandras.pom.pages.Locators;
import lt.aleksandras.pom.pages.gameroom.HomePage;
import lt.aleksandras.pom.pages.gameroom.ProducersPage;
import lt.aleksandras.pom.test.TestBase;
import lt.aleksandras.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        HomePage.open();
    }

    @Test
    public void testChangeLanguage(){
        String expectedResult = "ENGLISH";
        String actualResult;

        HomePage.clickLanguageDropdown();
        HomePage.clickEnglishLanguage();

        actualResult = HomePage.readCurrentLanguage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSearchBar(){
        String expectedResult = "\"WITCHER\"";
        String actualResult;

        HomePage.enterSearchText("Witcher");
        HomePage.clickButtonSearch();

        actualResult = HomePage.readCurrentSearchResultTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSortingMenu(){
        String expectedResult;
        String actualResult;

        HomePage.clickButtonProductDropdown();
        HomePage.clickNintendoProductCategory();
        HomePage.enterSearchText("Mario");
        HomePage.clickButtonSearch();
        HomePage.clickGenreFilterDropdown();
        HomePage.clickAdventureGameCategory();
        HomePage.sleep(2000);

        actualResult = HomePage.readCurrentSearchResultCount().replaceAll("[^0-9]", "");
        expectedResult = HomePage.readSearchResultNumber();

        Assert.assertTrue(
                actualResult.equals(expectedResult),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualResult,
                        expectedResult
                )
        );
    }
}
