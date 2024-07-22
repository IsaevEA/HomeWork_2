package Pizzeria;

public abstract class AbstractPizzeria {
    private int price;
    private int weight;
    public abstract void cooking(AbstractPizzeria abstractPizzeria);



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public AbstractPizzeria(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public AbstractPizzeria() {
    }
}
