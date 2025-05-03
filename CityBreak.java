package EntertainmentDatabaseSystem;

	public class CityBreak extends EntertainmentDatabaseSystem {
	     protected String city;
	     protected String Country;
	     protected double duration;

	public CityBreak(String title,int ID,double price, String city, String Country, double duration){
	     super (title, ID, price);
	     this.city = city;
	     this.Country = Country;
	     this.duration = duration;}
	     
	public String getcity() {return city;}

	public String getCountry() {return Country;}

	public double getduration() {return duration;}

	public void setcity(String city) {this.city = city;}
	public void setCountry(String country) {this.Country = country;}
	public void setduration(double duration) {this.duration = duration;}

	@Override
	public String toString() {
	    return "ID" + ", \"" +title + "\", £" + price + ", " + city + ", " + Country + ", " + duration;
	    }
	}

