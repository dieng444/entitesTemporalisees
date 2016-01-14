package model;

public abstract class Action {
	
	protected byte action;
	protected long startTime;
	protected long finishTime;
	
	public Action(long startTime, long finishTime, byte action) {
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.action = action;
	}
}
