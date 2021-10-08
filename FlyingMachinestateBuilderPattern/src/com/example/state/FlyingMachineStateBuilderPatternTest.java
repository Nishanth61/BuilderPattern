package com.example.state;

public class FlyingMachineStateBuilderPatternTest {

	public static void main(String[] args) {

		/**
		 * Builder Pattern
		 */
		FlyingMachineBuilder builder = new StopFlyingMachineState();
		FlyingMachine flyingMachine = builder.addEngine().addMachineType().addCapacity().addBusinessSeats().build();
		System.out.println(flyingMachine);

		/**
		 * State Pattern
		 */
		flyingMachine.startFlyingMachine();
		flyingMachine.runwayFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

		flyingMachine.startFlyingMachine();
		flyingMachine.runwayFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

		flyingMachine.startFlyingMachine();
		flyingMachine.runwayFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

	}

}
