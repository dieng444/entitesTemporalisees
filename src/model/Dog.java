package model;

import java.util.ArrayList;
import java.util.List;

public class Dog extends TemporalizedEntity{
	
	private List<DogAction> dogActions = new ArrayList<DogAction>();
	
	public Dog(long startTime, long finishTime) {
		super(startTime, finishTime);
	}
	
	public void addDogAction(DogAction a) {
		dogActions.add(a);
	}
	
	public void doAction() {
		for (DogAction da : dogActions) {
			da.doAction();
		}
	}
	
}
