package collection;

import java.util.ArrayList;
import java.util.List;

public class ValuesGreaterAvg {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(34);
		li.add(35);
		li.add(33);
		li.add(76);
		li.add(56);
		li.add(98);
		li.add(80);
		int sum=0;
		for(int i=0;i<li.size();i++) {
			sum=sum+(int)li.get(i)/2;
		}
		System.out.println("Sum of value= "+sum );
		List greaterAvg=new ArrayList();
		for(int i=0;i<li.size();i++) {
			if(sum<(int)li.get(i)) {
				greaterAvg.add(li.get(i));
			}
			
		}
		System.out.println(greaterAvg);
	}

}
