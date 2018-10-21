package sg.dominic.animals;

import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.ParrotLivingWithAdaptor;

public class Parrot extends Bird implements MakeSound {
	
	ParrotLivingWithAdaptor livingWithAdaptor;

	public void setLivingWithAdaptor(ParrotLivingWithAdaptor livingWithAdaptor) {
		this.livingWithAdaptor = livingWithAdaptor;
	}
	
	@Override
	public void sound() {
		livingWithAdaptor.noise();
	}
	
	
	
	

}
