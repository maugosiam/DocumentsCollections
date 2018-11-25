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

    public void createWordDoc(String docName, String description, double fileSize){
        new WordDoc(docName, description, fileSize);
    }
    public void createPdfDoc(String docName, String description, double fileSize){
        new PdfDoc(docName, description, fileSize);
    }

    public void createPictureDoc(String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth){
        new PictureDoc(docName, description, fileSize, imageDimesionHeight, imageDimesionHeight);
    }
    public void createVideoDoc(String docName, String description, double fileSize, double imageDimesionHeight, double imageDimensionWidth, double videoDuration){
        new VideoDoc(docName, description, fileSize, imageDimesionHeight, imageDimensionWidth, videoDuration);
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
