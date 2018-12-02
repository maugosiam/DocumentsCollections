public class VideoDoc extends MediaDoc {

    private double videoDuration;

    public VideoDoc(Author author, String docName, String description, double fileSize, double imageDimensionHeight, double imageDimesionWidth, double videoDuration) {
        super(author, docName, description, fileSize, imageDimensionHeight, imageDimesionWidth);
        this.videoDuration = videoDuration;

    }




}
