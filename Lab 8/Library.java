public class Library {
    private String libraryName;
    private Book[] books=new Book[3];
    private int bookCount=0;

    public Library(String libraryName) {
        this.libraryName=libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void addBook(Book book) {
       if(bookCount<books.length) {
           books[bookCount++]=book;
           book.setLibrary(this);
       }
       else {
           System.out.println("Cannot add more books.");
       }
    }

    public void displayLibraryDetails() {
        System.out.println("Library Name:" + libraryName);
        for(int i=0; i<bookCount; i++) {
            books[i].displayBookDetails();
            System.out.println();
        }
    }



}
