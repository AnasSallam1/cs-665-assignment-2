/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/25/2026
 * File Name: TestApp.java
 * Description: This class is responsible for testing the application.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.Driver;
import edu.bu.met.cs665.models.Shop;
import org.testng.annotations.Test;


public class TestApp {

    @Test
    public void testBroadcastToDrivers() {
        Shop myShop = new Shop("Downtown Retailer");

        // Create minimum 5 drivers
        Driver d1 = new Driver("Alice", "Van");
        Driver d2 = new Driver("Bob", "Taxi");
        Driver d3 = new Driver("Charlie", "Scooter");
        Driver d4 = new Driver("Diana", "Scooter");
        Driver d5 = new Driver("Edward", "Taxi");

        // Register them
        myShop.registerDriver(d1);
        myShop.registerDriver(d2);
        myShop.registerDriver(d3);
        myShop.registerDriver(d4);
        myShop.registerDriver(d5);

        // Broadcast a single request
        myShop.createDeliveryRequest("101", "Gaming Laptop", "456 City Square");

        // In a real JUnit test, you would use a Mock or a counter
        // to assert that update() was called 5 times.
    }
}
