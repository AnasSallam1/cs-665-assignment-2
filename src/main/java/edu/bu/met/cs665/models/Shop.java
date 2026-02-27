/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2026
 * File Name: Shop.java
 * Description: This class is responsible for creating a new instance of a Shop object.
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject {
    private final List<Observer> drivers = new ArrayList<>();
    private final String shopName;

    /**
     * Create a Shop object using a name
     *
     * @param shopName, name of the retail store
     */
    public Shop(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Adds a driver to the request list
     *
     * @param o, The observer (driver) to be added
     */
    @Override
    public void addDriver(Observer o) {
        if (o != null) {
            drivers.add(o);
        }
    }

    /**
     * Removes a driver from the request list.
     *
     * @param o, The observer (driver) to be removed
     */
    @Override
    public void removeDriver(Observer o) {
        drivers.remove(o);
    }

    /**
     * Broadcasts a request to all observers
     *
     * @param request, The data object containing delivery details
     */
    @Override
    public void notifyDrivers(DeliveryRequest request) {
        for (Observer driver : drivers) {
            driver.update(request);
        }
    }

    /**
     * Create a delivery request and notify the drivers
     */
    public void createDeliveryRequest(String id, String product, String destination) {
        DeliveryRequest request = new DeliveryRequest(id, product, destination);
        System.out.println(shopName + " created a new request: " + id);
        notifyDrivers(request);
    }

    /**
     * Returns the number of currently registered drivers
     */
    public int getDriverCount() {
        return drivers.size();
    }
}