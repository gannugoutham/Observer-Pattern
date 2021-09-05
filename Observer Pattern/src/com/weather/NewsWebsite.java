package com.weather;

public class NewsWebsite implements Observer {

	@Override
	public void update(int temperature) {
		 
		System.out.println("current temperature as per NewsWebsite : "
                + temperature + " degrees");
	}

}
