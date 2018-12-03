public class Author {

    private String firstName;
    private String lastName;
    private int id;
    private String address;


    public Author(String firstNam, String lastName, int id, String address) {
        this.firstName = firstNam;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public WordDoc createWordDoc(Author author, String docName, String description, double fileSize){
        return new WordDoc(author, docName, description, fileSize);
    }
    public PdfDoc createPdfDoc(Author author, String docName, String description, double fileSize){
        return new PdfDoc(author, docName, description, fileSize);
    }

    public PictureDoc createPictureDoc(Author author, String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth){
        return new PictureDoc(author, docName, description, fileSize, imageDimesionHeight, imageDimensionWidth);
    }
    public VideoDoc createVideoDoc(Author author, String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth, double videoDuration){
        return new VideoDoc(author, docName, description, fileSize, imageDimesionHeight, imageDimensionWidth, videoDuration);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "id=" + id + "|" +
                firstName + '|' +
                lastName + '|' +
                address ;
    }
}
