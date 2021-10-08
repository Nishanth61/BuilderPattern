package com.example.state;

public abstract class FlyingMachineBuilder {

	String engine;

	enum MachineType {
		CARGO, DOMESTIC, INTERNATIONAL
	}

	MachineType machineType;

	int capacity;

	int businessSeats;

	public abstract FlyingMachineBuilder addEngine();

	public abstract FlyingMachineBuilder addMachineType();

	public abstract FlyingMachineBuilder addCapacity();

	public abstract FlyingMachineBuilder addBusinessSeats();

	public FlyingMachine build() {
		FlyingMachine flyingMachine = new FlyingMachine();
		flyingMachine.setEngine(engine);
		flyingMachine.setMachineType(machineType.toString());
		flyingMachine.setCapacity(capacity);
		flyingMachine.setBusinessSeats(businessSeats);
		return flyingMachine;
	}

}
