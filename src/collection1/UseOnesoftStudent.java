package collection1;

import java.util.HashMap;
import java.util.Iterator;

public class UseOnesoftStudent {
	public static void main(String[] args) {
		OnesoftStudent student1 = new OnesoftStudent("Dinesh", 25, "BE", 669, true, 2017);
		OnesoftStudent student2 = new OnesoftStudent("Rajesh", 27, "BE.CSE", 665, true, 2016);
		OnesoftStudent student3 = new OnesoftStudent("Buvana", 24, "B.Sc", 550, false, 2021);
		OnesoftStudent student4 = new OnesoftStudent("Mani", 25, "B.Com", 667, true, 2020);
		HashMap<Integer, OnesoftStudent> detials = new HashMap<>();
		detials.put(student1.getLms(), student1);
		detials.put(student2.getLms(), student2);
		detials.put(student3.getLms(), student3);
		detials.put(student4.getLms(), student4);
		
		   for(Integer x:detials.keySet()) {
			   System.out.println(detials.get(x)); 
 	   }
//		  for(OnesoftStudent y:detials.values()) {
//			  
//		  System.out.println(y.getName()+" "+y.getAge()+" "+y.getDegree()+" "+y.getPy()  );
		  
//		  for(Integer z:detials.keySet()) { 
//			  System.out.println(detials.get(z)); 
//		  }
//		 
//		 detials.keySet().forEach(a-> System.out.println(a));
//		 detials.values().forEach(b->System.out.println(b.getName()+" "+b.getAge()+" "+b.getDegree()+" "+b.getPy()));
//		detials.forEach((c,d)->System.out.println(c+" "+d));
//		detials.keySet().forEach(f->System.out.println(detials.get(f)));;
//
//		
//		  Iterator<OnesoftStudent>i=detials.values().iterator();
//		  while(i.hasNext()) {
//		  System.out.println(i.next().getName());
//		  }
//		  Iterator<OnesoftStudent>j=detials.values().iterator();
//		  while(j.hasNext()) {
//		  System.out.println(j.next()); }
//		 
//		Iterator<OnesoftStudent> k = detials.values().iterator();
//		while (k.hasNext()) {
//			if (k.next().getPy() <= 2020) {
//				k.remove();
//
//			}
//
//		}
//		for (OnesoftStudent o : detials.values()) {
//			System.out.println(o);
//		}

	}

}
