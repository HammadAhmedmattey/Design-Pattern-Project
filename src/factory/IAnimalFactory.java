package factory;

abstract class IAnimalFactory {
	
	public abstract IAnimal GetAnimalType(String type) throws Exception;
	
}
