package module.DecoratePattern.coffeeBar.decorator;

import module.DecoratePattern.coffeeBar.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("巧克力");
        super.setPrice(2.0f);
    }
}
