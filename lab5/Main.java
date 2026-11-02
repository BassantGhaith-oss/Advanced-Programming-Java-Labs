import java.time.LocalDate;

class Book {
    private static int idCounter = 1;
    protected int id;
    protected String title;
    protected LocalDate releaseDate;
    protected double price;

    public Book(String title, LocalDate releaseDate, double price) {
        this.id = idCounter++;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title
                + ", Release Date: " + releaseDate
                + ", Price: $" + price;
    }

    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}

class TextBook extends Book {
    protected int numberOfPages;

    public TextBook(String title, LocalDate releaseDate,
                    double price, int numberOfPages) {
        super(title, releaseDate, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        System.out.println("MethodID: TS11");
        return super.toString() + ", Pages: " + numberOfPages;
    }

    public int getPageCount() {
        return numberOfPages;
    }
}

class FictionBook extends TextBook {
    private String genre;
    private String author;

    public FictionBook(String title, LocalDate releaseDate,
                       double price, int numberOfPages,
                       String genre, String author) {
        super(title, releaseDate, price, numberOfPages);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("MethodID: DI21");
        super.displayInfo();
        System.out.println("Subtype: FictionBook");
        System.out.println("Genre: " + genre);
        System.out.println("Author: " + author);
        System.out.println("========================");
    }

    public String getGenre() {
        return genre;
    }
}

class ScienceBook extends TextBook {
    private String field;
    private String difficultyLevel;

    public ScienceBook(String title, LocalDate releaseDate,
                       double price, int numberOfPages,
                       String field, String difficultyLevel) {
        super(title, releaseDate, price, numberOfPages);
        this.field = field;
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("MethodID: DI22");
        super.displayInfo();
        System.out.println("Subtype: ScienceBook");
        System.out.println("Field: " + field);
        System.out.println("Difficulty Level: " + difficultyLevel);
        System.out.println("========================");
    }

    public String getField() {
        return field;
    }
}

class AudioBook extends Book {
    protected double lengthInMinutes;

    public AudioBook(String title, LocalDate releaseDate,
                     double price, double lengthInMinutes) {
        super(title, releaseDate, price);
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public String toString() {
        System.out.println("MethodID: TS12");
        return super.toString() + ", Length: "
                + lengthInMinutes + " minutes";
    }

    public double getLength() {
        return lengthInMinutes;
    }
}

class Podcast extends AudioBook {
    private String host;
    private int episodeNumber;

    public Podcast(String title, LocalDate releaseDate,
                   double price, double lengthInMinutes,
                   String host, int episodeNumber) {
        super(title, releaseDate, price, lengthInMinutes);
        this.host = host;
        this.episodeNumber = episodeNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("MethodID: DI23");
        super.displayInfo();
        System.out.println("Subtype: Podcast");
        System.out.println("Host: " + host);
        System.out.println("Episode Number: " + episodeNumber);
        System.out.println("========================");
    }

    public String getHost() {
        return host;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }
}
public class Main{
    public static void main(String[] args){
        TextBook B1 = new TextBook("Java Programming", LocalDate.of(2021, 5, 10), 45.99, 500 );
        AudioBook B2 =new AudioBook("Learn Python Fast", LocalDate.of(2022, 7, 20), 15.99, 120 );
        FictionBook B3= new FictionBook("Harry Potter", LocalDate.of(1997, 6, 26), 39.99, 400, "Fantasy", "J.K. Rowling" );
        ScienceBook B4= new ScienceBook("Physics for Beginners", LocalDate.of(2020, 9, 15), 29.99, 350, "Physics", "Advanced");
        Podcast B5 = new Podcast("Tech Talk", LocalDate.of(2023, 3, 25), 5.99, 45, "John Doe", 10 );
        
        Book[] library = {B1,B2,B3,B4,B5};
         
        for (Book b : library){
            b.displayInfo();
        }
        
        for (Book b : library){
            System.out.println(b.toString());
        }

        for (Book b : library){
            if(b instanceof Podcast){
                Podcast p = (Podcast) b;
                System.out.println(p.getHost());
                System.out.println(p.getEpisodeNumber());
            }
            if(b instanceof TextBook){
                TextBook T = (TextBook) b;
                System.out.println(T.getPageCount());
            }
        }
        
    }
    
}
