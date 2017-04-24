package servant_pattern;
import java.util.*;

public class Servant implements IServant {
 protected static String name;
private static int count=3;
private Servant(){}

public static IServant getservant(String n){
	
	if(count>0){
		count--;
	Servant.name = n;
	 return new Servant();
	 }
	else{
		return new NullServant();
	}
	
}


public void feed(Royality r){
	System.out.println("Servant is serving food");
	r.getFed();
}
public void giveWine(Royality r){
	System.out.println("Servant is serving Wine");
	r.getDrink();
}
public void giveCompliments(Royality r){
	System.out.println("Servant is giving compliments");
	r.recieveCompliments();
}

public boolean checkifyouwillbehanged(List<Royality> tableguest){
	boolean anotherDay = false;
	for(Royality r: tableguest){
		if(r.getMood()==true){
			anotherDay = true;
		}
	}
	return anotherDay;
}
public void print(){
	System.out.println(Servant.name + " will live another day");
}
public void print1(){
	System.out.println("Poor " + Servant.name + ". His days are numbered");
}
}
