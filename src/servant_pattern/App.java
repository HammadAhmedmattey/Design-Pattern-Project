package servant_pattern;
import java.util.*;

public class App {

	
	public static void main(String[] args) {
		 IServant Fazlu= Servant.getservant("Fazlu");
		 scenario(Fazlu);
		 IServant Ramukaka= Servant.getservant("Ramukaka");
		 scenario(Ramukaka);
		 IServant Rehmatbibi = Servant.getservant("Rehmatbibi");
		 scenario(Rehmatbibi);
		 IServant shaheena = Servant.getservant("shaheena");
		scenario(shaheena);
	
		
	}
	public static void scenario(IServant servant){
	
		
		King k =new King();
		Queen q = new Queen();
		
		
		ArrayList<Royality> guests = new ArrayList<>();
		guests.add(k);
		guests.add(q);
		
		servant.feed(k);
		servant.feed(q);
		
    servant.giveWine(k);
	servant.giveWine(q);
		
		servant.giveCompliments(k);
		servant.giveCompliments(q);

		for(Royality r: guests){
			r.changeMood();
		}
		
		if (servant.checkifyouwillbehanged(guests)) {
		//	System.out.println(Servant.name + " will live another day");
		      servant.print();
		    } else {
		  //  	System.out.println("Poor " + Servant.name + ". His days are numbered");
		    	servant.print1();
		    }
	}

}
