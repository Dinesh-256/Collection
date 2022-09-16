package collection1;

public class Remote {
	private int price;
	private String brand;
	private String model;
	private boolean isWarranty;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public Remote(int price, String brand, String model, boolean isWarranty) {
		super();
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.isWarranty = isWarranty;
	}
	@Override
	public String toString() {
		return "Remote [price=" + price + ", brand=" + brand + ", model=" + model + ", isWarranty=" + isWarranty + "]";
	}
	

}
