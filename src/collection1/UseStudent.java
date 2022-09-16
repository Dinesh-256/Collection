package collection1;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		Student std1=new Student("Dinesh",4213,25,true);
		Student std2=new Student("Ramesh",4214,23,true);
		Student std3=new Student("Ganesh",4215,24,true);
		Student std4=new Student("Kamesh",4256,26,true);
		Student std5=new Student("Ramya",4356,28,false);
		Student std6=new Student("Divya",43568,22,false);
		Student std7=new Student("Kavya",2535,26,false);
		ArrayList <Student> stds=new ArrayList<>();
		stds.add(std1);
		stds.add(std2);
		stds.add(std3);
		stds.add(std4);
		stds.add(std5);
		stds.add(std6);
		stds.add(std7);
//		ArrayList <Student> femaleList=new ArrayList<>();
//		for(Student s:stds) {
//			if(s.getIsMale()==false) {
//				femaleList.add(s);
//			}
			
//		}
//		femaleList.forEach(x->System.out.println(x));
		String temp="";
		for(int i=0;i<stds.size();i++) {
			if(stds.get(i).getName().length()%2==0) {
				temp=stds.get(i).getName().substring(stds.get(i).getName().indexOf(stds.get(i).getName().length()/2+1),stds.get(i).getName().charAt(stds.get(i).getName().length()/2+2));
				//temp=stds.get(i).getName().substring(2,4);
				System.out.println(temp);
			}
			
		}
		
	}

}
