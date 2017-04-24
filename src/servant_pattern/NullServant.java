package servant_pattern;

import java.util.List;

public class NullServant implements IServant {

	public void feed(Royality r) {
		System.out.println("No servant available");
	}
	public void giveWine(Royality r) {
		System.out.println("No servant available");
	}
	public void giveCompliments(Royality r){
		System.out.println("No servant available");
	}
	public boolean checkifyouwillbehanged(List<Royality> tableguest)
	{
		return false;
	}
	public void providejewellry(Royality r){
		
	}
	public void print(){
		System.out.println("No servant available");
	}
	public void print1(){
		System.out.println("No servant available");
	}
	
}
