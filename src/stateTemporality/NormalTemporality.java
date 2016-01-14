package stateTemporality;

import model.TemporalizedEntity;
import model.Time;

public class NormalTemporality extends StateTemporality{
	
	public NormalTemporality(Time time){
		super(time);
	}

	@Override
	public void addTemporalizedEntity(TemporalizedEntity e) {
		if(e.getStartTime() < startTime)
			startTime = e.getStartTime();
		
		if(e.getFinishTime() > finishTime)
			finishTime = e.getFinishTime();	
	}

	@Override
	public void update(TemporalizedEntity e) {
		e.setCurrentTime(currentTime);
	}
}
