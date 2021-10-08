package com.example.state;

/**
 * 
 * Land state of Flying Machine
 *
 */
public class RunWayFlyingMachine implements FlyingMachineState {

	private FlyingMachine flyingMachine;

	public RunWayFlyingMachine(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;
	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Cannot Start, as flyingMachine Process is already in Runway state");

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Cannot Take Off, as flyingMachine Process is already in Runway state");

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Cannot Land, as flyingMachine Process is Runway State");

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Cannot Stop, as flyingMachine Process is Runway State");

	}

	@Override
	public void runwayFlyingMachine() {
		System.out.println("RunWay FlyingMachine");
		flyingMachine.setState(flyingMachine.takeOffFlyingMachineState);
		
	}

}
