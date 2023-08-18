package collection;

import java.util.ArrayList;

public class ArrayListEvenOdd {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(23);
		li.add(45);
		li.add(87);
		li.add(65);
		li.add(21);
		li.add(44);
		
		ArrayList<Integer> evenNumber=new ArrayList<>();
		ArrayList<Integer> oddNumber=new ArrayList<>();
		for(int i=0;i<li.size();i++) {
			if(li.get(i)%2==0) {
				
				evenNumber.add(li.get(i));
			}
			else {
				
				oddNumber.add(li.get(i));
			}
			
		}
		System.out.println(evenNumber);
		System.out.println(oddNumber);
	}

}
