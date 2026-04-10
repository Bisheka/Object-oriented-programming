public class LibrarySystem {
    public static void main(String[] args) {

        Library library= new Library("Nawala");
        Book book1= new Book("ILB456327","Reminders Of Him");
        Book book2=new Book("ITl6477833", "It Ends With Us");
        Book book3=new Book("KGT724210","November 9");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayLibraryDetails();
    }
}
