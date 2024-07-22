public class main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book();
        book1.setTitle("Book One Title");
        book1.setAuthor("Author of Book 1");
        book1.setIsbn("bah1");
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setTitle("Book two Title");
        book2.setAuthor("Author of Book 2");
        book2.setIsbn("bah2");
        book2.setAvailable(false);

        Book book3 = new Book();
        book3.setTitle("Book three Title");
        book3.setAuthor("Author of Book 3");
        book3.setIsbn("bah3");
        book3.setAvailable(true);

        Book book4 = new Book();
        book4.setTitle("Book four Title");
        book4.setAuthor("Author of Book 4");
        book4.setIsbn("bah4");
        book4.setAvailable(false);

        System.out.println("Number of Book added : "+Library.arrayCounter);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Number of Book added : "+Library.arrayCounter);
        System.out.println("-----------------");
        library.printAllBooks();


    }
}
