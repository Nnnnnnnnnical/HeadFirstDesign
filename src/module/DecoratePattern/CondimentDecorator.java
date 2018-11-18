package module.DecoratePattern;


public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();

    public abstract int getSize();

    public abstract double cost();
}
