package stateTemporality;

import model.TemporalizedEntity;
import model.Time;

public class NormalTemporality extends StateTemporality{
	
	public NormalTemporality(Time time){
		super(time);
	}
	
	public String toString() {
		return "l'état courant est : normal temporality";
	}

	@Override
	public void addTemporalizedEntity(TemporalizedEntity e) {
		// TODO Auto-generated method stub
		
	}
}
