package data.model;

public class Logs 
{
	private boolean rollable;
	private String color;
	private int tons;
	
	public Logs()
	{
		this.rollable = false;
		this.color = "Red";
		this.tons = 1000;
	}

	public boolean isRollable() 
	{
		return rollable;
	}

	public void setRollable(boolean rollable) 
	{
		this.rollable = rollable;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getTons() 
	{
		return tons;
	}

	public void setTons(int tons) 
	{
		this.tons = tons;
	}

}
