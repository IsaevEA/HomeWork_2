package Pizzeria;

public class Pepperoni extends AbstractPizzeria{
    private boolean isSharpness;


    public Pepperoni(int price, int weight) {
        super(price, weight);
    }

    public boolean isSharpness() {
        return isSharpness;
    }

    public void setSharpness(boolean sharpness) {
        isSharpness = sharpness;
    }

    public Pepperoni(int price, int weight, boolean sharpness) {
        super(price, weight);
        this.isSharpness = sharpness;
    }


    @Override
    public void cooking(AbstractPizzeria abstractPizzeria) {
        if (isSharpness){
            setSharpness(false);
        }else {
            setSharpness(true);
        }
    }

    @Override
    public String toString() {
        return "Pepperoni{" +
                "sharpness=" + isSharpness +
                ", price=" + super.getPrice() +
                ", weght= " + super.getWeight() +
                '}';
    }

}
