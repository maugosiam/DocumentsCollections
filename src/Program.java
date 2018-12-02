import java.util.ArrayList;

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

        ArrayList<Author> authors = new ArrayList();
        authors.add(new ReadOnly("Adam", "Badowski", 1, "ul.Sezamkowa 14, Warszawa"));
        authors.add(new CanModify("Cezary", "Duda", 2, "266 Broadway Str, New York"));
        authors.add(new FullRights("Edyta", "Fijałkiewicz", 3, "ul.Kraciasta 23/5, Słupsk"));

        for (int i = 0; i<authors.size();i++) {
            System.out.println("ELEMENT"+i+": "+authors.get(i));
        }

        Documents[] documents = {
                authors.get(0).createWordDoc("tra la la la.doc", "Description of Word Document", 100),
                authors.get(1).createPictureDoc("picture of the elephant.jpg", "Description of Picture document", 700, 600, 900),
                authors.get(2).createVideoDoc("scary movie.mp4", "Description of Video document", 900, 80000, 900, 60)
        };

        ((WordDoc) documents[0]).druk();

        System.out.println(authors.get(0).getLastName()+" created file: "+documents[0].getDocName()+" having hashcode: "+documents[0].hashCode());
        System.out.println(authors.get(1).getLastName()+" created file: "+documents[1].getDocName()+" having hashcode: "+documents[1].hashCode());
        System.out.println(authors.get(2).getLastName()+" created file: "+documents[2].getDocName()+" having hashcode: "+documents[2].hashCode());

        ((WordDoc) documents[0]).druk();
    }
}
