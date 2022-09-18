package lt.aleksandras.pom.pages.gameroom;

import lt.aleksandras.pom.pages.Common;
import lt.aleksandras.pom.pages.Locators;
import org.testng.annotations.Test;

public class LoginPage {

    public static void open() {
        Common.openUrl("https://gameroom.lt/lt/prisijungimas");
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickButtonLogin() {
        Common.leftClick(Locators.Gameroom.Login.buttonLogin);
    }

    public static String readErrorLoginMessage() {
        return Common.getElementText(Locators.Gameroom.Login.errorLoginMessage);
    }

    public static void enterEmailText(String emailText) {
        Common.sendKeysToElement(Locators.Gameroom.Login.inputEmail, emailText);
    }

    public static void enterPasswordText(String passwordText) {
        Common.sendKeysToElement(Locators.Gameroom.Login.inputPassword, passwordText);
    }
}
