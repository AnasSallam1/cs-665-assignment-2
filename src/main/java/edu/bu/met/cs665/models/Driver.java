/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/18/2026
 * File Name: Driver.java
 * Description: This class is responsible for .
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;

public class Driver implements Observer {
    private final String driverName;
    private final String vehicleType;

    public Driver(String name, String vehicleType) {
        this.driverName = name;
        this.vehicleType = vehicleType;
    }

    @Override
    public void update(DeliveryRequest request) {
        System.out.println("Notification to " + driverName + " (" + vehicleType + "): "
                + request.getDetails());
    }
}
