package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.UI.ShoppingCartUI;

public class ValidateSecond implements Question<String> {
    public static ValidateSecond price(){return new ValidateSecond();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ShoppingCartUI.PRICE_SECOND_PRODUCT).getText();
    }

}
