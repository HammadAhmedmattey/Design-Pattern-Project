package prototype;

public class TestCloning {
	
	public static void main(String[] args){
		
		
		CloneFactory animalMaker = new CloneFactory();
		
		
		
		Sheep sally = new Sheep();
		Cat sally1 = new Cat();
		
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		Cat clonedCat = (Cat) animalMaker.getClone(sally1);
		
		
		System.out.println(sally);
		System.out.println(sally1);
		
		
		System.out.println(clonedSheep);
		System.out.println(clonedCat);
		
		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
	
System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally1)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedCat)));

	
	}
	
}
