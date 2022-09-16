package collection1;
import java.util.ArrayList;
public class UseShoe {
	public static void main(String[] args) {
		Shoe s1=new Shoe(2999,8,"blue");
		Shoe s2=new Shoe(2979,5,"Red");
		Shoe s3=new Shoe(2799,7,"black");
		ArrayList <Shoe> sh=new ArrayList<>();
		sh.add(s1);
		sh.add(s2);
		sh.add(s3);
		int max=0;
		for(Shoe s:sh) {
			if(s.getPrice()>max) {
				max=s.getPrice();
			}
		}
		System.out.println(max);
		String max1="";
		for(int i=sh.size()-1;i>=0;i--) {
			max1=max1+" "+sh.get(i).getColor();
		}
		System.out.println(max1);
	}
	

}
