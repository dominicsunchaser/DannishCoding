package sg.dominic.animals;


import sg.dominic.featues.AnimalPhonicSounnd;
import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.NonFlyable;

public class Rooster extends Bird implements MakeSound{
	
	AnimalPhonicSounnd phonics;
	
	public void setPhonics(AnimalPhonicSounnd phonics) {
		this.phonics = phonics;
	}
	
	
	public void sound() {
		//System.out.println("Cock a doodle doo");
		System.out.println(phonics.noise(this.secondLanguage, "Cock a doodle doo"));
	}

	/*@Override
	public void sound() {
		System.out.println("Cock a doodle doo");
		
	}*/
	
	public String sex(){
		return "Male";
	}
	
	 public Rooster(){
		this.flyingPattern = new NonFlyable();
		
	}

}
