package Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(45, 65,true);
        pepperoni.cooking(pepperoni);
        System.out.println(pepperoni);

        Margarita margarita = new Margarita(24,45,false);
        margarita.cooking(margarita);
        System.out.println(margarita);

        Label label = new Label();
        label.delivery(pepperoni);
        label.getReady(pepperoni);


    }
}
