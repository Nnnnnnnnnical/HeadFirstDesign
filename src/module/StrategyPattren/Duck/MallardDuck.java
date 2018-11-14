package module.StrategyPattren.Duck;

import module.StrategyPattren.FlyBehavior.FlyBehavior;
import module.StrategyPattren.FlyBehavior.FlyWithWings;
import module.StrategyPattren.QuackBehavior.Quack;
import module.StrategyPattren.QuackBehavior.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
