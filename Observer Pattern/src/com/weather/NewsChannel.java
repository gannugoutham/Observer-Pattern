package com.weather;

public class NewsChannel implements Observer {

	@Override
	public void update(int temperature) {
		System.out.println("current temperature as per NewsChannel : "
                + temperature + " degrees");
		
	}

}
