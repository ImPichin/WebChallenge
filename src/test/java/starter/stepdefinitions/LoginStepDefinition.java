package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.questions.ValidateUser;
import starter.tasks.DoLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) is on the advantageDemo home page")
    public void is_on_the_advantageDemo_home_page(String name) {
        theActorCalled(name).attemptsTo(NavigateTo.theAdvantageDemoHomePage());
    }
    @When("he login with his credentials")
    public void he_login_with_his_credentials() throws InterruptedException {
        Thread.sleep(1000);
        theActorInTheSpotlight().attemptsTo(DoLogin.withCredentials("Juanitotest1", "Testing1"));
    }
    @Then("he should see his username")
    public void he_should_see_his_username() {
        theActorInTheSpotlight().should(
                seeThat("his displayed username", ValidateUser.validateUser(), equalTo("Juanitotest1"))
        );
    }

}
