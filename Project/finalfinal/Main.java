package finalfinal;

import java.util.Scanner;
import finalfinal.FrontController;
import finalfinal.StudentView;
import finalfinal.TeacherView;

public class Main {


	 public static void main(String[] args) {
		   
		 
		 StudentView.getInstance("").otherOperation();
	     
	        FrontController frontController = new FrontController();
//	        Message Generation for asking the user type
	        System.out.println("Please select from given options: \nPress 1 for Teacher Login\nPress 2 for Student login");
//	        Input from user to select the type of the user
	        Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();
//	        Checks For User Input
//	        If user pressed 1;
	        if(i==2){
	        frontController.dispatchRequest("Student");
	        }
//	        If User Press 2
	        if(i==1){
	        frontController.dispatchRequest("TeacherView");
	        }
	        sc.close();
	        frontController.dispatchRequest("slsblsf");
	    }
}
