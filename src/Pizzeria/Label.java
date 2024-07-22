package Pizzeria;

public class Label {
    private AbstractPizzeria abstractPizzeria;


    public void delivery(AbstractPizzeria abstractPizzeria){
        System.out.println(abstractPizzeria.toString());
    }

    public void getReady(AbstractPizzeria abstractPizzeria){
        System.out.println( "готовится пицца " + abstractPizzeria.toString());
    }

}
