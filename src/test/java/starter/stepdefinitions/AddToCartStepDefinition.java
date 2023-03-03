package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.ValidateFirst;
import starter.questions.ValidateSecond;
import starter.questions.ValidateTotal;
import starter.tasks.AddLaptopToCart;
import starter.tasks.AddTabletToCart;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddToCartStepDefinition {

    @When("add products to his shopping cart")
    public void add_products_to_his_shopping_cart() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
            AddLaptopToCart.laptop(),
                AddTabletToCart.tablet()

        );

    }
    @Then("should see the total price")
    public void should_see_the_total_price() throws InterruptedException {
        Thread.sleep(3000);
        theActorInTheSpotlight().should(
                seeThat("the price of the first product", ValidateFirst.price(), equalTo("$1,009.00")),
                seeThat("the price of the second  product", ValidateSecond.price(), equalTo("$299.99")),
                seeThat("the total price", ValidateTotal.total(), equalTo("$1,308.99"))

        );

    }

}
