package edu.chapter01.declarationandaccesscontrol;

import edu.chapter01.declarationandaccesscontrol.abtractexample.Car;

public abstract class Toyota extends Car {

	@Override
	public void goFast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goUpHill() {
		// TODO Auto-generated method stub

	}
	/* not visible, impressNeighbors have default access, only visible in the same package
	@Override
	void impressNeighbors() {
		// TODO Auto-generated method stub

	}
	*/

}
