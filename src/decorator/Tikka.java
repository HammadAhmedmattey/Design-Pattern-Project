package decorator;

public class Tikka extends ToppingDecorator {

	public Tikka(Pizza newPizza) {
		
		super(newPizza);
		
		
		
		System.out.println("Adding Tikka");
	}
	
	
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", tikka";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of tikka: " + .150);
		
		return tempPizza.getCost() + .150;
		
	}
	
}