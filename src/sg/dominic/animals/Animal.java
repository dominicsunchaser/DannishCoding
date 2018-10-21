package sg.dominic.animals;


import sg.dominic.featues.FlyingPattern;
import sg.dominic.featues.SingingPattern;
import sg.dominic.featues.SwimPattern;
import sg.dominic.featuresimpl.BirdNonSinging;
import sg.dominic.featuresimpl.NonFlyable;
import sg.dominic.featuresimpl.NonSwimable;

public  class Animal {
	
	SingingPattern singingPattern;
	
	FlyingPattern flyingPattern;
	
	SwimPattern swimingPattern;
	
	public Animal(){
		singingPattern = new BirdNonSinging();
		flyingPattern = new NonFlyable();
		swimingPattern = new NonSwimable();
	}
	
	
	public void sing(){
	   if(this.singingPattern.sing()){
		   System.out.println("Singing");
	   }
	   else{
		  System.out.println("NOT Singing");
	   }
	}

	public void walk(){
		System.out.println("i am walking");
	}
	
	
	
	void swim(){
		if(this.swimingPattern.swim())
			System.out.println("I am Swiming");
		else
			System.out.println("I am not Swiming");
	}

}
