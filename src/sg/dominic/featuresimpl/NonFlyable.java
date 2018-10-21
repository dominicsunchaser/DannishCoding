package sg.dominic.featuresimpl;

import sg.dominic.featues.FlyingPattern;

public class NonFlyable implements FlyingPattern {

	@Override
	public boolean fly() {
		return false;

	}

}
