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
public interface deviceMan {//interface that feines core dev operations
    //also shows abstraction
    void addDevice(assistiveDevice device);
    void removeDevice(String deviceID);    
    
    assistiveDevice searchDevice(String deviceID);
    void displayDevice();
}
