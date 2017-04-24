package servant_pattern;

public class King implements Royality {
	private boolean isDrunk;
	private boolean isHungary;
	private boolean isHappy=false;
	private boolean complimentRecieved=false;

	public void getFed() {
		isHungary = true;
	}

	public void getDrink() {
		isDrunk = true;
	}

	public void recieveCompliments() {
		complimentRecieved = true;
	}

	public void changeMood() {
		if (isHungary && isDrunk && complimentRecieved== true) {
			isHappy = true;
		}
	}

	public boolean getMood() {
		return isHappy;
	}

}
