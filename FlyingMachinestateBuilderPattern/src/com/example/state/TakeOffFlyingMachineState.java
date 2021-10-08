package com.example.state;

/**
 * 
 * Take off state of flying machine
 *
 */
public class TakeOffFlyingMachineState implements FlyingMachineState {

	private FlyingMachine flyingMachine;

	public TakeOffFlyingMachineState(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;
	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Cannot Start, as flyingMachine Process is already started");

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Taking off flyingMachine");
		flyingMachine.setState(flyingMachine.landFlyingMachineState);

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Cannot Land, as flyingMachine is in Take off state");

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Cannot Stop, as take off is just happened");

	}

	@Override
	public void runwayFlyingMachine() {
		System.out.println("Cannot do runway, as take off is just happened");
		
	}

}
