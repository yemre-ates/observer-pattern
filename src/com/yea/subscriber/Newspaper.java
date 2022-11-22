package com.yea.subscriber;

import com.yea.inflation.Inflation;

public class Newspaper implements Observer {

	@Override
	public void update(Inflation m) {

		System.out.println("Inflation updated on " +this.getClass().getSimpleName()+ ": " + m.getInflation());

	}

}
