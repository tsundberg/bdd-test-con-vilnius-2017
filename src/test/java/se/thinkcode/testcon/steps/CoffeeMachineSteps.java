package se.thinkcode.testcon.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lt.Duota;
import cucumber.api.java.lt.Kai;
import cucumber.api.java.lt.Tada;
import cucumber.api.java.ro.Atunci;
import cucumber.api.java.ro.Când;
import cucumber.api.java.ro.Datefiind;
import cucumber.api.java.ro.Datfiind;
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
}
