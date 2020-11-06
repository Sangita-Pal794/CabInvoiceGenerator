package com.bridgelabz.cabinvoicegenerator;
import java.util.ArrayList;

public class User {
	String userid;
    private ArrayList<Ride> rideList;

    public User(String userid ) { //initializes a userid and a rideList that will be used to store multiple rides for the userid
        this.userid = userid;
        this.rideList = new ArrayList<>();
    }

    public ArrayList<Ride> getRideList() {
        return rideList;
    }

    public void addRide(double distance , int time) {  //adds ride details to rideList
        this.rideList.add(new Ride(distance , time));
    }
}
