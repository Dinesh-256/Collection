package collection;

import java.util.ArrayList;

public class GetSimilarDatainList {
	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add("Java");
		li.add("Payilagam");
		li.add("PostgreSql");
		li.add(45);
		li.add(true);
		li.add(65);
		li.add(50.56f);
		li.add(7865467887l);
		li.add(78.98f);
		ArrayList intType=new ArrayList();
		ArrayList string=new ArrayList();
		ArrayList floatType=new ArrayList();
		ArrayList booleanType=new ArrayList();
		ArrayList longType=new ArrayList();
		for(int i=0;i<li.size();i++) {
			if(li.get(i).getClass().getSimpleName().equalsIgnoreCase("string")) {
				string.add(li.get(i));
			}
			else if(li.get(i).getClass().getSimpleName().equalsIgnoreCase("integer")) {
				intType.add(li.get(i));
			}
			else if(li.get(i).getClass().getSimpleName().equalsIgnoreCase("long")) {
				longType.add(li.get(i));
			}
			else if(li.get(i).getClass().getSimpleName().equalsIgnoreCase("boolean")) {
				booleanType.add(li.get(i));
			}
			else if(li.get(i).getClass().getSimpleName().equalsIgnoreCase("float")) {
				floatType.add(li.get(i));
			}
		}
		System.out.print("Integer Type in list :"+intType+'\n');
		System.out.print("String Type in list :"+string+'\n');
		System.out.print("Float Type in list :"+floatType+'\n');
		System.out.print("Boolean Type in list :"+booleanType+'\n');
		System.out.print("Long Type in list :"+longType+'\n');
	}

}
