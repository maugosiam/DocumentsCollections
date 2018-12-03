import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AuthorsCollectionTreeSet {

    Set<Author> authorTreeSet = new TreeSet<>(new AuthorsComparator());

//for some reason it doesnt work. to clarify!
/*@Override
public String toString() {
    return  "TreeSet";
}*/
}
