public class WordDoc extends TextDoc implements TestInteface{

    public WordDoc(Author author, String docName, String description, double fileSize) {
        super(author, docName, description, fileSize);
    }

    @Override
    public void druk(){
        System.out.println("Test działania interface'u w WordDoc");
    }
}
