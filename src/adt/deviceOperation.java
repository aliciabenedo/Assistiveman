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
public interface deviceOperation {
    void addDevice(assistiveDevice device);
    assistiveDevice searchDevice(String id);
    
    void removeDevice(String id);
    void dislayDevices();
    
}
