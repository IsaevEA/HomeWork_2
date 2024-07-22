package Library;

public abstract class AbstractLibrary {
    private int cipher;
    private String author;
    private String name;
    private int age;
    private static int count = 0;

    public AbstractLibrary() {
        count++;
    }

    public AbstractLibrary(int cipher, String author, String name, int age) {
        this.cipher = cipher;
        this.author = author;
        this.name = name;
        this.age = age;
        count++;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AbstractLibrary.count = count;
    }

    @Override
    public String toString() {
        return "Library.AbstractLibrary{" +
                "cipher=" + cipher +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printCount(){
        System.out.println("Книги в количестве: " + count + " шт");
    }



//    public abstract void bookDistribution(Library.AbstractLibrary abstractLibrary);
}
