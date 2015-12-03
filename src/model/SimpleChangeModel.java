package model;

import java.util.ArrayList;

public abstract class SimpleChangeModel {

	protected ArrayList<SimpleChangeListener> listeListeners = new ArrayList<SimpleChangeListener>();
	
	public void addSimpleChangeListener(SimpleChangeListener l) {
		listeListeners.add(l);
	};
	
	public void removeSimpleChangeListener(SimpleChangeListener l){
		listeListeners.remove(l);
	};
	
	protected void fireSimpleChange(){
		for(SimpleChangeListener l:listeListeners) {
			l.stateChanged(this);
		}
	}
	
}
