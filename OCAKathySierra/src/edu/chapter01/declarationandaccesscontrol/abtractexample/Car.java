package edu.chapter01.declarationandaccesscontrol.abtractexample;

public abstract class Car {
	private double price;
	private String model;
	private String year;
	
	public abstract void goFast();
	abstract public void goUpHill();
	//private abstract void impressNeighbors(); //abtract only can have public or protected modifier
	abstract void impressNeighbors();
}
