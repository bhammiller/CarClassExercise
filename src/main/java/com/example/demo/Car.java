package com.example.demo;

public class Car extends Vehicle {
    private String car_color;
    private String car_model;
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
}
