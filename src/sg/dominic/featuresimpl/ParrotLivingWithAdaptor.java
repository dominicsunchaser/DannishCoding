package sg.dominic.featuresimpl;

import sg.dominic.featues.MakeSound;

public class ParrotLivingWithAdaptor {
	MakeSound  animal;
	
	public ParrotLivingWithAdaptor(MakeSound  animalParam){
		this.animal = animalParam;
	}
	
	public void noise(){
		this.animal.sound();
	}
	

}
