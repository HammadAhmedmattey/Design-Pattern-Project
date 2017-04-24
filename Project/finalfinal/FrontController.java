package finalfinal;

import frontController.Dispatcher;

public class FrontController {
	 private Dispatcher dispatcher;

	   public FrontController(){
	      dispatcher = new Dispatcher();
	   }

	   private boolean isAuthenticUser(){
	      System.out.println("User is successfully Login.");
	      return true;
	   }

	   private void trackRequest(String request){
	      System.out.println("Page is requested: " + request);
	   }

	   public void dispatchRequest(String request){
	     
	      trackRequest(request);
	      
	      
	      if(isAuthenticUser()){
	         dispatcher.dispatch(request);
	      }	
	   }
	}