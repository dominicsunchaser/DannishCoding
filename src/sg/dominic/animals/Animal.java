package sg.dominic.animals;


import sg.dominic.featues.FlyingPattern;
import sg.dominic.featues.SingingPattern;
import sg.dominic.featues.SwimPattern;
import sg.dominic.featues.WalkablePattern;
import sg.dominic.featuresimpl.BirdNonSinging;
import sg.dominic.featuresimpl.NonFlyable;
import sg.dominic.featuresimpl.NonSwimable;
import sg.dominic.featuresimpl.Walkable;

public  class Animal {
	
	FlyingPattern flyingPattern;
	
	SwimPattern swimingPattern;
	
	SingingPattern singingPattern;
	
	WalkablePattern walkabePattern;
	
	public void setWalkabePattern(WalkablePattern walkabePattern) {
		this.walkabePattern = walkabePattern;
	}


	public void setSingingPattern(SingingPattern singingPattern) {
		this.singingPattern = singingPattern;
	}


	public void setFlyingPattern(FlyingPattern flyingPattern) {
		this.flyingPattern = flyingPattern;
	}


	public void setSwimingPattern(SwimPattern swimingPattern) {
		this.swimingPattern = swimingPattern;
	}



	
	
	public Animal(){
		singingPattern = new BirdNonSinging();
		flyingPattern = new NonFlyable();
		swimingPattern = new NonSwimable();
		walkabePattern = new Walkable();
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
		if (this.walkabePattern.isWalkable())
		System.out.println("i am walking");
		else
		System.out.println("i am NOT walking");
	}
	
	public String sex(){
		return "Female";
	}
	
	
	
	void swim(){
		if(this.swimingPattern.swim())
			System.out.println("I am Swiming");
		else
			System.out.println("I am not Swiming");
	}

}
