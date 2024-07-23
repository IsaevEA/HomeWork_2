package Library;

public class Main {
    public static void main(String[] args) {
        Fiction fiction1 = new Fiction(2,"Пушкин", "поля", 2015);
        LegalLiterature legalLiterature = new LegalLiterature(1,"оля", "поля", 2022);
        TechnicalLiterature technicalLiterature1 = new TechnicalLiterature(1,"макс", "поля", 2022);
        LegalLiterature legalLiterature1 = new LegalLiterature(1,"мади", "поля", 2022);
        TechnicalLiterature technicalLiterature2= new TechnicalLiterature(1,"мирба", "поля", 2022);

        BookDistribution bookDistribution= new BookDistribution();
        bookDistribution.addBook(fiction1);
        bookDistribution.infoFiction();
        bookDistribution.addBook(legalLiterature);
        bookDistribution.infoLegalLiterature();
        bookDistribution.addBook(technicalLiterature1);
        bookDistribution.infoTechnicalLiterature();
        bookDistribution.search("макс");

    }
}