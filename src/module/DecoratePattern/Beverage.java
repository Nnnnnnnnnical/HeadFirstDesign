package module.DecoratePattern;

public abstract class Beverage {
    public static final int TALL = 10;

    public static final int GRANDE = 20;

    public static final int VENTI = 30;

    public static Double TALL_COST;

    public static Double GRANDE_COST; //大的

    public static Double VENTI_COST;    //超大杯

    public String description = "Unknown Beverage";

    public int size = 10;//默认size是小杯

    public Beverage(){

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Beverage(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
