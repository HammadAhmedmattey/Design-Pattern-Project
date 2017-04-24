package decorator;

public class Fajita extends ToppingDecorator {

	public Fajita(Pizza newPizza) {
		
		super(newPizza);
		
		
		
		System.out.println("Adding Fajita");
	}
	
	
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", fajita";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Fajita: " + .250);
		
		return tempPizza.getCost() + .250;
		
	}
	
}