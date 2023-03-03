package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.UI.ShoppingCartUI;

public class ValidateTotal implements Question<String> {

    public static ValidateTotal total(){return new ValidateTotal();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCartUI.TOTAL_PRICE).getText();
    }
}
