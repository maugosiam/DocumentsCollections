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

    public WordDoc createWordDoc(String docName, String description, double fileSize){
        return new WordDoc(docName, description, fileSize);
    }
    public PdfDoc createPdfDoc(String docName, String description, double fileSize){
        return new PdfDoc(docName, description, fileSize);
    }

    public PictureDoc createPictureDoc(String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth){
        return new PictureDoc(docName, description, fileSize, imageDimesionHeight, imageDimesionHeight);
    }
    public VideoDoc createVideoDoc(String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth, double videoDuration){
        return new VideoDoc(docName, description, fileSize, imageDimesionHeight, imageDimensionWidth, videoDuration);
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

    public String getAddress() {
        return address;
    }

    public void modifyFile(){

    }
    public void deleteFile(){

    }



}
