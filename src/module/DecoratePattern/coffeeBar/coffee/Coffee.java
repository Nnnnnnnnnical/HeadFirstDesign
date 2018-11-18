package module.DecoratePattern.coffeeBar.coffee;

import module.DecoratePattern.coffeeBar.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {//调用获取价格
        return super.getPrice();
    }
}
