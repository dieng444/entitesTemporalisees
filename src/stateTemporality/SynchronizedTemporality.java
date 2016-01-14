package stateTemporality;

import model.TemporalizedEntity;
import model.Time;

public class SynchronizedTemporality extends StateTemporality{

	public SynchronizedTemporality(Time time) {
		super(time);
		startTime = 0;
	}

	@Override
	public void addTemporalizedEntity(TemporalizedEntity e) {
		if(e.getFinishTime() > finishTime)
			finishTime = e.getFinishTime();
	}
	
	@Override
	public void update(TemporalizedEntity e) {
		e.setCurrentTime(e.getStartTime()+currentTime);
	}
}
