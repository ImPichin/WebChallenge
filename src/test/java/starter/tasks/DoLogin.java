package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import starter.UI.LoginUI;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static DoLogin withCredentials(String username, String password) {
        return Tasks.instrumented(DoLogin.class, username, password);
    }

    @Override
    @Step("Typing credentials TEST")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginUI.BTN_SIGN_UP),
                Enter.theValue(username).into(LoginUI.TEXT_BOX_USERNAME),
                Enter.theValue(password).into(LoginUI.TEXT_BOX_PASSWORD),
                Click.on(LoginUI.BTN_SIGN_UP_FORM)

        );
    }


}
