package sg.dominic.featuresimpl;

import sg.dominic.featues.SwimPattern;

public class NonSwimable implements SwimPattern {

	@Override
	public boolean swim() {
		return false;
	}

}
