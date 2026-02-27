/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/18/2026
 * File Name: Driver.java
 * Description: This class is responsible for creating a new instance of a Driver object.
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;

public class Driver implements Observer {
    private final String driverName;
    private final String vehicleType;

    /**
     * Create a Driver object using name and vehicleType
     *
     * @param name, name of the driver
     * @param vehicleType, type of vehicle
     */
    public Driver(String name, String vehicleType) {
        this.driverName = name;
        this.vehicleType = vehicleType;
    }

    /**
     * Receives and processes a delivery request notification from the shop
     *
     * @param request, the details of the delivery order
     */
    @Override
    public void update(DeliveryRequest request) {
        System.out.println("Notification to " + driverName + " (" + vehicleType + "): "
                + request.getDetails());
    }
}
