package sg.dominic.animals;

import sg.dominic.featuresimpl.FishFeatues;

public class CLownFish extends Fish {
	
	public CLownFish(){
			FishFeatues sharkFeatures = new FishFeatues("small", "orange");
			sharkFeatures.addBehaviours("Makes Jokes");
			setFeatures(sharkFeatures);
	}

}
