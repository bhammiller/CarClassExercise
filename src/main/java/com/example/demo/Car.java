package com.example.demo;

public class Car extends Vehicle {
    private String car_color;
    private String car_model;
    private Integer speed;
    public Car(){}
    public Car(String color, String model, int speed){
        this.setCar_color(color);
        this.setCar_model(model);
        this.setSpeed(speed);
    }
    public void setCar_color(String c){
        car_color = c;
    }
    public String getCar_color(){
        return car_color.toLowerCase();
    }
    public void setCar_model(String m){
        car_model = m;
    }
    public String getCar_model(){
        return car_model.toLowerCase();
    }
    public void setSpeed(Integer s){
        speed = s;
    }
    public Integer getSpeed(){
        return speed;
    }
    @Override
    public String start(){
        return "the " + car_color + " " + car_model + " is starting";
    }
    @Override
    public String accelerate(){
        return "the " + car_color + " " + car_model + " is accelerating";
    }
    @Override
    public String speed(){
        return "the " + car_color + " " + car_model + " is going " + speed + " MPH";
    }
    @Override
    public String stop(){
        return "the " + car_color + " " + car_model + " is stoping";
    }
}
