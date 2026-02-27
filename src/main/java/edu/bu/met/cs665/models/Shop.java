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

public abstract class Shop implements Subject {
    private final List<Observer> drivers = new ArrayList<>();
    private final String shopName;

    /**
     * Create a Shop object using shopName.
     *
     * @param shopName, name of the shop
     */
    public Shop(String shopName) {
        this.shopName = shopName;
    }

    /**
     * This method inserts a new association between a movie and a director into the movie_directors join table.
     * We use "IGNORE" to prevent errors if the specific relationship already exists.
     */
    @Override
    public void addDriver(Observer o) {
        drivers.add(o);
    }

    /**
     * This method inserts a new association between a movie and a director into the movie_directors join table.
     * We use "IGNORE" to prevent errors if the specific relationship already exists.
     */
    @Override
    public void removeDriver(Observer o) {
        drivers.remove(o);
    }

    /**
     * This method inserts a new association between a movie and a director into the movie_directors join table.
     * We use "IGNORE" to prevent errors if the specific relationship already exists.
     */
    @Override
    public void notifyDrivers(DeliveryRequest request) {
        for (Observer driver : drivers) {
            driver.update(request);
        }
    }

    /**
     * This method inserts a new association between a movie and a director into the movie_directors join table.
     * We use "IGNORE" to prevent errors if the specific relationship already exists.
     */
    public void createDeliveryRequest(String id, String product, String destination) {
        DeliveryRequest request = new DeliveryRequest(id, product, destination);
        System.out.println(shopName + " created a new request.");
        notifyDrivers(request);
    }
}
