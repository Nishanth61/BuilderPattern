package com.example.state;

/**
 * 
 * Stop Flying Machine State
 *
 */
public class StopFlyingMachineState extends FlyingMachineBuilder implements FlyingMachineState {

	private FlyingMachine flyingMachine;
	
	public StopFlyingMachineState() {
		
	}

	public StopFlyingMachineState(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;
	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Cannot Start, as flyingMachine is in Stopping state");

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Cannot Take off, as flyingMachine Process is stopping state");

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Cannot Land, as flyingMachine Process is in stopping state");

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Stopping FlyingMachine");
		flyingMachine.setState(flyingMachine.startFlyingMachineState);
	}

	@Override
	public void runwayFlyingMachine() {
		System.out.println("Cannot do runway, as flyingMachine Process is in stopping state");

	}

	@Override
	public FlyingMachineBuilder addEngine() {
		this.engine = "Rolls-Royce Trent XWB";
		return this;
	}

	@Override
	public FlyingMachineBuilder addMachineType() {
		this.machineType = MachineType.INTERNATIONAL;
		return this;
	}

	@Override
	public FlyingMachineBuilder addCapacity() {
		this.capacity = 100;
		return this;
	}

	@Override
	public FlyingMachineBuilder addBusinessSeats() {
		this.businessSeats = 30;
		return this;
	}

}
