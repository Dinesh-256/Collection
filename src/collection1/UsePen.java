package collection1;

import java.util.ArrayList;

public class UsePen {
	public static void main(String[] args) {
		
		Pen p=new Pen("Flair",20,"Blue");
		Pen p1=new Pen("Renaulds",30,"Red");
		Pen p3=new Pen("Gell",60,"Yellow");
		Pen p4=new Pen("Cello",50,"Green");
		Pen p5=new Pen("Max",40,"Black");
		ArrayList <Pen> pens=new ArrayList<>();
		pens.add(p);
		pens.add(p1);
		pens.add(p3);
		pens.add(p4);
		pens.add(p5);
		//System.out.println(pens);
		int max=0;
		Pen maxPen=null;
		for(Pen x:pens) {
			
			if(max<x.getPrice()) {
				max=x.getPrice();
				maxPen=x;
				
			}
		}
			System.out.println(maxPen.getBrand()+" "+maxPen.getPrice()+" "+maxPen.getColor());
			
		
	}

}
