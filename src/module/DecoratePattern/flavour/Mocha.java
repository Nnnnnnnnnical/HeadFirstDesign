package module.DecoratePattern.flavour;

import module.DecoratePattern.Beverage;
import module.DecoratePattern.CondimentDecorator;

//摩卡 是一个装饰者，扩展自CondimentDecorator
public class Mocha extends CondimentDecorator{

    Beverage beverage;  //实例饮料，被装饰者。 调料附属于饮料

    static final Double TALL_COST = 0.1;

    static final Double GRANDE_COST = 0.15; //大的

    static final Double VENTI_COST = 0.2;    //超大杯

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 摩卡";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        int size = getSize();
        if (size == Beverage.TALL) {
            cost += TALL_COST;
        } else if (size == Beverage.GRANDE) {
            cost += GRANDE_COST;
        } else if (size == Beverage.VENTI) {
            cost += VENTI_COST;
        }
        return cost;
    }
}
