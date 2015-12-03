package stateTemporality;

import model.TemporalizedEntity;
import model.Time;

public class SynchronizedTemporality extends StateTemporality{

	public SynchronizedTemporality(Time time) {
		super(time);
		startTime = 0;
	}
	
	public String toString() {
		return "l'état courant est : synchronized temporality";
	}

	@Override
	public void addTemporalizedEntity(TemporalizedEntity e) {
		// TODO Auto-generated method stub
		
	}
}
