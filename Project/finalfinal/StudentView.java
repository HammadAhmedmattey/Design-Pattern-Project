package finalfinal;

import java.util.HashMap;
import java.util.Map;



public class StudentView {
	private static final  Map<Object ,UniClass > multitonInstance = new HashMap <Object , UniClass>();
	 

	 public void show(){
	      System.out.println("Displaying Student Page");
	      System.out.println("");
	      System.out.println("Student Info");
	      System.out.println("");
	      System.out.println("FirstName");
			System.out.println("LastName");
			System.out.println("Email");
			System.out.println("Pasword");
			System.out.println("UserName");
			System.out.println("phone");
			System.out.println("");
	      
	 }
	      
	      public static UniClass getInstance(Object key){
			   
	    	  UniClass instance = multitonInstance.get(key);
			   if(instance == null)
					
				{
			   
				   synchronized (UniClass.class)
				   {instance = new UniClass();
				multitonInstance.put(key, instance);
				
		        
		      }	
				   }
			   
			   return instance ;}

	      
	       
	   
	 
	 
}
