package main;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		Dog entity1 = new Dog(126, 418);
		Dog entity2 = new Dog(251, 502);

		Time time = new Time();
		time.addTemporalizedEntity(entity1);
		time.addTemporalizedEntity(entity2);
	}

}
