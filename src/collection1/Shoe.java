package collection1;

public class Shoe {
	private int size;
	private int price;
	private String color;
	public void setSize(int size) {
		this.size=size;
	
	}
	public int size() {
		return size;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
		
	}
	public Shoe(int price,int size,String color) {
		this.price=price;
		this.size=size;
		this.color=color;
	}
	

}
