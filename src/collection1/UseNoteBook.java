package collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseNoteBook {
	public static void main(String[] args) {
		NoteBook n1=new NoteBook("TNPL",40,200,false);
		NoteBook n2=new NoteBook("Bright",30,150,true);
		NoteBook n3=new NoteBook("EnterPrice",56,140,false);
		NoteBook n4=new NoteBook("Tamil",15,80,true);
		NoteBook n5=new NoteBook("LOcal",70,320,false);
		ArrayList <NoteBook> notes=new ArrayList<>();
		notes.add(n1);
		notes.add(n2);
		notes.add(n3);
		notes.add(n4);
		notes.add(n5);
		//notes.stream().map(u->u.getName()).forEach(z->System.out.println(z));
		//notes.stream().filter(t->t.getPrice()>40).map(r->r.getName()).forEach(w->System.out.println(w));
		List <Boolean> li=notes.stream().map(d->d.isFourLine()).collect(Collectors.toList());
		li.forEach(z->System.out.println(z));
	}

}
