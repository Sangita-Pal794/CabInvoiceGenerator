package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class CabInvoiceGeneratorTest {
	
	@Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25 , totalFare , 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5 , totalFare , 0.0);
    }
    
    @Test
    public void givenMultipleRides_ShoulReturnIvoiceSummary() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        User newUser = new User("Piya");
        newUser.addRide(2.0 , 5 , "normal");
        newUser.addRide(0.5 , 5 , "normal");
        newUser.addRide(0.1 , 1 , "normal");
        ArrayList<Ride> rideListForId = cabInvoiceGenerator.getListOfRides(newUser);
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare(rideListForId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3 , 40.0);
        Assert.assertEquals(expectedInvoiceSummary , invoiceSummary);
    }
    
    @Test
    public void givenUserIdAndPremiumRideCategory_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        User newUser = new User("Piya");
        newUser.addRide(2.0 , 5 , "premium");
        newUser.addRide(0.5 , 5 , "premium");
        newUser.addRide(0.1 , 1 , "normal");
        ArrayList<Ride> rideListForId = cabInvoiceGenerator.getListOfRides(newUser);
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare(rideListForId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3 , 65);
        Assert.assertEquals(expectedInvoiceSummary , invoiceSummary);
    }
}
