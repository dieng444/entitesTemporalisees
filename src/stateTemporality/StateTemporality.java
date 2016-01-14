package stateTemporality;

import model.TemporalizedEntity;
import model.Time;

public abstract class StateTemporality {
	
	protected long startTime;
	protected long finishTime;
	protected long currentTime;
	protected Time time;
	
	public StateTemporality(Time time) {
	    this.time = time;
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getFinishTime() {
		return finishTime;
	}
	
	public long getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}
	
	public void setCurrentTimeFromRatio(double ratio) {
		this.currentTime = (long) (currentTime + ratio * ( finishTime - startTime ));
		for(TemporalizedEntity te : time.getTemporalizedEntity()) {
			update(te);
		}
	}
	
	public abstract void update(TemporalizedEntity e);
	
	public abstract void addTemporalizedEntity(TemporalizedEntity e);
	
}
