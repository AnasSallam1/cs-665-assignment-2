/**
 * Name: ANAS SALLAM
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2026
 * File Name: Subject.java
 * Description: This class is responsible for .
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.services.DeliveryRequest;

public interface Subject {
    void registerDriver(Observer o);
    void removeDriver(Observer o);
    void notifyDrivers(DeliveryRequest request);
}
