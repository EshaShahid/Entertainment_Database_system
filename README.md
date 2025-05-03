Entertainment Database System (EDS)
Overview
This project is a Java-based prototype of an Entertainment Database System (EDS) designed for a travel and ticketing platform. It includes four categories of attractions:

City Breaks

Local Excursions

Time With Celebrity

Concerts

Each event type has specific attributes, with a shared base structure including ID, title, and price.

Implementation Details
Classes and Inheritance
Base Class: EntertainmentEvent (with fields: ID, title, price)

Subclasses:

CityBreak: adds city, country, duration

LocalExcursion: adds activityType, location, duration

TimeWithCelebrity: adds celebrityName, activityType, groupFlag

Concert: adds performer, location, date

Each class has:

Getter and setter methods (accessors/mutators)

A custom toString() method for formatted printing

Data Structures
Used:
ArrayList: for flexible storage, easy iteration, and dynamic resizing

Binary Tree: implemented to demonstrate sorted storage and faster search (by price or ID)

Why:
ArrayList: simple, allows indexed access, easier addition/removal

Binary Tree: efficient for sorted access and hierarchical storage

Comparison:

Feature	ArrayList	Binary Tree
Insertion	O(1) average	O(log n) (balanced)
Deletion	O(n) (if index known)	O(log n)
Search	O(n) linear	O(log n) (if balanced)
Sorting Needed	Yes	No (if inserted correctly)
Decision: Used both to showcase strengths of each.

Functionalities
Add / Remove entries

Handles duplicates and missing entries with validation

Find by ID

Retrieve all entries by price range

Sort entries by descending price

Print report using toString()

Challenges
Designing flexible class hierarchy without Java Collections (Unit 9 restriction)

Integrating Binary Tree structure with object-based data

Managing type-safe casting while retrieving from general data structures

How to Run
Compile Java files:
javac *.java

Run Main class:
java Main

Testing
Unit tests provided for:

Entry addition/removal

Find by ID

Price range queries

Sort (descending price)

Each test case checks for both valid and edge cases (e.g., missing entries, duplicates).
