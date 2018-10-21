package sg.dominic.animals;

import sg.dominic.featuresimpl.BirdSinging;
import sg.dominic.featuresimpl.Flyable;

public class Bird extends Animal {
	

	
	public void fly(){
		if(this.flyingPattern.fly())
		System.out.println("I am flying");
		else
		System.out.println("I am not flying");	
	}
	
	public Bird(){
		super();
		this.singingPattern = new BirdSinging();
		this.flyingPattern = new Flyable();
	}
	
	

}
