package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.UI.ShoppingCartUI;

public class ValidateFirst implements Question<String> {

    public static ValidateFirst price(){return new ValidateFirst();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCartUI.PRICE_FIRST_PRODUCT).getText();
    }
}
