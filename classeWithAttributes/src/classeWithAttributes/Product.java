package classeWithAttributes;

public class Product {
	
	public Product(int id, String name, String despriction, double price, int stockAmount, String color)
	{
		System.out.println("Constructor metot oluþtu");
		this.id =id;
		this.name = name;
		this.despriction =despriction;
		this.price =price;
		this.stockAmount =stockAmount;
		this.color =color;
		
	}
	
	public Product() {
		System.out.println("Default olarak gelen boþ metot oluþtu");
		
	}
	
	private int id;
	private String name;
	private String despriction;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;  // Bub classtaki private olan ýd'yi , bu metottaki ýd'ye ata.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDespriction() {
		return despriction;
	}
	public void setDespriction(String despriction) {
		this.despriction = despriction;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return this.name.substring(0,1) + id;
	}

}
