package se.thinkcode.testcon.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lt.Duota;
import cucumber.api.java.lt.Kai;
import cucumber.api.java.lt.Tada;
import se.thinkcode.testcon.CoffeeMachine;

import static org.junit.Assert.assertTrue;

public class CoffeeMachineSteps {
    private CoffeeMachine coffeeMachine;

    @Given("^there are (\\d+) coffees left in the machine$")
    public void there_are_coffees_left_in_the_machine(int coffees) throws Throwable {
        coffeeMachine = new CoffeeMachine(coffees);
    }

    @Given("^I have deposited (\\d+) EUR$")
    public void i_have_deposited_RON(int amount) throws Throwable {
        coffeeMachine.deposit(amount);
    }

    @When("^I press the coffee button$")
    public void i_press_the_coffee_button() throws Throwable {
        coffeeMachine.orderCoffee();
    }

    @Then("^I should be served a coffee$")
    public void i_should_be_served_a_coffee() throws Throwable {
        assertTrue("Coffee should have been served", coffeeMachine.wasCoffeeServed());
    }

    @Duota("^į tai, kad mašinoje paliekama (\\d+) kavos$")
    public void i_tai_kad_masinoje_paliekama_kavos(int coffees) throws Exception {
        coffeeMachine = new CoffeeMachine(coffees);
    }

    @Duota("^padėjote (\\d+) EUR$")
    public void padejote_EUR(int amount) throws Exception {
        coffeeMachine.deposit(amount);
    }

    @Kai("^paspaudžiu kavos mygtuką$")
    public void paspaudziu_kavos_mygtuka() throws Exception {
        coffeeMachine.orderCoffee();
    }

    @Tada("^aš turėčiau būti įteiktas kavos$")
    public void as_tureciau_buti_iteiktas_kavos() throws Exception {
        assertTrue("Coffee should have been served", coffeeMachine.wasCoffeeServed());
    }
}
