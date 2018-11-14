package module.StrategyPattren.Duck;

import module.StrategyPattren.FlyBehavior.FlyBehavior;
import module.StrategyPattren.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(){}

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.Quack();
    }
}
