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
public class deviceLinkedList {
    private Node head;
    class Node{
        assistiveDevice device;
        Node next;
        
        Node (assistiveDevice device){
            this.device=device;
            this.next=null;
            
            
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
    
}
