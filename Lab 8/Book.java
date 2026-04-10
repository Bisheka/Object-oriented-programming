public class Book {
    private String ISBN;
    private String title;
    private Library library;

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void displayBookDetails() {
        System.out.println("Book ISBN:" + ISBN);
        System.out.println("Book Title:" + title);
        if (library != null) {
            System.out.println("Library:" + library.getLibraryName());
        } else {
            System.out.println("Library not assigned");
        }
    }
}







