package collection;

import java.util.ArrayList;

public class ReplaceJavatoPython {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("i love java , java is one of the easiest programming languages. Java has more inbuilt libraries");
		
//		String a="dinesh";
//	System.out.println(	a.toLowerCase());
		for(int i=0;i<al.size();i++) {
			if(al.get(i).contains("java")) {
			    System.out.println(al.get(i).toLowerCase().replace("java", "Python"));
					
			//System.out.println(al.get(i));
			}
		}
	}

}
