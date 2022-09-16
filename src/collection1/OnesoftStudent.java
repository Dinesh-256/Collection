package collection1;

public class OnesoftStudent {
	private String name;
	private int age;
	private String degree;
	private int lmsId;
	private boolean isMale;
	private int passedOutYear;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setDegree(String degree) {
		this.degree=degree;
	}
	public String getDegree() {
		return degree;
	}
	public void setIms(int lmsId) {
		this.lmsId=lmsId;
	}
	public int getLms() {
		return lmsId;
	}
	public void setMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getMale() {
		return isMale;
		
	}
	public void setPy(int passedOutYear) {
		this.passedOutYear=passedOutYear;
	}
	public int getPy() {
		return passedOutYear;
	}
	public OnesoftStudent(String name,int age,String degree,int lmsId,boolean isMale,int passedOutYear) {
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.lmsId=lmsId;
		this.isMale=isMale;
		this.passedOutYear=passedOutYear;
	}
	
	  public String toString()  { 
		  return
	  "Name"+name+" Age "+age+" Degree "+degree+" LMS ID "+lmsId+" Male "
	  +isMale+" PassedOutn"+passedOutYear; }
	 
}






