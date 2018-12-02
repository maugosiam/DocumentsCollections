public class MediaDoc extends Documents implements TestInteface {

    private double imageDimensionHeight;
    private double imageDimensionWidth;

    public MediaDoc(Author author, String docName, String description, double fileSize, double imageDimensionHeight, double imageDimensionWidth) {
        super(author, docName, description, fileSize);
        this.imageDimensionHeight = imageDimensionHeight;
        this.imageDimensionWidth = imageDimensionWidth;
    }

    @Override
    public void druk(){
        System.out.println("Test działania interface'u in MediaDoc");
    }
}
