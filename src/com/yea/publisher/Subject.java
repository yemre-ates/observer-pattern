package com.yea.publisher;

import com.yea.subscriber.Observer;

public interface Subject {

	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyAnyUpdate();
	
}
