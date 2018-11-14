package module.StrategyPattren.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("<Slient>");
    }
}
