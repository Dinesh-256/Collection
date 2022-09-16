package collection1;

public class Chair {
	private String brand;
	private int price;
	private int modelNo;
	boolean isRoolingChair;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public boolean isRoolingChair() {
		return isRoolingChair;
	}
	public void setRoolingChair(boolean isRoolingChair) {
		this.isRoolingChair = isRoolingChair;
	}
	public Chair(String brand, int price, int modelNo, boolean isRoolingChair) {
		super();
		this.brand = brand;
		this.price = price;
		this.modelNo = modelNo;
		this.isRoolingChair = isRoolingChair;
	}
	@Override
	public String toString() {
		return "Chair [brand=" + brand + ", price=" + price + ", modelNo=" + modelNo + ", isRoolingChair="
				+ isRoolingChair + "]";
	}
	
	

}
