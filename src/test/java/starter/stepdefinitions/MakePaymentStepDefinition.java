package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidatePayment;
import starter.tasks.MakePayment;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class MakePaymentStepDefinition {

    @When("he makes the payment for his products")
    public void he_makes_the_payment_for_his_products() {
        theActorInTheSpotlight().attemptsTo(
                MakePayment.ofHisShoppingCart("Juanitotest", "Testing1")
        );
    }
    @Then("should see the order payment")
    public void should_see_the_order_payment() throws InterruptedException {
        Thread.sleep(2000);
        theActorInTheSpotlight().should(
                seeThat("the message of sucess payment",
                        ValidatePayment.sucess(),
                        equalTo("Thank you for buying with Advantage"))
        );
    }

}
