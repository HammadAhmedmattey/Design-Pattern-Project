package multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

	
	private static final  Map<Object , Multiton> multitonInstance = new HashMap <Object , Multiton>();
	
	private Multiton()
	{
		
	}
	
	public static Multiton getInstance(Object key)
	{
		
		Multiton instance = multitonInstance.get(key);
		
		if(instance == null)
			
		{
			synchronized (Multiton.class)
			
			{
				if (instance == null){
					
					instance = new Multiton();
					multitonInstance.put(key, instance);
				}
			}
			
		}
		
		return instance;
	}
	
	public void otherOperation()
	{
		
		System.out.println("FirstName");
		System.out.println("LastName");
		System.out.println("Email");
		System.out.println("Pasword");
		System.out.println("UserName");
		System.out.println("phone");
	}
}
