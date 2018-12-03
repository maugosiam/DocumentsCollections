import java.util.Comparator;
//import...

public class AuthorsComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Author authorFirst = (Author) o1;
        Author authorSecond = (Author) o2;

        if (authorFirst.getId() > authorSecond.getId()){
            return -1;
        }
        else
            return 1;
    }
}
