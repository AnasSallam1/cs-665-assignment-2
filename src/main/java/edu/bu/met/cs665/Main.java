/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2026
 * File Name: Main.java
 * Description: This is Main class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.Driver;
import edu.bu.met.cs665.models.Observer;
import edu.bu.met.cs665.models.Shop;

public class Main {
    /**
     * A main method to simulate the delivery notification system.
     */
    public static void main(String[] args) {
        // Initialize the Shop
        Shop retailShop = new Shop("Boston University Retailer") {
            @Override
            public void addDriver(Observer o) {

            }
        };

        // Create at least 5 Driver instances (The Observers)
        Driver driver1 = new Driver("Harry", "Broomstick");
        Driver driver2 = new Driver("Ron", "Car");
        Driver driver3 = new Driver("Hermione", "Bike");
        Driver driver4 = new Driver("Draco", "Scooter");
        Driver driver5 = new Driver("Neville", "Truck");

        // Register the drivers to the shop
        retailShop.addDriver(driver1);
        retailShop.addDriver(driver2);
        retailShop.addDriver(driver3);
        retailShop.addDriver(driver4);
        retailShop.addDriver(driver5);

        // Broadcast a delivery request
        System.out.println("- Starting Broadcast --------------------");
        retailShop.createDeliveryRequest("6396", "Book", "123 Commonwealth Ave");
        System.out.println("- Broadcast Complete --------------------\n");

        // Remove a driver and broadcast again
        retailShop.removeDriver(driver3);
        System.out.println("- Starting Second Broadcast --------------------");
        retailShop.createDeliveryRequest("7130", "Backpack", "321 Harvard Ave");
    }
}