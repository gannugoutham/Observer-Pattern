package com.weather;

public class NewsPaperAgency implements Observer {

	@Override
	public void update(int temperature) {
		 System.out.println("current temperature as per NewsPaperAgency: "
	                + temperature + " degrees");
		
	}

}
