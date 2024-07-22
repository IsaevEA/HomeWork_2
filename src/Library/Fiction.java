package Library;

public class Fiction extends AbstractLibrary {
    private AbstractLibrary abstractLibrary;
    private Fiction [] fictions = new Fiction[10];

    private int count = 0;

    public Fiction() {

    }

    public Fiction(int cipher, String author, String name, int age) {
        super(cipher, author, name, age);
    }




    public void addBookDistribution(AbstractLibrary abstractLibrary) {
        System.out.println(1);
        if (abstractLibrary.getCipher() == 1){
            System.out.println(2);
            if (count < fictions.length){
                System.out.println(3);

                count++;
            }
        }
    }

    public void info (){
        for (int i = 0; i < fictions.length; i++) {
            if (fictions[i] != null){
                System.out.println(i);
            }
        }
    }


}
