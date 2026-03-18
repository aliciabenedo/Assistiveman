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
    private Node head; //first node in my list

    @Override
    public void dislayDevices() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    class Node { //inner class node to store device
        assistiveDevice device;
                Node next;
                
                public Node(assistiveDevice device){ //my constructer
                    this.device=device;
                    this.next=null;
                }
    }

    public void displayDevices() { //methodto displayy all the devices
        Node temp = head; //starting from the head
        if (temp == null){ //checks if my list is empty
            System.out.println("no devices have been found");
            return; //stops method
        }
        while (temp != null){ //looping through the list
            
            System.out.println(
                    
            temp.device.getDeviceID()+ "-"+
            temp.device.getDeviceName()+ "-"+
             temp.device.getLocation()+ "-"+
            temp.device.getStatus()
            );
            temp=temp.next;
        }
    }

    public assistiveDevice searchDevice(String id) { //method that searchs device by id
        Node temp=head;
        while(temp != null){ //loops
            if(temp.device.getDeviceID().equals(id)){//checks if ids matches
                return temp.device; //returns the found device
            }
            temp=temp.next; //moves to next  node
            }
return null; //returns null if its nto found

        }
        


    public void removeDevice(String id) {
        if (head==null)return; //if the lift is empty it stops
        if(head.device.getDeviceID().equals(id)){//checks if first node is the oe to delete
            head=head.next;//moves the head to nextnode
            return;
        }
        
        Node temp=head;
        
        while (temp.next != null){//loops through list
            //checks the next node
            if(temp.next.device.getDeviceID().equals(id)){
                temp.next=temp.next.next; //this will skip node
                return;
            }
            temp=temp.next;//moves on
        }
        
    }
    
    public void addDevice(assistiveDevice device){
        Node newNode=new Node(device);//thsi creates a new node
        
        if (head==null){ //if its empty
            head=newNode;//sets it at the first node
        }else{
            Node temp=head;
            while(temp.next !=null){//goes to the lat node
                temp=temp.next;
            }
            temp.next=newNode;//add new node at the end
        }
        
        
    }
    
    public int countDevices(){ //recurtive mth to count dev
        return countRecursive(head);
    }
    private int countRecursive(Node node){ //a helper recursive met
        if (node==null){ //this is the base
            return 0;
        }
        
        return 1+ countRecursive(node.next);//this is the recursive call
    }
    
}
