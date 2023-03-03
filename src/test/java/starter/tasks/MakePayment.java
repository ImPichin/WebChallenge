package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.UI.OrderPaymentUI;
import starter.UI.ShoppingCartUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakePayment implements Task {

    private final String safepayUsername;
    private final String safepayPassword;

    public MakePayment(String safepayUsername, String safepayPassword){
        this.safepayUsername = safepayUsername;
        this.safepayPassword = safepayPassword;
    }

    public static MakePayment ofHisShoppingCart(String safepayUsername, String safepayPassword){
        return instrumented(MakePayment.class, safepayUsername, safepayPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartUI.BTN_CHECKOUT),
                Click.on(OrderPaymentUI.BTN_NEXT),
                Clear.field(OrderPaymentUI.TXT_SAFEPAY_USERNAME),
                Enter.theValue(safepayUsername).into(OrderPaymentUI.TXT_SAFEPAY_USERNAME),
                Clear.field(OrderPaymentUI.TXT_SAFEPAY_PASSWORD),
                Enter.theValue(safepayPassword).into(OrderPaymentUI.TXT_SAFEPAY_PASSWORD),
                Click.on(OrderPaymentUI.CHECK_BOX_SAVE_CHANGES),
                Click.on(OrderPaymentUI.BTN_PAY_NOW)

        );

    }
}
