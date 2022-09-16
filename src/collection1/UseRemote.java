package collection1;

import java.util.HashMap;
import java.util.Map;

public class UseRemote {
	public static void main(String[] args) {
		Remote r1=new Remote(60,"LG","ue234",true);
		Remote r2=new Remote(100,"Samsung","yui34",false);
		Remote r3=new Remote(150,"Onida","eyd374",true);
		HashMap <String,Remote> remotes=new HashMap<>();
		remotes.put(r1.getBrand(), r1);
		remotes.put(r2.getBrand(), r2);
		remotes.put(r3.getBrand(), r3);
		for(String x:remotes.keySet()) {
			System.out.println(remotes.get(x));
		}
		for(Map.Entry r:remotes.entrySet()) {
			System.out.println(r.getValue());
		}
	}

}
