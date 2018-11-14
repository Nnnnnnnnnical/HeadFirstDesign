package module.StrategyPattren;

import module.StrategyPattren.Duck.Duck;
import module.StrategyPattren.Duck.MallardDuck;

public class Main {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
