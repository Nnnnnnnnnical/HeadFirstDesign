package module.DecoratePattern.coffeeBar.decorator;

import module.DecoratePattern.coffeeBar.Drink;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("牛奶");
        super.setPrice(2.2f);
    }
}
