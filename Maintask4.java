package EntertainmentDatabaseSystem;

/*
 * Initiating the name of the class as MainTask4 and creating its new instance as BinaryTree4 
 * that will be used to store all of the entries
 */
public class Maintask4 {
    private static BinaryTree4 entertainmentList = new BinaryTree4();

    // Populating the list of entries in this and will print the initial entries
    public static void main(String[] args) {
        populateList();

        
        
        System.out.println("Initial Entries:");
        entertainmentList.printTree(); // This will print all of the already present entries

        // This shows the search of single entry in multiple entries
        System.out.println("\nFinding an entry with reference number 1000:");
        Object entry = entertainmentList.findEntryByReferenceNumber(1000);
        if (entry != null) {
            System.out.println("Found entry: " + entry);
        } else {
            System.out.println("No entry found with reference number 1000");
        }

        // This shows the retrieval of entries by location
        System.out.println("\nRetrieving all entries observed at location 'Location1':");
        entertainmentList.retrieveEntriesByLocation("Location1");

        // Unit tests to check if the commands are working accordingly
        testFindEntryByReferenceNumber();
        testRetrieveEntriesByLocation();
    }

    // This will populate 28 entries in total, 7 entries for each of the 4 class
    private static void populateList() {
        for (int i = 0; i < 7; i++) {
            entertainmentList.add(new CityBreak("CityBreak Number " + i, 1000 + i, 800 + i, "City" + i, "Country" + i, i));
            entertainmentList.add(new LocalExcursion("Adventure #" + i, 2000 + i, 1800 + i, "Location" + i, "City" + i, i));
            entertainmentList.add(new TimeWithCelebrity("Shark Tank " + i, 3000 + i, 2500 + i, "Celebrity" + i, "Event" + i, i % 2 == 0));
            entertainmentList.add(new Concert("Jamming Session #" + i, 4000 + i, 3500 + i, "Music" + i, "Location" + i, "Contact" + i));
        }
    }

    // This code will search or find for the entry with the help of its reference number(1000)
    public static void testFindEntryByReferenceNumber() {
        System.out.println("\nUnit Test: testFindEntryByReferenceNumber");
        Object entry = entertainmentList.findEntryByReferenceNumber(1000);
        if (entry != null) {
            System.out.println("Test passed: Found entry: " + entry);
        } else {
            System.out.println("Test failed: No entry found for reference number 1000");
        }
    }

    //This code will search or find for the entry with the help of location
    public static void testRetrieveEntriesByLocation() {
        System.out.println("\nUnit Test: testRetrieveEntriesByLocation");
        entertainmentList.retrieveEntriesByLocation("Location1");
    }
}

// Initiating a class with the name BinaryTree4 with a instance root
class BinaryTree4 {
    private Node root;

    public void add(Object entry) { // In this we are adding a new entry
        root = addRecursive(root, entry);
    }

    // This will maintain the size of the tree if needed
    private Node addRecursive(Node current, Object entry) {
        if (current == null) {
            return new Node(entry);
        }
        // this will make sure the entry is added to its correct position using hashCode by comparison of entry with current nodes value
        if (entry.hashCode() < current.entry.hashCode()) {
            current.left = addRecursive(current.left, entry);
        } else if (entry.hashCode() > current.entry.hashCode()) {
            current.right = addRecursive(current.right, entry);
        }
        
        return current;
    }

    // Method to print the list of entries in order
    public void printTree() {
        inOrderTraversal(root);
    }

    // This will print the tree in sequence by recursively checking on its left and right side
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.entry);
            inOrderTraversal(node.right);
        }
    }

    // This will find entry by its reference number(ID)
    public Object findEntryByReferenceNumber(int referenceNumber) {
        return findEntryRecursive(root, referenceNumber);
    }

    // This will recursively check for the entry with the reference number
    private Object findEntryRecursive(Node current, int referenceNumber) {
        if (current == null) {// If the current node will be null than it will return null
            return null;
        }
        
        /*
         * Check if the current node's entry is an instance of CityBreak and will also check if the reference number matches 
         * the reference number(ID) of the CityBreak 
         */
        if (current.entry instanceof CityBreak && ((CityBreak) current.entry).getID() == referenceNumber) {
            return current.entry;
        }
        
        /*
         * Check if the current node's entry is an instance of LocalExcursion and will also check if the reference number matches 
         * the reference number(ID) of the LocalExcursion 
         */
        if (current.entry instanceof LocalExcursion && ((LocalExcursion) current.entry).getID() == referenceNumber) {
            return current.entry;
        }
        
        // If the result is not null then the entry will be found in the left subtree
        Object leftResult = findEntryRecursive(current.left, referenceNumber);
        if (leftResult != null) {
            return leftResult;
        }
        
        // If the entry was not found in the left subtree then the search will be continued but now in the right subtree.
        return findEntryRecursive(current.right, referenceNumber);
    }

    // This method will be used to retrieve entries by location.
    public void retrieveEntriesByLocation(String location) {
        System.out.println("Entries found for location " + location + ":");
        retrieveByLocationRecursive(root, location);
    }

    // This will recursively check for the entry with the location
    private void retrieveByLocationRecursive(Node current, String location) {
      
    	if (current != null) { // This will check if the current node is not null
            retrieveByLocationRecursive(current.left, location); // This will recursively search left side of the tree
            
            //Check if the current node's entry is an instance of LocalExcursion and if the location matches the entered location
            if (current.entry instanceof LocalExcursion && ((LocalExcursion) current.entry).getLocation().equals(location)) {
                System.out.println(current.entry); // This will print that entry that matches with the location
            }
            //Check if the current node's entry is an instance of Concert and if the location matches the entered location
            if (current.entry instanceof Concert && ((Concert) current.entry).getLocation().equals(location)) {
                System.out.println(current.entry);
            }
            retrieveByLocationRecursive(current.right, location); // This will recursively search right side of the tree
        }
    }

    // Nodes representation
    static class Node {
        Object entry;
        Node left;
        Node right;

        // This is the Constructor that initializes the node with a entry given 
        // This is the left and right sides are set to null
        Node(Object entry) {
            this.entry = entry;
            left = null;
            right = null;
        }
    }
}


