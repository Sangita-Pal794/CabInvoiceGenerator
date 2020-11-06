package com.bridgelabz.cabinvoicegenerator;
import java.util.ArrayList;

public class CabInvoiceGenerator {
	private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;

  //calculates fare for given distance and time for which the journey lasted
    
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;
        return Math.max(totalFare, MINIMUM_FARE);
    }
    
    
    public InvoiceSummary calculateFare(ArrayList<Ride> rides) { //calls calculateFare method for multiple rides and generates invoice summary
        double totalFare = 0;
        for (Ride ride : rides)
            totalFare += this.calculateFare(ride.distance ,ride.time);
        return new InvoiceSummary(rides.size(), totalFare);
    }

  //returns ride list of a userid
    
    public ArrayList<Ride> getListOfRides(User user) { 
        return user.getRideList();
    }
}
