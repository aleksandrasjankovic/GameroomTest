package lt.aleksandras.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Gameroom {

        public static class Home {
            public static By languageDropdown = By.xpath("//*[@class='dropdown-toggle']");

            public static By englishDropdown = By.xpath("//*[@id='first-languages']//li[1]");

            public static By buttonProductDropdown = By.xpath("//*[@id='category_filter']");

            public static By genreFilterDropdown = By.xpath("//*[@id='selector-f8']");

            public static By searchResultList = By.xpath(
                    "//*[@class='product_list products-block grid  af-product-list style1 row']//li");

            public static By searchBar = By.xpath("//*[@id='pts_search_query_top']");

            public static By searchResultTitleText = By.xpath("//*[@class='lighter']");

            public static By searchResultCountText = By.xpath("//*[@class='heading-counter']");

            public static By buttonSearch = By.xpath(
                    "//*[@class='btn btn-default btn-primary button-search']");


        }

        public static class Login {
            public static By inputEmail = By.xpath("//*[@id='email']");

            public static By inputPassword = By.xpath("//*[@id='passwd']");

            public static By buttonLogin = By.xpath("//*[@id='SubmitLogin']");

            public static By errorLoginMessage = By.xpath("//*[@class='alert alert-danger']//ol//li[1]");
        }

        public static class Producers {
            public static By activisionProducer = By.xpath(
                    "(//*[@class='btn btn-default button exclusive-medium'])[8]");

            public static By firstProducerProduct = By.xpath(
                    "//*[@class='product_list products-block grid " +
                            " af-product-list style1']//li[1]//div[1]");
            public static By buttonClosePopup = By.xpath("//*[@class='cross']");

            public static By shoppingCartNumber = By.xpath("//*[@class='ajax_cart_quantity unvisible']");

        }
    }
}
