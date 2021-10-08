package com.example.state;

/**
 * 
 * Start FlyingMachine State
 *
 */
public class StartFlyingMachineState implements FlyingMachineState {

	private FlyingMachine flyingMachine;

	public StartFlyingMachineState(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;

	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Start the FlyingMachine");
		flyingMachine.setState(flyingMachine.runwayFlyingMachineState);

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Cannot Take off, as Flying Machine is not Started");

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Cannot Land, as flyingMachine is not in Take Off State");

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Cannot Stop, as flyingMachine Process is not in Landed state");

	}

	@Override
	public void runwayFlyingMachine() {
		System.out.println("Cannot do Runway, as flyingMachine Process is not in Start state");
		
	}

}
