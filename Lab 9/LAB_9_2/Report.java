package LAB_9_2;

class Report implements Printable {
    private String title;
    private String author;

    public Report(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println("Report Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-----------------------------");
    }
}