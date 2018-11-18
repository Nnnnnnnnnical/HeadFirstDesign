package module.DecoratePattern.coffeeBar;

import module.DecoratePattern.coffeeBar.coffee.Decaf;
import module.DecoratePattern.coffeeBar.coffee.LongBlack;
import module.DecoratePattern.coffeeBar.decorator.Chocolate;
import module.DecoratePattern.coffeeBar.decorator.Milk;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println(order.cost());
        System.out.println(order.getDescription());
        System.out.println("*************************");

        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDescription());
    }
}
