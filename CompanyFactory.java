package com.miit;

public class CompanyFactory {

	public static void main(String[] args) {

		VehicleCompany hyundai = new HyundaiCompany();

		Bike HyundaiBike = hyundai.createBike();
		HyundaiBike.company();

		Car HyundaiCar = hyundai.createCar();
		HyundaiCar.company();

		VehicleCompany Toyo = new ToyotaCompany();

		Bike ToyotaBike = Toyo.createBike();
		ToyotaBike.company();

		Car ToyotaCar = Toyo.createCar();
		ToyotaCar.company();

	}

}
