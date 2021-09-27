package com.ltts;
import java.util.Scanner;

class HotelRoom{
	protected String hotelname;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	int ratePerSqFeet = rateperSqFeet();
	
	public HotelRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelname = hotelname;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public int calculateTarrif() {
		int res = numberOfSqFeet * ratePerSqFeet;
		return res;
	}
	public int rateperSqFeet() {
		return 0;
    }
}
class DeluxeRoom extends HotelRoom{

	protected int ratePerSqFeet;
	
	public DeluxeRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelname, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
    public int rateperSqFeet() {
    	if(hasWifi == true)
    	{
    		int s = this.ratePerSqFeet+2;
    		return s;
    	}
    	else
    		return this.ratePerSqFeet;
    }
    
}
class DeluxeACRoom extends HotelRoom {
	
	protected int ratePerSqFeet;
	public DeluxeACRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelname, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
}
class SuiteACRoom extends HotelRoom{
	
	private int ratePerSqFeet;
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = 15;
	}
	public SuiteACRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelname, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = getRatePerSqFeet();
	}
    public int rateperSqFeet() {
    	if(hasWifi == true)
    		return ratePerSqFeet+2;
    	else
    		return ratePerSqFeet;
    }
}
public class HotelRoomInheritance {
	public static void main(String[] args) {
		System.out.println("Hotel Tariff Calculator\n1.Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room\nSelect Room Type:");
		int n;
		Scanner N = new Scanner(System.in);
		n = N.nextInt();
		System.out.println("Hotel Name:");
		Scanner HotelName = new Scanner(System.in);
		String hotelName = HotelName.nextLine();
		System.out.println("Room Square Feet Area:");
		Scanner NumberOfSqFeet = new Scanner(System.in);
		int numberOfSqFeet = NumberOfSqFeet.nextInt();
		System.out.println("Room has TV(true/false)");
		Scanner HasTV = new Scanner(System.in);
		boolean hasTV = HasTV.nextBoolean();
		System.out.println("Room has WiFi(true/false)");
		Scanner HasWifi = new Scanner(System.in);
		boolean hasWifi = HasWifi.nextBoolean();
		if(n==1)
		{
			DeluxeRoom obj1 = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			obj1.rateperSqFeet();
			int s = obj1.calculateTarrif();
			System.out.println("Room Tariff per day is "+s);
		}
		else if(n==2)
		{
			DeluxeACRoom obj2 = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			int s = obj2.calculateTarrif();
			System.out.println("Room Tariff per day is "+s);
		}
		else if(n==3)
		{
			SuiteACRoom obj3 = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			obj3.rateperSqFeet();
			int s = obj3.calculateTarrif();
			System.out.println("Room Tariff per day is "+s);
		}
		else
			System.out.println("Invalid");
	}
}
