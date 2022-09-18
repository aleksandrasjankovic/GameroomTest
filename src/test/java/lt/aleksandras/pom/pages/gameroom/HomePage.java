package lt.aleksandras.pom.pages.gameroom;

import lt.aleksandras.pom.pages.Common;
import lt.aleksandras.pom.pages.Locators;

public class HomePage {

    public static void open() {
        Common.openUrl("https://gameroom.lt/lt/");
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickLanguageDropdown() {
        Common.leftClick(Locators.Gameroom.Home.languageDropdown);
    }

    public static void clickEnglishLanguage() {
        Common.leftClick(Locators.Gameroom.Home.englishDropdown);
    }

    public static void clickButtonSearch() {
        Common.leftClick(Locators.Gameroom.Home.buttonSearch);
    }

    public static void clickButtonProductDropdown() {
        Common.leftClick(Locators.Gameroom.Home.buttonProductDropdown);
    }

    public static void clickNintendoProductCategory() {
        Common.selectOptionsByValue(Locators.Gameroom.Home.buttonProductDropdown, "18");
    }

    public static void clickAdventureGameCategory() {
        Common.selectOptionsByValue(Locators.Gameroom.Home.genreFilterDropdown, "47");
    }

    public static void clickGenreFilterDropdown() {
        Common.leftClick(Locators.Gameroom.Home.genreFilterDropdown);
    }

    public static String readCurrentLanguage() {
        return Common.getElementText(Locators.Gameroom.Home.languageDropdown);
    }

    public static String readCurrentSearchResultTitle() {
        return Common.getElementText(Locators.Gameroom.Home.searchResultTitleText);
    }

    public static String readCurrentSearchResultCount() {
        return Common.getElementText(Locators.Gameroom.Home.searchResultCountText);
    }

    public static String readSearchResultNumber() {
        return Common.getElementCount(Locators.Gameroom.Home.searchResultList);
    }

    public static void enterSearchText(String searchText) {
        Common.sendKeysToElement(Locators.Gameroom.Home.searchBar, searchText);
    }


}
