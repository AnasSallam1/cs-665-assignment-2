/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2026
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for .
 */

package edu.bu.met.cs665.services;

public class DeliveryRequest {
    private final String orderId;
    private final String productName;
    private final String destination;

    public DeliveryRequest(String orderId, String productName, String destination) {
        this.orderId = orderId;
        this.productName = productName;
        this.destination = destination;
    }

    public String getDetails() {
        return "Order #" + orderId + ": " + productName + " to " + destination;
    }
}
