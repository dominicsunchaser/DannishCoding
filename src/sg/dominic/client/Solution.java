package sg.dominic.client;

import java.util.Arrays;


import sg.dominic.animals.Animal;
import sg.dominic.animals.Bird;
import sg.dominic.animals.ButterFly;
import sg.dominic.animals.CLownFish;
import sg.dominic.animals.Cat;
import sg.dominic.animals.Chicken;
import sg.dominic.animals.Dog;
import sg.dominic.animals.Dolhpin;
import sg.dominic.animals.Duck;
import sg.dominic.animals.Fish;
import sg.dominic.animals.Parrot;
import sg.dominic.animals.Rooster;
import sg.dominic.animals.Shark;
import sg.dominic.featues.MakeSound;
import sg.dominic.featuresimpl.Flyable;
import sg.dominic.featuresimpl.NonFlyable;
import sg.dominic.featuresimpl.NonWalkable;
import sg.dominic.featuresimpl.ParrotLivingWithAdaptor;
import sg.dominic.featuresimpl.RoosterPhonics;
import sg.dominic.featuresimpl.Walkable;

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
		
		Animal catapillar = new Animal();
		catapillar.setFlyingPattern(new NonFlyable());
		catapillar.setWalkabePattern(new Walkable());
		
		catapillar.setFlyingPattern(new Flyable());
		catapillar.setWalkabePattern(new NonWalkable());
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new CLownFish(),
				new Dolhpin(),
				new Dog(),
				new ButterFly(),
				new Cat()
				};
		
		long fly_cnt  = Arrays.stream(animals).filter(x -> x.flyingPattern.fly()).count();
		
		long walk_cnt  = Arrays.stream(animals).filter(x -> x.walkabePattern.isWalkable()).count();
		
		long sing_cnt  = Arrays.stream(animals).filter(x -> x.singingPattern.sing()).count();
		
		long swim_cnt  = Arrays.stream(animals).filter(x -> x.swimingPattern.swim()).count();
		
		Rooster roosterObj  = (Rooster)rooster;
		roosterObj.setPhonics(new RoosterPhonics());
		roosterObj.sound();
		
		
		
		
		
	}

}
