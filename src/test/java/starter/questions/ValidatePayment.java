package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.UI.OrderPaymentUI;

public class ValidatePayment implements Question<String> {

    public static ValidatePayment sucess(){return new ValidatePayment();}

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(OrderPaymentUI.TXT_THANK_YOU).getText();
    }
}
