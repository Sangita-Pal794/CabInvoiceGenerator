package com.bridgelabz.cabinvoicegenerator;

public class Ride {
	
	public String rideCategory;
	public double distance;
    public int time;

    public Ride(double distance, int time, String rideCategory) {
        this.distance = distance;
        this.time = time;
        this.rideCategory = rideCategory;
    }
    
    @Override
    public String toString() {
        return  "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }
}
