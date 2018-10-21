package sg.dominic.animals;

import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.NonFlyable;

public class Rooster extends Bird implements MakeSound{
	
	

	@Override
	public void sound() {
		System.out.println("Cock a doodle doo");
		
	}
	
	public String sex(){
		return "Male";
	}
	
	 public Rooster(){
		this.flyingPattern = new NonFlyable();
		
	}

}
