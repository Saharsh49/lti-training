package com.lti.runtimepoly;

interface Vehicle{
	public void start();
	public void stop();
}

		
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	

	public void drive() {
		System.out.println("Car driving");
	}
	
}

class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");
		
	}
	
	public void ride() {
		System.out.println("Bike ride");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.start();
		v2.stop();
}

}
