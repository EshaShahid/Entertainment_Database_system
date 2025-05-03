package EntertainmentDatabaseSystem;

public class Concert extends EntertainmentDatabaseSystem {
private String detailsOfTheProgram; 
private String Location;
private String date;

    public Concert(String title, int ID, double price, String detailsOfTheProgram, String Location, String date ) {
        super(title, ID, price);
        this.detailsOfTheProgram = detailsOfTheProgram;
        this.Location = Location;
        this.date = date;
    }

    public String getdetailsOfTheProgram() {
        return detailsOfTheProgram;
    }

    public String getLocation() {
        return Location;
    }

    public String getdate() {
        return date;
    }

    public void setdetailsOfTheProgram(String detailsOfTheProgram) {
        this.detailsOfTheProgram = detailsOfTheProgram;
    }

    public void setLocation(String Location) { 
        this.Location = Location;
    }

    public void setdate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
    	 return ID + ", \"" + title + "\", £" + price + ", " + detailsOfTheProgram + ", " + Location + ", " + date;
    }



}

