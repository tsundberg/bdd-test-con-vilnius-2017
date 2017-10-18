package se.thinkcode.testcon;

public class CoffeeMachine {
    private boolean served;

    public CoffeeMachine(int coffees) {
    }

    public void deposit(int amount) {
        if (amount == 1) {
            served = true;
        }
    }

    public void orderCoffee() {
    }

    public boolean wasCoffeeServed() {
        return served;
    }
}
