package data.model;

public class Customer 
{
	private String name;
	private int number;
	private boolean blind;
	
	public Customer()
	{
		this.name = "Joe";
		this.number = 7;
		this.blind = true;
	}
	
	public Customer(String name, int number, boolean blind)
	{
		this.name = name;
		this.number = number;
		this.blind = blind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isBlind() {
		return blind;
	}

	public void setBlind(boolean blind) {
		this.blind = blind;
	}
}
