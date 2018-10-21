package sg.dominic.animals;

import sg.dominic.featues.SingingPattern;
import sg.dominic.featuresimpl.BirdNonSinging;

public  class Animal {
	
	SingingPattern singingPattern;
	
	public Animal(){
		singingPattern = new BirdNonSinging();
	}
	
	
	public boolean sing(){
		return this.singingPattern.sing();
	}

	public void walk(){
		System.out.println("i am walking");
	}

}
