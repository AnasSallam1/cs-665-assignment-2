/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/18/2026
 * File Name: Observer.java
 * Description: This class is an interface representing the Observer in the Observer Design Pattern.
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;

public interface Observer {
    void update(DeliveryRequest request);
}
