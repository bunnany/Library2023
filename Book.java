
/**
 * Support class of Book
 * A book contains an name, author, qty, image
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables
    private String name;
    private String author;
    private int quantity;
    private String image;
    private static final String DEFAULT_IMAGE = "book_face.jpg";
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String nm, String auth, int qty, String img)
    {
        // initialise instance variables
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        if (img == null) {
            this.image = DEFAULT_IMAGE;
        } else {
            this.image = img;
        }
    }
    
    /**
     * Constructor overloading for objects of class Book
     */
    public Book(String nm, String auth, int qty)
    {
        // initialise instance variables
        this(nm, auth, qty, DEFAULT_IMAGE);
    }

}
