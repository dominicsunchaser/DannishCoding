package sg.dominic.animals;

import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.NonFlyable;
import sg.dominic.featuresimpl.NonSwimable;

public class Chicken extends Bird implements MakeSound  {
	
	@Override
	public void sound() {
		System.out.println("Cluck CLuck");
	}
	
	public Chicken(){
		super();
		this.flyingPattern  = new NonFlyable();
		
	}

}
