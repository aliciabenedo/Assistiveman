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
    private Stack<assistiveDevice>stack;
    
    public deviceStack(){
        stack=new Stack<>();
    }
    //pushing
    public void pushDevice(assistiveDevice device){
        stack.push(device);
        System.out.println("device has been pushd"+device.getDeviceName());
    }
    
    //this is popping
    public assistiveDevice popDevice(){
        if(stack.isEmpty()){
            System.out.println("stack is emptys");
            return null;
        }
        return stack.pop();
    }
    
    //displaying
    public void displayStack(){
        if(stack.isEmpty()){
            System.out.println("no devices are in this stack");
            return;
        }
        System.out.println("stack devices");
        for(assistiveDevice d : stack){
        System.out.println(
        d.getDeviceID()+"-"+
        d.getDeviceName());
    }
    }
  
}
