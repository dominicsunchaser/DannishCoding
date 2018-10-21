package sg.dominic.featuresimpl;

import sg.dominic.featues.SingingPattern;

public class BirdNonSinging implements SingingPattern  {

	@Override
	public boolean sing() {
		return false;
	}

}
