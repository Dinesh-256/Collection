package collection1;

import java.util.ArrayList;

public class TocharArray {
	public static void main(String[] args) {
		
	

	String[] a=args[0].split(",");
	String b=a[0];
	String c=a[1];
	String d=a[2];
	String e=a[3];
	
//	String b=a[0];
//	String c=a[1];
//	String d=a[2];
//	String e=a[3];
//	char b1=b.charAt(0);
//	char c2=c.charAt(0);
//	char d2=d.charAt(0);
//	char e2=e.charAt(0);
	ArrayList <String> letters=new ArrayList<>();
	letters.add(b);
	letters.add(c);
	letters.add(d);
	letters.add(e);
	for(int i=0;i<letters.size();i++) {
		System.out.println(letters.get(i));
	}
	}

}
