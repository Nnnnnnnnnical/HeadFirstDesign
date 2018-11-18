package module.DecoratePattern;

import module.DecoratePattern.coffee.DarkRoast;
import module.DecoratePattern.coffee.Espresso;
import module.DecoratePattern.coffee.HouseBlend;
import module.DecoratePattern.flavour.Mocha;
import module.DecoratePattern.flavour.Soy;
import module.DecoratePattern.flavour.Whip;
import org.junit.jupiter.api.Test;

public class TestStabuzzCoffee {

    public static void main(String[] args){
        Beverage beverage = new Espresso();     //一杯浓咖啡,没有调料
        System.out.println(beverage.getDescription() + " $" +beverage.cost());

        Beverage beverage1 = new DarkRoast();   //一杯焦糖咖啡
        beverage1.setSize(Beverage.VENTI);

        beverage1 = new Mocha(beverage1);       //焦糖咖啡 添加摩卡
        beverage1 = new Mocha(beverage1);       //焦糖咖啡 添加摩卡
        beverage1 = new Whip(beverage1);        //焦糖咖啡 添加奶油
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();  //首选咖啡
        beverage2 = new Soy(beverage2);         //添加调料 酱油
        beverage2 = new Mocha(beverage2);       //添加调料 摩卡
        beverage2 = new Whip(beverage2);        //添加调料 奶油
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

    @Test
    public void test1() {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.VENTI);
        System.out.println("$" +beverage.cost() +"-----------------"+ beverage.getDescription() );

        Beverage beverage2 = new Espresso();
        beverage2.setSize(Beverage.TALL);
        System.out.println("$" +beverage2.cost() +"-----------------"+ beverage2.getDescription() );

    }
}
