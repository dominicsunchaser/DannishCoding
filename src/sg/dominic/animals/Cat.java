package sg.dominic.animals;

import sg.dominic.featues.MakeSound;

public class Cat extends Animal implements MakeSound {

	@Override
	public void sound() {
		System.out.println("Meow Meow");

	}

	

}
