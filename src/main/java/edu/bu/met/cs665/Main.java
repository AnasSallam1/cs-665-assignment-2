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
        Shop retailShop = new Shop("Copley Place Retailer") {
            @Override
            public void registerDriver(Observer o) {
                
            }
        };

        // Create at least 5 Driver instances (The Observers)
        Driver driver1 = new Driver("Alice", "Van");
        Driver driver2 = new Driver("Bob", "Taxi");
        Driver driver3 = new Driver("Charlie", "Scooter");
        Driver driver4 = new Driver("Diana", "Scooter");
        Driver driver5 = new Driver("Edward", "Van");

        // Register the drivers to the shop
        retailShop.addDriver(driver1);
        retailShop.addDriver(driver2);
        retailShop.addDriver(driver3);
        retailShop.addDriver(driver4);
        retailShop.addDriver(driver5);

        // Broadcast a delivery request
        // This will automatically notify all 5 registered drivers.
        System.out.println("--- Starting Broadcast ---");
        retailShop.createDeliveryRequest("ORD-77", "Organic Coffee Beans", "123 Commonwealth Ave");
        System.out.println("--- Broadcast Complete ---\n");

        // Example of flexibility: Remove a driver and broadcast again
        retailShop.removeDriver(driver3); // Charlie goes offline
        System.out.println("--- Starting Second Broadcast (Charlie removed) ---");
        retailShop.createDeliveryRequest("ORD-78", "Tea Set", "725 Albany St");
    }
}