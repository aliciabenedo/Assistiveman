/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;
import model.assistiveDevice;

/**
 *
 * @author NagbontianAliciaBene
 */
public class deviceLinkedList implements deviceOperation{
    private Node head;

    @Override
    public void dislayDevices() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    class Node {
        assistiveDevice device;
                Node next;
                
                public Node(assistiveDevice device){
                    this.device=device;
                    this.next=null;
                }
    }

    public void displayDevices() { 
        Node temp = head;
        if (temp == null){
            System.out.println("no devices have been found");
            return;
        }
        while (temp != null){
            System.out.println(
                    
            temp.device.getDeviceID()+ "-"+
            temp.device.getDeviceName()+ "-"+
             temp.device.getLocation()+ "-"+
            temp.device.getStatus()
            );
            temp=temp.next;
        }
    }

    public assistiveDevice searchDevice(String id) {
        Node temp=head;
        while(temp != null){
            if(temp.device.getDeviceID().equals(id)){
                return temp.device;
            }
            temp=temp.next;
            }
return null;

        }
        


    public void removeDevice(String id) {
        if (head==null)return;
        if(head.device.getDeviceID().equals(id)){
            head=head.next;
            return;
        }
        
        Node temp=head;
        
        while (temp.next != null){
            if(temp.next.device.getDeviceID().equals(id)){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
        
    }
    
    public void addDevice(assistiveDevice device){
        Node newNode=new Node(device);
        
        if (head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        
        
    }
    
    public int countDevices(){
        return countRecursive(head);
    }
    private int countRecursive(Node node){
        if (node==null){
            return 0;
        }
        
        return 1+ countRecursive(node.next);
    }
    
}
