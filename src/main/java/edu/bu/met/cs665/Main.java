/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2026
 * File Name: Main.java
 * Description: This is Main class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.Driver;
import edu.bu.met.cs665.models.Shop;

/**
 * Main class to simulate the delivery notification system.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Initialize the Shop (The Subject)
        Shop retailShop = new Shop("Copley Place Retailer");

        // 2. Create at least 5 Driver instances (The Observers)
        Driver driver1 = new Driver("Alice", "Van");
        Driver driver2 = new Driver("Bob", "Taxi");
        Driver driver3 = new Driver("Charlie", "Scooter");
        Driver driver4 = new Driver("Diana", "Scooter");
        Driver driver5 = new Driver("Edward", "Van");

        // 3. Register the drivers to the shop
        retailShop.registerDriver(driver1);
        retailShop.registerDriver(driver2);
        retailShop.registerDriver(driver3);
        retailShop.registerDriver(driver4);
        retailShop.registerDriver(driver5);

        // 4. Broadcast a delivery request
        // This will automatically notify all 5 registered drivers.
        System.out.println("--- Starting Broadcast ---");
        retailShop.createDeliveryRequest("ORD-77", "Organic Coffee Beans", "123 Commonwealth Ave");
        System.out.println("--- Broadcast Complete ---\n");

        // 5. Example of flexibility: Remove a driver and broadcast again
        retailShop.removeDriver(driver3); // Charlie goes offline
        System.out.println("--- Starting Second Broadcast (Charlie removed) ---");
        retailShop.createDeliveryRequest("ORD-78", "Tea Set", "725 Albany St");
    }
}