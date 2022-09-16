package collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseChair {
	public static void main(String[] args) {
		Chair c1=new Chair("xxx",400,3,true);
		Chair c2=new Chair("Onyx",1000,6,true);
		Chair c3=new Chair("Orovo",1500,1,false);
		ArrayList <Chair> chairs=new ArrayList<>();
		chairs.add(c1);
		chairs.add(c2);
		chairs.add(c3);
		List <String> li=chairs.stream().map(u->u.getBrand()).filter(v->v.startsWith("O")).collect(Collectors.toList());
		li.forEach(s->System.out.println(s));
		chairs.stream().map(u->u.isRoolingChair()).filter(y->y==true).forEach(s->System.out.println(s));
	}

}
