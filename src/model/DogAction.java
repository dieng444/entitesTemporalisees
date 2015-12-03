package model;

public class DogAction {
	
	private String label;
	private long startTime;
	private long finishTime;
	private long currentTime;
	
	public void bark() {
		System.out.println("wouaf");
	}
	
	public void sleep() {
		System.out.println("zzZZZzzz");
	}

	public void eat() {
		System.out.println("Miam!");
	}
	
}
