package com.example.state;

import com.example.state.FlyingMachineBuilder.MachineType;

/**
 *
 * FlyingMachine
 *
 */
public class FlyingMachine {

	FlyingMachineState startFlyingMachineState;
	FlyingMachineState landFlyingMachineState;
	FlyingMachineState stopFlyingMachineState;
	FlyingMachineState takeOffFlyingMachineState;
	FlyingMachineState runwayFlyingMachineState;

	FlyingMachineState state;
	
	String engine;

	String machineType;

	int capacity;
	
	int businessSeats;

	public FlyingMachine() {

		startFlyingMachineState = new StartFlyingMachineState(this);
		runwayFlyingMachineState = new RunWayFlyingMachine(this);
		takeOffFlyingMachineState = new TakeOffFlyingMachineState(this);
		landFlyingMachineState = new LandFlyingMachineState(this);
		stopFlyingMachineState = new StopFlyingMachineState(this);

		// start state
		this.state = startFlyingMachineState;

	}

	public void startFlyingMachine() {
		state.startFlyingMachine();
	}

	public void takeOffFlyingMachine() {
		state.takeOffFlyingMachine();
	}

	public void landFlyingMachine() {
		state.landFlyingMachine();
	}

	public void stopFlyingMachine() {
		state.stopFlyingMachine();
	}

	public FlyingMachineState getStartFlyingMachineState() {
		return startFlyingMachineState;
	}

	public void setStartFlyingMachineState(FlyingMachineState startFlyingMachineState) {
		this.startFlyingMachineState = startFlyingMachineState;
	}

	public FlyingMachineState getLandFlyingMachineState() {
		return landFlyingMachineState;
	}

	public void setLandFlyingMachineState(FlyingMachineState landFlyingMachineState) {
		this.landFlyingMachineState = landFlyingMachineState;
	}

	public FlyingMachineState getStopFlyingMachineState() {
		return stopFlyingMachineState;
	}

	public void setStopFlyingMachineState(FlyingMachineState stopFlyingMachineState) {
		this.stopFlyingMachineState = stopFlyingMachineState;
	}

	public FlyingMachineState getTakeOffFlyingMachineState() {
		return takeOffFlyingMachineState;
	}

	public void setTakeOffFlyingMachineState(FlyingMachineState takeOffFlyingMachineState) {
		this.takeOffFlyingMachineState = takeOffFlyingMachineState;
	}

	public FlyingMachineState getState() {
		return state;
	}

	public void setState(FlyingMachineState state) {
		this.state = state;
	}

	public FlyingMachineState getRunwayFlyingMachineState() {
		return runwayFlyingMachineState;
	}

	public void setRunwayFlyingMachineState(FlyingMachineState runwayFlyingMachineState) {
		this.runwayFlyingMachineState = runwayFlyingMachineState;
	}

	public void runwayFlyingMachine() {
		state.runwayFlyingMachine();
		
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlyingMachine [engine=");
		builder.append(engine);
		builder.append(", machineType=");
		builder.append(machineType);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", businessSeats=");
		builder.append(businessSeats);
		builder.append("]");
		return builder.toString();
	}
	
	

}
