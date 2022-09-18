package lt.aleksandras.pom.pages.gameroom;

import lt.aleksandras.pom.pages.Common;
import lt.aleksandras.pom.pages.Locators;

public class ProducersPage {

    public static void open() {
        Common.openUrl("https://gameroom.lt/lt/gamintojai");
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickActivisionProducer() {
        Common.leftClick(Locators.Gameroom.Producers.activisionProducer);
    }

    public static void clickFirstProducerProduct() {
        Common.leftClick(Locators.Gameroom.Producers.firstProducerProduct);
    }

    public static void waitForPopup() {
        Common.waitForElementToBeClickable(Locators.Gameroom.Producers.buttonClosePopup);
    }

    public static void clickClosePopup() {
        Common.leftClick(Locators.Gameroom.Producers.buttonClosePopup);
    }

    public static String readShoppingCartNumber() {
        return Common.getElementText(Locators.Gameroom.Producers.shoppingCartNumber);
    }
}
