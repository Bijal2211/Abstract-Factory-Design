package com.miit;

public class ToyotaCompany extends VehicleCompany {

	@Override
	public Car createCar() {

		return new ToyotaCar();
	}

	@Override
	public Bike createBike() {

		return new ToyotaBike();
	}

}
