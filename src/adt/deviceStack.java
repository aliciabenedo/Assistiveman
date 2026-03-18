/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;
import java.util.Stack;
import model.assistiveDevice;

/**
 *
 * @author NagbontianAliciaBene
 */
public class deviceStack {
    private Stack<assistiveDevice>stack;//the stack to store devices
    
    public deviceStack(){
        stack=new Stack<>(); //initialisies stack
    }
    //pushing device onto stack
    public void pushDevice(assistiveDevice device){
        stack.push(device);//adds device to the top
        System.out.println("device has been pushd"+device.getDeviceName());
    }
    
    //this is popping device from stack
    public assistiveDevice popDevice(){
        if(stack.isEmpty()){
            System.out.println("stack is emptys");
            return null;
        }
        return stack.pop();//reoves then returns it to the top of the edevice
    }
    
    //displaying
    public void displayStack(){
        if(stack.isEmpty()){
            System.out.println("no devices are in this stack");
            return;
        }
        System.out.println("stack devices");
        for(assistiveDevice d : stack){ //this loops through the stack
        System.out.println(
        d.getDeviceID()+"-"+
        d.getDeviceName());
    }
    }
  
}
