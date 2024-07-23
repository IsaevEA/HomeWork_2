package Library;

public class BookDistribution {

    private Fiction [] fictions = new Fiction[10];
    private LegalLiterature [] legalLiteratures = new LegalLiterature[10];
    private TechnicalLiterature [] technicalLiteratures = new TechnicalLiterature[10];

    private AbstractLibrary [] abstractLibraries = new AbstractLibrary[100] ;
    private int countFiction = 0;
    private int count = 0;

    private int countLegalLiterature = 0;
    private int countTechnicalLiterature = 0;

    public void addBook(AbstractLibrary abstractLibrary){
        if (abstractLibrary instanceof Fiction){
            if (countFiction < fictions.length){
                fictions[countFiction] = (Fiction) abstractLibrary;
                abstractLibraries[count] = fictions[countFiction];
                countFiction++;
                count++;

            }
        } else if (abstractLibrary instanceof LegalLiterature) {
            if (countLegalLiterature < legalLiteratures.length){
                legalLiteratures[countLegalLiterature] = (LegalLiterature) abstractLibrary;
                abstractLibraries[count] = legalLiteratures[countLegalLiterature];
                countLegalLiterature++;
                count++;
            }
        } else if (abstractLibrary instanceof TechnicalLiterature) {
            if (countTechnicalLiterature < technicalLiteratures.length){
                technicalLiteratures[countTechnicalLiterature] = (TechnicalLiterature) abstractLibrary;
                abstractLibraries[count] = technicalLiteratures[countTechnicalLiterature];
                countTechnicalLiterature++;
                count++;
            }
        }
    }


    public void infoFiction(){
        for (int i = 0; i < fictions.length; i++) {
            if (fictions[i] != null){
                System.out.println(fictions[i]);
            }
        }
    }
    public void infoLegalLiterature(){
        for (int i = 0; i < legalLiteratures.length; i++) {
            if (legalLiteratures[i] != null){
                System.out.println(legalLiteratures[i]);
            }
        }
    }
    public void infoTechnicalLiterature(){
        for (int i = 0; i < technicalLiteratures.length; i++) {
            if (technicalLiteratures[i] != null){
                System.out.println(technicalLiteratures[i]);
            }
        }
    }

    public void search(String nameAuthor){
        for (int i = 0; i < abstractLibraries.length; i++) {
            if (abstractLibraries[i] != null){
                if (abstractLibraries[i].getAuthor() == nameAuthor){
                    System.out.println("Книга которую вы искали: " + abstractLibraries[i]);
                }
            }
        }
    }


}
