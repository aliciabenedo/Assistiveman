/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
//inheritance through my medical device class extending the assistive device
/**
 *
 * @author NagbontianAliciaBene
 */
public class myMedicalDevice extends assistiveDevice{
    
    private String hospital; //anotehr field
    public myMedicalDevice(String deviceID,String deviceName, String location,String status){
        super( deviceID, deviceName,  location, status );//cals the parent constructer
        this.hospital=hospital;
    }
    public String getHospital(){
        return hospital;
    }
    //this is polymorphism showing a method override to modify its behaviour

    /**
     *
     * @return
     */
    @Override
    
    public String getDeviceName(){
        return super.getDeviceName()+"medical";
    
    }
}
