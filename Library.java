//this Class manages the collecction of books (adding, removing, searching)

import java.util.Scanner;

public class Library implements LibraryOperations{

    Book[] books = new Book[4];
    protected static int arrayCounter = 0;

    public Library(){
        super();

        for (int i = 0; i <books.length ; i++) {
            new Book();
        }
        System.out.println("------- Welcome in Library System -------");
        System.out.println("1. add a Book");
        System.out.println("1. remove a Book");
        System.out.println("1. search a Book");
        System.out.println("1. print only available Books");
        System.out.println("1. print all Books");
    }

Scanner scanner = new Scanner(System.in);

    public void addBook(Book book){
        books[arrayCounter] = book;
        arrayCounter++;
    }

    public void removeBook(String title){
        for (int i = 0; i <books.length ; i++) {
            if (books[i]!=null && books[i].getTitle().equals(title)){
                books[i] = null;
                System.out.println(title+" removed from the Database");
                return;
            }
        }
        System.out.println("*" +title+"* not found on Database");
      
    }

    public Book searchBook(String title){
        Book bookFound = null;
        for (Book items:books) {
            if (items!=null && items.getTitle().equals(title)){
                System.out.println("Book found in Database");
                bookFound = items;
                return bookFound;
            }
        }
        System.out.println("Sorry, *"+title+"* not found");
        return null;
    }

    public void printAvailableBooks(){
        for (Book items:books) {

            if (items!= null && items.getAvailable()){
                System.out.println(items);
                System.out.println("----------------");
            }
        }
    }
    public void printAllBooks(){
        for (Book items:books) {
            System.out.println(items);
            System.out.println("----------------");
        }
    }


}
