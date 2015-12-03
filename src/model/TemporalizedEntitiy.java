package model;

public abstract class TemporalizedEntitiy extends SimpleChangeModel{
	
	protected long startTime;
	protected long finishTime;
	protected long currentTime;
	
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
	
}
