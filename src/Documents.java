/*
Imagine you're writing a Content Management system - this system will store four types of documents (and the Meta/Index information for them)

        PDFs (who created, description, file size)
        Word documents (who created, description, file size)
        Pictures (who created, description, image dimensions, file size)
        Videos (who created, description, image dimensions, file size, duration)
        And  you're asked to add a few features:

        Checking to see whether the file size is beyond a certain threshold.
        Checking to see whether it's too high of resolution of video/picture.
        Each file is created by specific User with Name, Surname, id and address.
        There are 4 types of users: Regular, Admin, NotRegistered with different access level (from 1 to 4)
        You have to implement these function and build UML diagram for the structure. Try to use abstraction as well))
*/

public abstract class Documents{

    private  String description;
    private  double fileSize;
    private String docName;
    Author author;

    public Documents( Author author, String docName, String description, double fileSize) {
        this.author = author;
        this.docName = docName;
        this.description = description;
        this.fileSize = fileSize;
    }

    public String getDescription() {
        return description;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getDocName() {
        return docName;
    }

    public boolean isFileSizeTooBig(){
        return fileSize>10;
    }
}
