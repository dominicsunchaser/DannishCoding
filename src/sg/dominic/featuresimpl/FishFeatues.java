package sg.dominic.featuresimpl;

import java.util.ArrayList;
import java.util.List;

public class FishFeatues {
	
	String size;
	
	String color;
	
	List<String> behavious;
	
	public FishFeatues(String sizeParam, String colorParam){
		this.size = sizeParam;
		this.color = colorParam;
		behavious = new ArrayList<String>();
	}
	
	public void addBehaviours(String behaviours){
		this.behavious.add(behaviours);
	}

}
