package module.DecoratePattern.coffee;

import module.DecoratePattern.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend() { //定义每种咖啡不同size的价格
        description = "首选咖啡";
        TALL_COST = 12.0;
        GRANDE_COST = 13.0;
        VENTI_COST = 15.0;
    }

    @Override
    public double cost() {  //返回浓咖啡的价格
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
