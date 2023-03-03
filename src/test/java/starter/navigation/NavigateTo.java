package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAdvantageDemoHomePage() {
        return Task.where("{0} opens the advantageDemo home page",
                Open.browserOn().the(AdvantageDemoHomePage.class));
    }
}
