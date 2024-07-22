package Pizzeria;

public class LaFinta extends AbstractPizzeria{

    private boolean IsWithMushrooms;


    public LaFinta(int price, int weight) {
        super(price, weight);
    }

    public boolean isWithMushrooms() {
        return IsWithMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        IsWithMushrooms = withMushrooms;
    }

    public LaFinta(int price, int weight, boolean sharpness) {
        super(price, weight);
        this.IsWithMushrooms = sharpness;
    }


    @Override
    public void cooking(AbstractPizzeria abstractPizzeria) {
        if (IsWithMushrooms){
            setWithMushrooms(false);
        }else {
            setWithMushrooms(true);
        }
    }

    @Override
    public String toString() {
        return "LaFanta{" +
                "IsWithMushrooms=" + IsWithMushrooms +
                ", price=" + super.getPrice() +
                ", weght= " + super.getWeight() +
                '}';
    }

}
