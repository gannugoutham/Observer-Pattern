package com.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherReport implements Subject {
	private int temperature;
	private List<Observer> listOfObservers = new ArrayList<Observer>();

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void addObserver(Observer observer) {
		listOfObservers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);

	}

	@Override
	public void notificationForViewers() {

		for (Observer observer : listOfObservers) {
			observer.update(temperature);
		}
	}

	public void temperatureChanged(int newTemperature) {
		temperature = newTemperature;
		notificationForViewers();
	}

}
