package collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudents {
	public static void main(String[] args) {
		Students s1=new Students(321,"Dinesh",true);
		Students s2=new Students(567,"Vinoth",false);
		Students s3=new Students(987,"Ganesh",true);
		HashMap <Integer,Students> stu=new HashMap<>();
		stu.put(s1.getId(), s1);
		stu.put(s2.getId(), s2);
		stu.put(s3.getId(), s3);
		List <Students> li=stu.values().stream().collect(Collectors.toList());
		Iterator<Students> i=li.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		 
		while(i.hasNext()) {
			if(i.next().isPresent()==true) {
				i.remove();
				
			}
		}
		for(Students z:li) {
			System.out.println(z);
		}
	}

}
