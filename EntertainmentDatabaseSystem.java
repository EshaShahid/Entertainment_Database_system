package EntertainmentDatabaseSystem;

	abstract class EntertainmentDatabaseSystem {
	    protected String title;
	    protected int ID;
	    protected double price;

	    public EntertainmentDatabaseSystem (String title,int ID,double price){
	        this.title = title;
	        this.ID = ID;
	        this.price = price;
	        }

	public String gettitle()
	{return title;}

	public int getID()
	{return ID;}

	public double getprice()
	{return price;}

	public void SetTitle(String title )
	{this.title = title;}

	public void SetID(int ID)
	{this.ID = ID;}

	public void Setprice(double price)
	{this.price = price;}

	@Override
	public abstract String toString();

	}

