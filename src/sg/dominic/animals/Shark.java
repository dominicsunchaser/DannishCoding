package sg.dominic.animals;

import sg.dominic.featuresimpl.FishFeatues;

public class Shark extends Fish {
	
	public Shark(){
		FishFeatues sharkFeatures = new FishFeatues("large", "grey");
		sharkFeatures.addBehaviours("Eat fish");
		setFeatures(sharkFeatures);
	}

}
