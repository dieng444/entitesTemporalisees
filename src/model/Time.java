package model;

import java.util.ArrayList;
import java.util.List;

import stateTemporality.*;

public class Time {

	private List<TemporalizedEntity> temporalizedEntities = new ArrayList<TemporalizedEntity>();
	private long startTime;
	private long finishTime;
	private long currentTime;
	private NormalTemporality normalState;
	private SynchronizedTemporality synchroState;
	private StateTemporality currentState;
	
	public Time() {
		normalState = new NormalTemporality(this);
		synchroState = new SynchronizedTemporality(this);
		currentState = normalState;
		System.out.println(currentState);
	}

	public void addTemporalizedEntity(TemporalizedEntity e) {
		temporalizedEntities.add(e);
		normalState.addTemporalizedEntity(e);
		synchroState.addTemporalizedEntity(e);
	}
	
	/*
	public void removeTemporalizedEntity(TemporalizedEntity e) {
		temporalizedEntities.remove(e);
	}
	*/
	
	public List<TemporalizedEntity> getTemporalizedEntity() {
		return temporalizedEntities;
	}
	
	public long getStartTime() {
		return currentState.getStartTime();
	}
	
	public long getFinishTime() {
		return currentState.getFinishTime();
	}
	
	public long getCurrentTime() {
		return currentState.getCurrentTime();
	}
	
	public void setState() {
		
	}
	
}
