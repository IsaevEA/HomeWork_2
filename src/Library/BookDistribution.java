package Library;

import Library.Fiction;

public class BookDistribution {

    private Fiction[] fictions = new Fiction[10];
    private AbstractLibrary[]  abstractLibraries = new AbstractLibrary[10];
    private int count = 0;

    public void qddBookDistribution(AbstractLibrary abstractLibrary) {
        System.out.println(1);
        if (abstractLibrary.getCipher() == 1){
            System.out.println(2);
            if (count < fictions.length){
                System.out.println(3);

                count++;
            }
        }
    }

}
