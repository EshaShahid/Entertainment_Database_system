
	package EntertainmentDatabaseSystem;

	import java.util.TreeSet;

	public class MainTask3TreeMap {
	    private static TreeSet<Object> entertainmentList = new TreeSet<>(new EntryComparator());

	    public static void main(String[] args) {

	        populateList();

	        System.out.println("Initial Entries:");
	        printList();

	        CityBreak newCityBreak = new CityBreak("Vacation", 6799, 2000, "Karachi", "Pakistan", 9);
	        System.out.println("\nAdding a new CityBreak:");
	        addEntry(newCityBreak);

	        System.out.println("\nAttempting to add the same entry:");
	        addEntry(newCityBreak);

	        System.out.println("\nRemoving an existing entry:");
	        removeEntry(newCityBreak);

	        System.out.println("\nAttempting to remove a non-existing entry:");
	        removeEntry(newCityBreak);

	        System.out.println("\nFinal List of Entries:");
	        printList();

	        testAddEntry();
	        testRemoveEntry();
	    }

	    private static void populateList() {
	        for (int i = 0; i < 7; i++) {
	            entertainmentList.add(new CityBreak("CityBreak Number " + i, 1000 + i, 800 + i, "City" + i, "Country" + i, i));
	            entertainmentList.add(new LocalExcursion("Adventure #" + i, 2000 + i, 1800 + i, "Location" + i, "City" + i, i));
	            entertainmentList.add(new TimeWithCelebrity("Shark Tank " + i, 3000 + i, 2500 + i, "Celebrity" + i, "Event" + i, i % 2 == 0));
	            entertainmentList.add(new Concert("Jamming Session #" + i, 4000 + i, 3500 + i, "Music" + i, "Venue" + i, "Contact" + i));
	        }
	    }

	    private static void printList() {
	        for (Object entry : entertainmentList) {
	            System.out.println(entry);
	        }
	    }

	    private static void addEntry(Object entry) {
	        if (entertainmentList.add(entry)) {
	            System.out.println("Entry added: " + entry);
	        } else {
	            System.out.println("Entry already exists: " + entry);
	        }
	    }

	    private static void removeEntry(Object entry) {
	        if (entertainmentList.remove(entry)) {
	            System.out.println("Entry removed: " + entry);
	        } else {
	            System.out.println("Entry not found: " + entry);
	        }
	    }

	    public static void testAddEntry() {
	        TreeSet<Object> testList = new TreeSet<>(new EntryComparator());
	        CityBreak entry = new CityBreak("Test CityBreak", 1200, 1100, "TestCity", "TestCountry", 5);

	        // Adding new entry
	        if (testList.add(entry)) {
	            System.out.println("testAddEntry: Adding new entry - Passed");
	        } else {
	            System.out.println("testAddEntry: Adding new entry - Failed");
	        }

	        // Adding duplicate entry
	        if (!testList.add(entry)) {
	            System.out.println("testAddEntry: Adding duplicate entry - Passed");
	        } else {
	            System.out.println("testAddEntry: Adding duplicate entry - Failed");
	        }
	    }

	    public static void testRemoveEntry() {
	        TreeSet<Object> testList = new TreeSet<>(new EntryComparator());
	        CityBreak entry = new CityBreak("Test CityBreak", 1200, 1100, "TestCity", "TestCountry", 5);

	        // Removing existing entry
	        testList.add(entry);
	        if (testList.remove(entry)) {
	            System.out.println("testRemoveEntry: Removing existing entry - Passed");
	        } else {
	            System.out.println("testRemoveEntry: Removing existing entry - Failed");
	        }

	        // Removing non-existing entry
	        if (!testList.remove(entry)) {
	            System.out.println("testRemoveEntry: Removing non-existing entry - Passed");
	        } else {
	            System.out.println("testRemoveEntry: Removing non-existing entry - Failed");
	        }
	    }
	}


