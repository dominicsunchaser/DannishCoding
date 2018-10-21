package sg.dominic.animals;

import sg.dominic.featues.MakeSound;

public class Dog extends Animal implements MakeSound  {

	@Override
	public void sound() {
		System.out.println("Woof Woof");

	}

	

}
