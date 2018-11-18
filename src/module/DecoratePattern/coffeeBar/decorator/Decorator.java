package module.DecoratePattern.coffeeBar.decorator;

import module.DecoratePattern.coffeeBar.Drink;
import module.DecoratePattern.coffeeBar.coffee.Coffee;

import java.util.Calendar;

public class Decorator extends Coffee{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + drink.getDescription();
    }
}
