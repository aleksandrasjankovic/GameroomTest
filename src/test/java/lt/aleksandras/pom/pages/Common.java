package lt.aleksandras.pom.pages;

import lt.aleksandras.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static String getElementCount(By locator) {
        return String.valueOf(Driver.getDriver().findElements(locator).size());
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void leftClick(By locator) {
        WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());

        actions.click(element);
        actions.perform();
    }

    public static void selectOptionsByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(
                Driver.getDriver(),
                Duration.ofSeconds(10)
        );
        webDriverWait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public static void closeDriver() {
        Driver.quitDriver();
    }
}
