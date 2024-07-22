/*
this class contains Information about a book (title, author, ISBN, availability)
 */

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean getAvailable(){
        return available;
    }

    //toString
    @Override
    public String toString(){
        return "Title : "+getTitle()+"\n" + "author : "+getAuthor()+"\n"
                + "ISBN of the Book : "+getIsbn()+"\n"+"Availability : "+getAvailable();
    }
}
