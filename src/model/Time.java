package model;

import java.util.ArrayList;
import java.util.List;

public class Time {

	private List<TemporalizedEntity> temporalizedEntities = new ArrayList<TemporalizedEntity>();
	private long startTime;
	private long finishTime;
	private long currentTime;

	public addTemporalizedEntity(TemporalizedEntity e) {
		temporalizedEntities.add(e);
	}
	
	public removeTemporalizedEntity(TemporalizedEntity e) {
		temporalizedEntities.remove(e);
	}
	
	public List<TemporalizedEntity> getTemporalizedEntity() {
		return temporalizedEntities;
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
	
}
