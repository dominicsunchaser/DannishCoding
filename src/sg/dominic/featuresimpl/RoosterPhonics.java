package sg.dominic.featuresimpl;

import sg.dominic.featues.AnimalPhonicSounnd;

public class RoosterPhonics implements AnimalPhonicSounnd {

	
	public String noise(String language,String engSound) {
		
		switch(language){
		case "Danish" : return "kykyliky";
						
		case "Dutch" : return "kukeleku";
			
		case "Finnish" : return "cocorico";
						
		default : return engSound;
						
					
		}
	}

}
