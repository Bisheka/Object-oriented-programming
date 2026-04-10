public class Printer {

        public void printer(Document doc){
            System.out.println("Printing started.."+doc.getTitle());
            doc.display();
            System.out.println("Printing completed");
}
    }

