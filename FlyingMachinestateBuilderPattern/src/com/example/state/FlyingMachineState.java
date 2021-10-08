package com.example.state;

/**
 * 
 * Flying Machine States
 *
 */
public interface FlyingMachineState {

	public void startFlyingMachine();
	
	public void runwayFlyingMachine();

	public void takeOffFlyingMachine();

	public void landFlyingMachine();

	public void stopFlyingMachine();

}
