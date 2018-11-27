public class WordDoc extends TextDoc implements TestInteface{

    public WordDoc(String docName, String description, double fileSize) {
        super(docName, description, fileSize);
    }

    @Override
    public void druk(){
        System.out.println("Test działania interface'u w WordDoc");
    }
}
