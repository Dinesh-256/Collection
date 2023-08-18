package collection;

import java.util.ArrayList;
import java.util.List;

public class SumOfValues {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(2.5);
		li.add(3.0);
		li.add(4.5);
		li.add(8.4);
		li.add(1.0);
		double sum=(float) 0;
		for(int i=0;i<li.size();i++) {
			sum=sum+(Double)li.get(i);
		}
		System.out.println("Sum of Float values "+sum);
	//  Maximum values		
	//	System.out.println(Collections.max(li));
		double max=0;
		for(int i=0;i<li.size();i++) {
			if((double)li.get(i)>max) {
				max=(double)li.get(i);
			}
		}
		System.out.println("Maximum values are "+max);
	// Minimum values	
		double min=li.indexOf(0);
		for(int i=0;i<li.size();i++) {
			if((double)li.get(i)<max) {
				max=(double)li.get(i);
			}
		}
		System.out.println("Minimum values are "+max);
		}
		
		
	
	

}
