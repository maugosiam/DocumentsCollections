import java.util.ArrayList;

public class Program {

    public static void main (String[] args){

        AuthorsCollectionArrayList authors = new AuthorsCollectionArrayList();
        authors.authorArrayList.add(new ReadOnly("Adam", "Badowski", 1, "ul.Sezamkowa 14, Warszawa"));
        authors.authorArrayList.add(new CanModify("Cezary", "Duda", 2, "266 Broadway Str, New York"));
        authors.authorArrayList.add(new FullRights("Edyta", "Fijałkiewicz", 3, "ul.Kraciasta 23/5, Słupsk"));


        for (int i = 0; i<authors.authorArrayList.size();i++) {
            System.out.println("ELEMENT"+i+": "+authors.authorArrayList.get(i));
        }

        Documents[] documents = {
                authors.authorArrayList.get(0).createWordDoc(authors.authorArrayList.get(0), "tra la la la.doc", "Description of Word Document", 100),
                authors.authorArrayList.get(1).createPictureDoc(authors.authorArrayList.get(1), "picture of the elephant.jpg", "Description of Picture document", 700, 600, 900),
                authors.authorArrayList.get(2).createVideoDoc(authors.authorArrayList.get(2), "scary movie.mp4", "Description of Video document", 900, 80000, 900, 60)
        };

        ((WordDoc) documents[0]).druk();

        System.out.println(authors.authorArrayList.get(0).getLastName()+" created file: "+documents[0].getDocName()+" having hashcode: "+documents[0].hashCode());
        System.out.println(authors.authorArrayList.get(1).getLastName()+" created file: "+documents[1].getDocName()+" having hashcode: "+documents[1].hashCode());
        System.out.println(authors.authorArrayList.get(2).getLastName()+" created file: "+documents[2].getDocName()+" having hashcode: "+documents[2].hashCode());

        ((WordDoc) documents[0]).druk();

        AuthorsCollectionTreeSet authorTS = new AuthorsCollectionTreeSet();
        authorTS.authorTreeSet.add(new ReadOnly("Adam", "Badowski", 1, "ul.Sezamkowa 14, Warszawa"));
        authorTS.authorTreeSet.add(new CanModify("Cezary", "Duda", 2, "266 Broadway Str, New York"));
        authorTS.authorTreeSet.add(new FullRights("Edyta", "Fijałkiewicz", 3, "ul.Kraciasta 23/5, Słupsk"));
        //System.out.println(authorTS.authorTreeSet);



    }
}