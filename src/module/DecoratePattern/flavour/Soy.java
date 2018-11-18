package module.DecoratePattern.flavour;

import module.DecoratePattern.Beverage;
import module.DecoratePattern.CondimentDecorator;

//调料，酱油
public class Soy extends CondimentDecorator{

    static final Double TALL_COST = 0.1;

    static final Double GRANDE_COST = 0.15; //大的

    static final Double VENTI_COST = 0.2;    //超大杯

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage; //饮料 被装饰者，每new一个调料都会在该饮料上添加

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 酱油";
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
