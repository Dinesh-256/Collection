package collection1;

public class Students {
	private int id;
	private String name;
	private boolean isPresent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public Students(int id, String name, boolean isPresent) {
		super();
		this.id = id;
		this.name = name;
		this.isPresent = isPresent;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", isPresent=" + isPresent + "]";
	}
	

}
