package EntertainmentDatabaseSystem;

import java.util.ArrayList;

public class MainTask3 {
    private static ArrayList<Object> entertainmentList = new ArrayList<>();

    public static void main(String[] args) {
    	
        populateList();

        System.out.println("Initial Entries:");
        printList();

        
        CityBreak newCityBreak = new CityBreak("Vacation", 6799, 2000, "Karachi", "Pakistan", 9);
        System.out.println("\nAdding a new CityBreak:");
        addEntry(newCityBreak);

        
        System.out.println("\nAttempting to add a same entry:");
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
            entertainmentList.add(new TimeWithCelebrity("Shark Tank  " + i, 3000 + i, 2500 + i, "Celebrity" + i, "Event" + i, i % 2 == 0));
            entertainmentList.add(new Concert("Jamming Session #" + i, 4000 + i, 3500 + i, "Music" + i, "Venue" + i, "Contact" + i));
        }
    }

    // Method to print the list
    private static void printList() {
        for (Object entry : entertainmentList) {
            System.out.println(entry);
        }
    }

    // Method to add an entry
    private static void addEntry(Object entry) {
        if (entertainmentList.contains(entry)) {
            System.out.println("Entry already exists: " + entry);
        } else {
            entertainmentList.add(entry);
            System.out.println("Entry added: " + entry);
        }
    }

    // Method to remove an entry
    private static void removeEntry(Object entry) {
        if (entertainmentList.remove(entry)) {
            System.out.println("Entry removed: " + entry);
        } else {
            System.out.println("Entry not found: " + entry);
        }
    }
    
    public static void testAddEntry() {
        ArrayList<Object> testList = new ArrayList<>();
        CityBreak entry = new CityBreak("Test CityBreak", 1200, 1100, "TestCity", "TestCountry", 5);

        // Adding new entry
        testList.add(entry);
        if (testList.contains(entry)) {
            System.out.println("testAddEntry: Adding new entry - Passed");
        } else {
            System.out.println("testAddEntry: Adding new entry - Failed");
        }

        // Adding duplicate entry
        boolean added = testList.add(entry); // Shouldn't prevent adding duplicates in ArrayList
        if (!added || testList.size() == 1) {
            System.out.println("testAddEntry: Adding duplicate entry - Passed");
        } else {
            System.out.println("testAddEntry: Adding duplicate entry - Failed");
        }
    }
    
    public static void testRemoveEntry() {
        ArrayList<Object> testList = new ArrayList<>();
        CityBreak entry = new CityBreak("Test CityBreak", 1200, 1100, "TestCity", "TestCountry", 5);

        // Removing existing entry
        testList.add(entry);
        boolean removed = testList.remove(entry);
        if (removed && !testList.contains(entry)) {
            System.out.println("testRemoveEntry: Removing existing entry - Passed");
        } else {
            System.out.println("testRemoveEntry: Removing existing entry - Failed");
        }

        // Removing non-existing entry
        removed = testList.remove(entry); // Should return false
        if (!removed) {
            System.out.println("testRemoveEntry: Removing non-existing entry - Passed");
        } else {
            System.out.println("testRemoveEntry: Removing non-existing entry - Failed");
        }
    }  
}

