package model;

public abstract class TemporalizedEntity extends SimpleChangeModel{
	
	protected long startTime;
	protected long finishTime;
	protected long currentTime;
	
	public TemporalizedEntity(long startTime, long finishTime) {
		this.startTime = startTime;
		this.finishTime = finishTime;
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
	
	public void setCurrentTime(long t) {
		currentTime = t;
	}
	
	public void setStartTime(long t) {
		startTime = t;
	}
	
	public void setFinishTime(long t) {
		finishTime = t;
	}
	
}
