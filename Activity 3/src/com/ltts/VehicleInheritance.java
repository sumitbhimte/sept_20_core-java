package com.ltts;

import java.util.Scanner;

class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake() {
		System.out.println("***"+make+"***");
	}
	public void displayBasicInfo() {
		System.out.println("--Basic Information--\nVehicle Number:"+vehicleNumber+"\nFuel Capacity:"+fuelCapacity+"\nFuel Type:"+fuelType+"\nCC:"+cc);
	}
	public void displayDetailInfo() {

	}
}
class TwoWheeler extends Vehicle{

	private boolean kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.setKickStartAvailable(kickStartAvailable);
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo() {
		System.out.println("--Detail Information--\nKick Start Available:"+kickStartAvailable);
	}
	
}
class FourWheeler extends Vehicle{

	private String audioSystem;
	private int numberOfdoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, int numberOfdoors, String audioSystem) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfdoors= numberOfdoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfdoors() {
		return numberOfdoors;
	}
	public void setNumberOfdoors(int numberOfdoors) {
		this.numberOfdoors = numberOfdoors;
	}
	public void displayDetailInfo() {
		System.out.println("--Detail Information--\nAudio System:"+audioSystem+"\nNumber of Doors:"+numberOfdoors);
	}
}
public class VehicleInheritance {

	public static void main(String[] args) {
		int n;
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		Scanner N = new Scanner(System.in);
		n = N.nextInt();
		System.out.println("Vehicle make:");
		Scanner Make = new Scanner(System.in);
		String make = Make.nextLine();
		System.out.println("Vehicle Number:");
		Scanner VehicleNumber = new Scanner(System.in);
		String vehicleNumber = VehicleNumber.nextLine();
		System.out.println("Fuel Type(Petrol/Diesel):");
		Scanner FuelType = new Scanner(System.in);
		String fuelType = FuelType.nextLine();
		System.out.println("Fuel Capacity:");
		Scanner FuelCapacity = new Scanner(System.in);
		int fuelCapacity = FuelCapacity.nextInt();
		System.out.println("CC:");
		Scanner Cc = new Scanner(System.in);
		int cc = Cc.nextInt();
		if(n==1)
		{
			System.out.println("Audio System:");
			Scanner AudioSystem = new Scanner(System.in);
			String audioSystem = AudioSystem.nextLine();
			System.out.println("Number of Doors:");
			Scanner NumberOfdoors = new Scanner(System.in);
			int numberOfdoors = NumberOfdoors.nextInt();
			FourWheeler car = new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,numberOfdoors,audioSystem);
			car.displayMake();
			car.displayBasicInfo();
			car.displayDetailInfo();
		}
		else if(n==2)
		{
			System.out.println("Kick start Available:");
			Scanner KickStartAvailable = new Scanner(System.in);
			boolean kickStartAvailable = KickStartAvailable.nextBoolean();
			TwoWheeler bike = new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,kickStartAvailable);
			bike.displayMake();
			bike.displayBasicInfo();
			bike.displayDetailInfo();
		}
		else
			System.out.println("Invalid");
	}

}
