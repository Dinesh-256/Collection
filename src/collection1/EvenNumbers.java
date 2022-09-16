package collection1;

import java.util.ArrayList;

public class EvenNumbers {
	public static void main(String[] args) {
		ArrayList <Integer> nums=new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(3);
		nums.add(9);
		nums.add(5);
		nums.add(1);
		nums.add(7);
		nums.add(3);
		nums.set(3,8);
//		for(Integer num:nums) {
//			if(num%2==0) {
//				System.out.println(num);
//			}
//		}
//		for(int i=0;i<nums.size();i++) {
//			if(nums.get(i)%2==0) 
//			System.out.println(nums.get(i));
//			
//		}
//		nums.forEach(x->System.out.println(x));
		
		nums.forEach(x->{if(x%2==0) {
			System.out.println(x);
			}});
		
		//nums.set(0, 8);
		}
	}


