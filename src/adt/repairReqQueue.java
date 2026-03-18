/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author NagbontianAliciaBene
 */
public class repairReqQueue {


    private Queue<String> requestQueue;//the queue to store repair requests

    public repairReqQueue() {
        requestQueue = new LinkedList<>();//initialising queue
    }

    public void enqueue(String request) { //add request to queue
        requestQueue.add(request); //adds request to queue
        System.out.println("Request added: " + request);
    }

    public String dequeue() {

        if(requestQueue.isEmpty()){
            return "No requests in queue";
        }

        return requestQueue.poll();
    }

    public void displayRequests() {

        if(requestQueue.isEmpty()){
            System.out.println("No repair requests.");
            return;
        }

        System.out.println("Repair Requests:");

        for(String req : requestQueue){//loops through queue
            System.out.println(req);//prints each request
        }
    }
}
