package Pizzeria;

public class Margarita extends Pepperoni{
    private boolean IsWithMeat;

    public Margarita(int price, int weight) {
        super(price, weight);
    }

    public Margarita(int price, int weight, boolean sharpness) {
        super(price, weight, sharpness);
    }
    @Override
    public void cooking(AbstractPizzeria abstractPizzeria) {
        if (IsWithMeat){
            IsWithMeat = false;
        }else {
            IsWithMeat = true;
        }
    }

    @Override
    public String toString() {
        return "Margarita{" +
                "IsWithMeat=" + IsWithMeat +
                ", price=" + super.getPrice() +
                ", weght= " + super.getWeight() +
                '}';
    }

}
