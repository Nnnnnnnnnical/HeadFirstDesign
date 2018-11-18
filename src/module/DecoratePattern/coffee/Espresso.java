package module.DecoratePattern.coffee;

import module.DecoratePattern.Beverage;

//浓咖啡，饮料抽象类的子类
public class Espresso extends Beverage {

    public Espresso(){
        description = "浓咖啡";
        TALL_COST = 8.0;
        GRANDE_COST = 12.0;
        VENTI_COST = 15.0;
    }

    @Override
    public double cost() {
        int size = getSize();
        if (size == Beverage.TALL) {
            description = "中杯 " + description;
            return TALL_COST;
        } else if (size == Beverage.GRANDE) {
            description = "大杯 " + description;
            return GRANDE_COST;
        } else if (size == Beverage.VENTI) {
            description = "超大杯 " + description;
            return VENTI_COST;
        }
        return TALL_COST;
    }
}
