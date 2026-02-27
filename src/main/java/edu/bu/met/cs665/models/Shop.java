/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2026
 * File Name: Shop.java
 * Description: This class is responsible for .
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject {
    private final List<Observer> drivers = new ArrayList<>();
    private final String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void registerDriver(Observer o) {
        drivers.add(o);
    }

    @Override
    public void removeDriver(Observer o) {
        drivers.remove(o);
    }

    @Override
    public void notifyDrivers(DeliveryRequest request) {
        for (Observer driver : drivers) {
            driver.update(request);
        }
    }

    public void createDeliveryRequest(String id, String product, String destination) {
        DeliveryRequest request = new DeliveryRequest(id, product, destination);
        System.out.println(shopName + " created a new request.");
        notifyDrivers(request);
    }
}
