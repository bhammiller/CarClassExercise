package com.example.demo;
import java.util.Scanner;
public class Car extends Vehicle {
    private String car_color;
    private String car_model;
    private Integer speed;
    private Integer conti=1;
    private Scanner keyboard = new Scanner(System.in);
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
    public String speedChange(){
        System.out.println("Do you wish to accelerate or decelerate?");
        String answer = keyboard.nextLine();
        answer = answer.toLowerCase();
        while(conti == 1){
            if(answer.equals("accelerate")||answer.equals("decelerate")){
                conti = 2;
            }else{
                System.out.println("Do you wish to accelerate or decelerate?");
                answer = keyboard.nextLine();
                answer = answer.toLowerCase();
                conti = 1;
            }

        };
        if(answer.equals("accelerate")){
            System.out.println("How much does the " +car_color + " "
                    + car_model + " it accelerate by?");
            Integer change = keyboard.nextInt();
            speed = speed + change;
            return "the " + car_color + " " + car_model + " is accelerating by "+ change
                    +"MPH";
        }else{
            System.out.println("How much does the " +car_color + " "
                    + car_model + " it decelerate by?");
            Integer change = keyboard.nextInt();
            speed = speed - change;
            return "the " + car_color + " " + car_model + " is decelerate by "+ change
                    +"MPH";
        }
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
