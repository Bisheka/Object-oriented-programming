public class Document {

        String content;
        String title;

        public Document(String content,String title){
            this.content=content;
            this.title=title;
        }
        public void display(){
            System.out.println("Content:"+content);
            System.out.println("Title"+title);
        }
        public String getTitle(){
            return title;
}
    }

