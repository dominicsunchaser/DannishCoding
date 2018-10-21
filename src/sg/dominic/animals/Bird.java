package sg.dominic.animals;

import sg.dominic.featuresimpl.BirdSinging;

public class Bird extends Animal {
	
	public void fly(){
		System.out.println("I am flying");
	}
	
	public Bird(){
		super();
		this.singingPattern = new BirdSinging();
	}
	
	

}
