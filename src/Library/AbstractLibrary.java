package Library;

public abstract class AbstractLibrary {
    private int cipher;
    private String author;
    private String name;
    private int age;
    private static int countBook = 0;

    public AbstractLibrary() {
        countBook++;
    }

    public AbstractLibrary(int cipher, String author, String name, int age) {

        this.author = author;
        this.name = name;
        this.age = age;
        this.cipher = cipher;
        countBook++;
    }

    public int getCipher() {
        return cipher;
    }

    public void setCipher(int cipher) {
        this.cipher = cipher;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCountBook() {
        return countBook;
    }

    public static void setCountBook(int countBook) {
        AbstractLibrary.countBook = countBook;
    }

    @Override
    public String toString() {
        return "Library.AbstractLibrary{" +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printCount(){
        System.out.println("Книги в количестве: " + countBook + " шт");
    }



//    public abstract void bookDistribution(Library.AbstractLibrary abstractLibrary);
}
