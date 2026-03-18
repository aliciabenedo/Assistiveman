/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;
import model.assistiveDevice;

/**
 *
 * @author NagbontianAliciaBene
 */
public interface deviceOperation {//this defines the required operations
    void addDevice(assistiveDevice device);//adds a new device
    assistiveDevice searchDevice(String id);//searches by id
    
    void removeDevice(String id); //this deletes the device
    void dislayDevices();
    
}
