package com.yea.app;

import com.yea.inflation.Inflation;
import com.yea.publisher.InflationPublisher;
import com.yea.subscriber.Bank;
import com.yea.subscriber.NewsAgency;
import com.yea.subscriber.Newspaper;

public class Application {

	public static void main(String[] args) {
		
		InflationPublisher inflationPublisher = new InflationPublisher();
		
		Bank bank = new Bank();
		Newspaper newspaper = new Newspaper();
		NewsAgency newsAgency = new NewsAgency();
		
		inflationPublisher.attach(bank);
		inflationPublisher.attach(newspaper);
		inflationPublisher.attach(newsAgency);
		
		inflationPublisher.setMessage(new Inflation(56.5));
		
	}
}
