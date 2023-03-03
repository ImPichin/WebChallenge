package starter.UI;

import org.openqa.selenium.By;

public class ShoppingCartUI {

    public static By PRICE_FIRST_PRODUCT = By
            .xpath("(//p[@class=\"price roboto-regular ng-binding\"])[1]");
    public static By PRICE_SECOND_PRODUCT = By
            .xpath("(//p[@class=\"price roboto-regular ng-binding\"])[2]");
    public static By TOTAL_PRICE = By.
            xpath("//span[contains(text(),'TOTAL')]/following-sibling::span[@class='roboto-medium ng-binding']");
    public static By BTN_GO_TO_CART = By.id("shoppingCartLink");
    public static By BTN_CHECKOUT = By.xpath("//button[@data-ng-click=\"checkout()\"]");

}
