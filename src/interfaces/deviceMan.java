/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
import model.assistiveDevice;

/**
 *
 * @author NagbontianAliciaBene
 */
public interface deviceMan {
    void addDevice(assistiveDevice device);
    void removeDevice(String deviceID);    
    
    assistiveDevice searchDevice(String deviceID);
    void displayDevice();
}
