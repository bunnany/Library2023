
/**
 * Support class of Book
 * A book contains an id, name, author, qty, image
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;

    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }

}
