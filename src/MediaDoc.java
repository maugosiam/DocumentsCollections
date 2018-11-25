public class MediaDoc extends Documents {

    private double imageDimensionHeight;
    private double imageDimensionWidth;

    public MediaDoc(String docName, String description, double fileSize, double imageDimensionHeight, double imageDimensionWidth) {
        super(docName, description, fileSize);
        this.imageDimensionHeight = imageDimensionHeight;
        this.imageDimensionWidth = imageDimensionWidth;
    }
}
