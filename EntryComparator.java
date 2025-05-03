package EntertainmentDatabaseSystem;



import java.util.Comparator;

public class EntryComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}

