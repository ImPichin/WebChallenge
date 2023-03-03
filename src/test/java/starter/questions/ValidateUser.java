package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.UI.LoginUI;

public class ValidateUser implements Question<String>{
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LoginUI.TXT_TITLE_USERNAME).getText();
    }

    public static ValidateUser validateUser(){return new ValidateUser();}
}
