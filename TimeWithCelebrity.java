package EntertainmentDatabaseSystem;

public class TimeWithCelebrity extends EntertainmentDatabaseSystem {
protected String Celebrityname; 
protected String typeofactivity;
protected boolean flag;

    public TimeWithCelebrity(String title, int ID, double price, String Celebrityname, String typeofactivity, boolean flag) {
        super(title, ID, price);
        this.Celebrityname = Celebrityname;
        this.typeofactivity = typeofactivity;
        this.flag = flag;
    }

    public String getCelebrityname() {
        return Celebrityname;
    }

    public String gettypepfacitivty() {
        return typeofactivity;
    }

    public boolean getflag() {
        return flag;
    }

    public void setCelebrityname(String Celebrityname) {
        this.Celebrityname = Celebrityname;
    }

    public void settypeofactivity(String typeofactivity) { 
        this.typeofactivity = typeofactivity;
    }

    public void setflag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
    	return ID + ", \"" + title + "\", £" + price + ", " + Celebrityname + ", " + typeofactivity + ", " + flag;
    }
}


