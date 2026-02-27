/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2026
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for creating a new instance of a DeliveryRequest object.
 */

package edu.bu.met.cs665.services;

public class DeliveryRequest {
    private final String orderId;
    private final String productName;
    private final String destination;

    /**
     * Create a DeliveryRequest object using orderId, productName, and destination
     *
     * @param orderId, id of the delivery request
     * @param productName, name of the product being delivered
     * @param destination, the customer's delivery address
     */
    public DeliveryRequest(String orderId, String productName, String destination) {
        this.orderId = orderId;
        this.productName = productName;
        this.destination = destination;
    }

    /**
     * This method is used by the observers to display specific
     * order information received during a broadcast
     *
     * @return String
     */
    public String getDetails() {
        return "Order #" + orderId + ": " + productName + " to " + destination;
    }
}
