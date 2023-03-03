package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.UI.LaptopsCategoryUI;
import starter.UI.ShoppingCartUI;
import starter.UI.TabletsCatagoryUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddTabletToCart implements Task {

    public static AddTabletToCart tablet(){return instrumented(AddTabletToCart.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TabletsCatagoryUI.OPT_TABLETS_CATEGORY),
                Click.on(TabletsCatagoryUI.ELITE_TABLET),
                Click.on(LaptopsCategoryUI.BTN_ADD_TO_CART),
                Click.on(ShoppingCartUI.BTN_GO_TO_CART)
        );

    }
}
