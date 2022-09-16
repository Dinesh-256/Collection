package collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseDuster {
	public static void main(String[] args) {
		Duster d1=new Duster(3,50,"wood");
		Duster d2=new Duster(4,60,"Plastic");
		Duster d3=new Duster(6,70,"Normal");
		Duster d4=new Duster(2,55,"Sponch");
		ArrayList <Duster> dusters=new ArrayList<>();
		dusters.add(d1);
		dusters.add(d2);
		dusters.add(d3);
		dusters.add(d4);
		List <String> li=dusters.stream().map(u->u.getDusterType()).collect(Collectors.toList());
		li.forEach(x->System.out.println(x));
		System.out.println(dusters);
		
	}

}
