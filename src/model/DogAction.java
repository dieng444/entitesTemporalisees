package model;

public class DogAction extends Action {
	
	public static final byte BARK = 0;
	public static final byte DORMIR = 1;
	public static final byte EAT = 2;
	
	public DogAction() {
		this(0, 10, DogAction.DORMIR);
	}
	
	public DogAction(long startTime, long finishTime, byte action) {
		super(startTime, finishTime, action);
	}
	
	public void doAction() {
		switch (action) {
			case BARK:
				System.out.println("waf waf");
				break;
			case DORMIR:
				System.out.println("zZZZzzZZZz");
				break;
			case EAT:
				System.out.println("miam");
				break;
		}
	}
	
	public boolean isCurrent(long currentTime) {
		return (currentTime >= startTime && currentTime <= finishTime) ;
	}
	
}
