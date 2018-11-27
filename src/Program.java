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
public class Program {

    public static void main (String[] args){

        Author author[] = {
                new ReadOnly("A", "Badowski", 1, "ADDRAB"),
                new CanModify("C", "Duda", 2, "ADDRCD"),
                new FullRights("E", "Fijałkiewicz", 3, "ADDREF"),
        };

        Documents[] documents = {
                author[0].createWordDoc("tra la la la.doc", "Description of Word Document", 100),
                author[1].createPictureDoc("picture of the elephant.jpg", "Description of Picrure document", 700, 600, 900),
                author[2].createVideoDoc("scary movie.mp4", "Description of Video document", 900, 80000, 900, 60)
        };

        System.out.println(author[0].getLastName()+" created file: "+documents[0].getDocName()+" having hashcode: "+documents[0].hashCode());
        System.out.println(author[1].getLastName()+" created file: "+documents[1].getDocName()+" having hashcode: "+documents[1].hashCode());
        System.out.println(author[2].getLastName()+" created file: "+documents[2].getDocName()+" having hashcode: "+documents[2].hashCode());
    }
}
