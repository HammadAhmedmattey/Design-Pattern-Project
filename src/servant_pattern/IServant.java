package servant_pattern;

import java.util.List;

public interface IServant {
	String name ="";
	public void feed(Royality r);
	public void giveWine(Royality r);
	public void giveCompliments(Royality r);
	
	public boolean checkifyouwillbehanged(List<Royality> tableguest);
	public void print();
	public void print1();
}
