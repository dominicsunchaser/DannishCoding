package sg.dominic.animals;

import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.Flyable;
import sg.dominic.featuresimpl.NonFlyable;
import sg.dominic.featuresimpl.Swimable;

public class Duck extends Bird implements MakeSound {

	@Override
	public void sound() {
		System.out.println("Quack Quack");
	}
	
	public Duck(){
		this.swimingPattern = new Swimable();
	}

}
