package collection1;

public class Student {
	private String name;
	private int id;
	private int age;
	private boolean isMale;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsmale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name,int id,int age,boolean isMale) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+id+" "+age+" " +isMale;
	}

}
