package main;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		Dog entity1 = new Dog(126, 418);
		Dog entity2 = new Dog(251, 502);

		entity1.addDogAction(new DogAction());
		entity2.addDogAction(new DogAction(100, 150, DogAction.BARK));
		
		entity1.doAction();
		entity2.doAction();
		
		Time time = new Time();
		time.addTemporalizedEntity(entity1);
		time.addTemporalizedEntity(entity2);
	}

}
