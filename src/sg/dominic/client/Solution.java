package sg.dominic.client;

import java.util.Arrays;


import sg.dominic.animals.Animal;
import sg.dominic.animals.Bird;
import sg.dominic.animals.Cat;
import sg.dominic.animals.Chicken;
import sg.dominic.animals.Dog;
import sg.dominic.animals.Duck;
import sg.dominic.animals.Parrot;
import sg.dominic.animals.Rooster;
import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.ParrotLivingWithAdaptor;

public class Solution {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal chicken = new Chicken();
		
		Animal duck = new Duck();
		Animal rooster = new Rooster();
		Parrot parrot = new Parrot();
		
		MakeSound dog  = new Dog();
		MakeSound cat = new Cat();
		
		ParrotLivingWithAdaptor withDog = new ParrotLivingWithAdaptor(dog);
		ParrotLivingWithAdaptor withCat = new ParrotLivingWithAdaptor(cat);
		ParrotLivingWithAdaptor withRooster = new ParrotLivingWithAdaptor((MakeSound)rooster);
		
		parrot.setLivingWithAdaptor(withDog);
		parrot.sound();
		parrot.setLivingWithAdaptor(withCat);
		parrot.sound();
		parrot.setLivingWithAdaptor(withRooster);
		parrot.sound();
		
		
		
	}

}
