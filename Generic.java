package collection;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		//With Generic
		ArrayList<String> sl=new ArrayList<String>();
		sl.add("Java");
		sl.add("Spring");
		sl.add("Agile");
		for(String s:sl)
			System.out.println(s);
		System.out.println();
		// Wihout Generic
		ArrayList list=new ArrayList<>();
		list.add((String)"Java");
		list.add((String)"Spring");
		list.add((String)"Agile");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
