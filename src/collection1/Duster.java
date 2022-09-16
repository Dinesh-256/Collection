package collection1;

public class Duster {
	private int length;
	private int price;
	private String dusterType;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDusterType() {
		return dusterType;
	}
	public void setDusterType(String dusterType) {
		this.dusterType = dusterType;
	}
	public Duster(int length, int price, String dusterType) {
		
		this.length = length;
		this.price = price;
		this.dusterType = dusterType;
	}
	public String toString() {
		return length+","+price+","+dusterType;
	}

}
