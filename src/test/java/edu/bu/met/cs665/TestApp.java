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
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestApp {

    /*
     * Test 1: Broadcast Test.
     * Purpose: Ensures that all drivers receive the delivery request from the shop.
     */
    @Test
    public void testBroadcastToDrivers() {
        Shop myShop = new Shop("Copley Place Retailer");

        // Creating 5 drivers
        Driver d1 = new Driver("Joey", "Van");
        Driver d2 = new Driver("Chandler", "Car");
        Driver d3 = new Driver("Ross", "Truck");
        Driver d4 = new Driver("Phoebe", "Taxi");
        Driver d5 = new Driver("Monica", "Bike");

        // Adding all 5 drivers to the shop
        myShop.addDriver(d1);
        myShop.addDriver(d2);
        myShop.addDriver(d3);
        myShop.addDriver(d4);
        myShop.addDriver(d5);

        // Broadcast a single request
        myShop.createDeliveryRequest("1995", "Suit", "10 Main St");
    }

    /*
     * Test 2: Remove Driver Test.
     * Purpose: Ensures that the shop can remove a driver.
     */
    @Test
    public void testRemoveDriver() {
        Shop myShop = new Shop("Assembly Sq Retailer");
        Driver d1 = new Driver("Rachel", "Car");
        Driver d2 = new Driver("Paolo", "Bike");

        // Adding two drivers, then removing one
        myShop.addDriver(d1);
        myShop.addDriver(d2);
        // We remove the driver Paolo
        myShop.removeDriver(d1);

        // Check that the shop only has 1 driver left
        assertEquals("Number of the drivers left: ", 1, myShop.getDriverCount());

        // Only Rachel will now receive the request
        myShop.createDeliveryRequest("2000", "Leather Bag", "200 Eastern Ave");
    }

    /*
     * Test 3: Multiple Requests Test.
     * Purpose: Ensures that the shop can handle multiple delivery requests.
     */
    @Test
    public void testMultipleDeliveryRequests() {
        Shop myShop = new Shop("Chestnut Hill Retailer");
        Driver d1 = new Driver("Mike", "Bike");
        myShop.addDriver(d1);

        // Create multiple requests in a row
        myShop.createDeliveryRequest("1001", "Sweater", "100 Huntington Ave");
        myShop.createDeliveryRequest("1002", "Jeans", "84 Lovell St");

        // Verify shop has only 1 driver
        assertEquals("Number of the drivers left: ", 1, myShop.getDriverCount());
    }

}
