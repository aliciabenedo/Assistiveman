/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NagbontianAliciaBene
 */
public class assistiveDevice {
    
    private String deviceID;
    private String deviceName;
    private String location;        
    private String status;
    
    public assistiveDevice(String deviceID,String deviceName, String location,String status ){
        this.deviceID=deviceID;
        this.deviceName=deviceName;  
        this.location=location;
        this.status=status;
    }
    public String getDevice(){
        return deviceID;
    }
        public String getDeviceName(){
        return deviceName;
    }
        public String getLocation(){
        return location;
    }    
        public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
