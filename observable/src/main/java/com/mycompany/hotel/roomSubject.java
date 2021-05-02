package com.mycompany.hotel;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ghostafbr
 */
public class roomSubject {
    
    private List<Observer> observers = new ArrayList<Observer>();
	private boolean status;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
		observersNotify();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void observersNotify() {
		observers.forEach(x -> x.update());
	}
}
