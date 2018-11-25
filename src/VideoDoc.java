public class VideoDoc extends MediaDoc {

    private double videoDuration;

    public VideoDoc(String docName, String description, double fileSize, double imageDimensionHeight, double imageDimesionWidth, double videoDuration) {
        super(docName, description, fileSize, imageDimensionHeight, imageDimesionWidth);
        this.videoDuration = videoDuration;

    }




}
