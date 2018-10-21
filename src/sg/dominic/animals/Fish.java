package sg.dominic.animals;

import sg.dominic.featuresimpl.FishFeatues;
import sg.dominic.featuresimpl.Swimable;

public class Fish extends Animal {
	
	FishFeatues features;
	
	public Fish(){
		super();
		this.swimingPattern = new Swimable();
	}

	public void setFeatures(FishFeatues features) {
		this.features = features;
	}

}
