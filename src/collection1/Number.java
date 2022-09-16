package collection1;
import java.util.ArrayList;

public class Number {
	public static void main(String[] args) {
		int num1=35;
		int num2=45;
		int num3=34;
		int num4=87;
		int num5=22;
		ArrayList <Integer> nums=new ArrayList<>();
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num4);
		nums.add(num5);
		for(Integer num:nums ) {
			System.out.println(num);
		}
	}
	

}
