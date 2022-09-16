package collection1;

public class NoteBook {
	private String name;
	private int price;
	private int noOfPages;
	private boolean isFourLine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public boolean isFourLine() {
		return isFourLine;
	}
	public void setFourLine(boolean isFourLine) {
		this.isFourLine = isFourLine;
	}
	public NoteBook(String name, int price, int noOfPages, boolean isFourLine) {
		super();
		this.name = name;
		this.price = price;
		this.noOfPages = noOfPages;
		this.isFourLine = isFourLine;
	}
	
	public String toString() {
		return "NoteBook [name=" + name + ", price=" + price + ", noOfPages=" + noOfPages + ", isFourLine=" + isFourLine
				+ "]";
	}

}
