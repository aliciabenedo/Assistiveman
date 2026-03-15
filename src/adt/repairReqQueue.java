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


    private Queue<String> requestQueue;

    public repairReqQueue() {
        requestQueue = new LinkedList<>();
    }

    public void enqueue(String request) {
        requestQueue.add(request);
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

        for(String req : requestQueue){
            System.out.println(req);
        }
    }
}
