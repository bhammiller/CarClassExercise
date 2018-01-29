package com.example.demo;

public class Vehicle {
    public Vehicle(){}
    public String start(){
        return "is starting";
    }
    public String accelerate(){
        return "is accelerating";
    }
    public String speed(){
        return "is going " + "MPH";
    };
    public String stop(){
        return "is stoping";
    };
}
