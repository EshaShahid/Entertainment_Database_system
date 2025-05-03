package EntertainmentDatabaseSystem;


import EntertainmentDatabaseSystem.CityBreak;
import EntertainmentDatabaseSystem.Concert;
import EntertainmentDatabaseSystem.LocalExcursion;
import EntertainmentDatabaseSystem.TimeWithCelebrity;

public class Main {
    public static void main(String[] args) {
        CityBreak cityBreak = new CityBreak("Lets Do some Business", 1213, 1183, "Karachi", "Pakistan", 10);
        LocalExcursion excursion = new LocalExcursion("Go Carting", 1599, 1256, "NorthNazimabad", "Karachi", 1);
        TimeWithCelebrity celebrityTime = new TimeWithCelebrity("SharktankPakistan", 968, 52, "Sanm Foster", "Investment", false);
        Concert concert = new Concert("KhudGarz Band", 1999, 400, "Pop Music", "Ocean Mall, Karachi", "033423898");

        System.out.println(cityBreak);
        System.out.println(excursion);
        System.out.println(celebrityTime);
        System.out.println(concert);
    }
}

