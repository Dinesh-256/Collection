package collection1;
import java.util.HashMap;

public class EmpId {

	public static void main(String[] args) {
		HashMap<Integer,String> empDet=new HashMap<>();
		empDet.put(17, "Mani");
		empDet.put(56, "ManiKandan");
		empDet.put(45, "ManiVannan");
		empDet.put(23, "ManiRaj");
		/*
		 * System.out.println(empDet); empDet.remove(56); System.out.println(empDet);
		 * 
		 * System.out.println(empDet.keySet());
		 * 
		 * System.out.println(empDet.values());
		 * 
		 * System.out.println(empDet.get(17));
		 */
		/*
		 * for(Integer x:empDet.keySet()) { //System.out.println(x);
		 * System.out.println(x+" "+empDet.get(x)); } for(String y:empDet.values()) {
		 * System.out.println(y); }
		 */
		empDet.forEach((x,y)->System.out.println(x+" "+y));
		empDet.keySet().forEach(x->System.out.println(x));
		empDet.values().forEach(y->System.out.println(y));
		
	
		
        
	}

}
