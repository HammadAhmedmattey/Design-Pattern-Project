package servant_pattern;

public class Queen implements Royality{
private boolean isDrunk;
private boolean isHungary;
private boolean isHappy;
private boolean islookingbeautiful =true;

private boolean complimentRecieved = false;

public void getFed(){
	isHungary = true;
}

public void getDrink(){
	isDrunk = true;
}
public void recieveCompliments(){
	complimentRecieved = true;
}

public void changeMood(){
	if(complimentRecieved && islookingbeautiful && isDrunk && isHungary){
		isHappy=true;
	}
	
}
public boolean getMood(){
	return isHappy;
}



}
