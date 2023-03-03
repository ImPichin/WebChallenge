package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.UI.LaptopsCategoryUI;
import starter.UI.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddLaptopToCart implements Task {

    public static AddLaptopToCart laptop(){return instrumented(AddLaptopToCart.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LaptopsCategoryUI.OPT_LAPTOPS_CATEGORY),
                Click.on(LaptopsCategoryUI.ENERGY_STAR_LAPTOP),
                Click.on(LaptopsCategoryUI.BTN_ADD_TO_CART),
                Click.on(LoginUI.BTN_HOME)

        );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
