package com.miit;

public class HyundaiCompany extends VehicleCompany {

	@Override
	public Car createCar() {

		return new HyundaiCar();
	}

	@Override
	public Bike createBike() {

		return new HyundaiBike();
	}

}
