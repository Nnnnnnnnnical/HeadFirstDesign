package module.DecoratePattern.coffeeBar.decorator;

import module.DecoratePattern.coffeeBar.Drink;

public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        super.setDescription("酱油");
        super.setPrice(2.2f);
    }
}
