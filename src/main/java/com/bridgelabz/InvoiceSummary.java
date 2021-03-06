package com.bridgelabz;

public class InvoiceSummary {
    public int numberOfRides;
    public double totalFare;
    public double averageFarePerRide;

    public InvoiceSummary(int numOfRides, double totalFare) {
        this.numberOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return numberOfRides == summary.numberOfRides &&
                Double.compare(summary.totalFare, totalFare) == 0 &&
                Double.compare(summary.averageFarePerRide, averageFarePerRide) == 0;
    }
}


