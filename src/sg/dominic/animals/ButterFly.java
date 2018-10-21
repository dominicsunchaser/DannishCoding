package sg.dominic.animals;

import sg.dominic.featuresimpl.Flyable;

public class ButterFly extends Animal {
	
	public ButterFly(){
		super();
		this.flyingPattern = new Flyable();
	}

}
