package EntertainmentDatabaseSystem;

public class LocalExcursion extends EntertainmentDatabaseSystem {
    protected String typeOfActivity; 
    protected String location;
    protected double duration;

    public LocalExcursion(String title, int ID, double price, String typeOfActivity, String location, double duration) {
        super(title, ID, price);
        this.typeOfActivity = typeOfActivity;
        this.location = location;
        this.duration = duration;
    }

    public String getTypeOfActivity() {
        return typeOfActivity;
    }

    public String getLocation() {
        return location;
    }

    public double getDuration() {
        return duration;
    }

    public void setTypeOfActivity(String typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public void setLocation(String location) { 
        this.location = location;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
    	return ID + ", \"" + title + "\", £" + price + ", " + typeOfActivity + ", " + location + ", " + duration + " hours";
    
    }
}


