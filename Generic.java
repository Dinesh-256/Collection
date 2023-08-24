package collection;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		//With Generic
		ArrayList<String> sl=new ArrayList<String>();
		//System.out.println(sl instanceof Generic);
		sl.add("Java");
		sl.add("Spring");
		sl.add("Agile");
		for(String s:sl)
			System.out.println(s);
		System.out.println();
		// Wihout Generic
		ArrayList list1=new ArrayList<>();
		list1.add(34);
		list1.add("java");
		list1.add(45);
		list1.add("SpringBoot");
		list1.add("Python");
		for(int i=0;i<list1.size();i++) {
			if( list1.get(i).getClass().getSimpleName().equalsIgnoreCase("String")) {
				list1.add(list1.get(i));
			}
			list1.remove(i);
			
			}
		System.out.println(list1);
		}
		

	

}
