package prototype;

public class Cat implements Animal {

	public Cat(){
		
		System.out.println("Cat is Made");
		
	}
	
	public Animal makeCopy() {
		
		System.out.println("Cat is Being Made");
		
		Cat catObject = null;
		
		try {
			
			
			
			catObject = (Cat) super.clone();
			
		}
		
		
		catch (CloneNotSupportedException e) {
			  
			System.out.println("The Cat was Turned to Meow");
			
			e.printStackTrace();
			  
		 }
		
		return catObject;
	}
	
	public String toString(){
		
		return "Meow , Meowww , Meowwww";
		
	}
	
}