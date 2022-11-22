package com.yea.publisher;

import java.util.ArrayList;
import java.util.List;

import com.yea.inflation.Inflation;
import com.yea.subscriber.Observer;

public class InflationPublisher implements Subject {

	private List<Observer> observers;
	private Inflation inflation;

	public InflationPublisher() {
		observers = new ArrayList<>();
	}

	public void setMessage(Inflation inflation) {
		this.inflation = inflation;
		notifyAnyUpdate();
	}

	@Override
	public void attach(Observer o) {

		observers.add(o);

	}

	@Override
	public void detach(Observer o) {

		observers.remove(o);

	}

	@Override
	public void notifyAnyUpdate() {

		observers.stream().forEach(o -> o.update(this.inflation));

	}

}
