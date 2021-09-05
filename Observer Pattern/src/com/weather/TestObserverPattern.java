package com.weather;

public class TestObserverPattern {
	
	public static void main(String[] args) throws InterruptedException {
		
		WeatherReport weatherReport = new WeatherReport();

        Observer newsPaperAgency = new NewsPaperAgency();
        Observer newsChannel = new NewsChannel();
        Observer newsWebsite = new NewsWebsite();

        weatherReport.addObserver(newsPaperAgency);
        weatherReport.addObserver(newsChannel);
        weatherReport.addObserver(newsWebsite);
        
        weatherReport.temperatureChanged(30);
        
        System.out.println("\nAfter 5 minutes temperature changes to 33 degrees...\n");
        
        Thread.sleep(6000);
        
        weatherReport.temperatureChanged(35);
		
	}

	
}
