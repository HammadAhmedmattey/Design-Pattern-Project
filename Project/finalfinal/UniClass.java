package finalfinal;

import frontController.HomeView;
import finalfinal.StudentView;

public class UniClass {
	 private StudentView studentView;
	   private HomeView homeView;
	   
	  
	   
	   public UniClass(){
	      studentView = new StudentView();
	      homeView = new HomeView();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         studentView.show();
	      }
	      else{
	         homeView.show();
	      }	
	   }
	
	public void otherOperation() {
		
		
	}
	   
	   
	   

}
