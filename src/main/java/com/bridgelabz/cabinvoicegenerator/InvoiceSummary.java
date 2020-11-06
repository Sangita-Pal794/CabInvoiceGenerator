package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
	
	private double averageFare;
    private int numberOfRides;
    private double totalFare;

    public InvoiceSummary(int numberOfRides , double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.averageFare, averageFare) == 0 &&
                numberOfRides == that.numberOfRides &&
                Double.compare(that.totalFare, totalFare) == 0;
    }

}
