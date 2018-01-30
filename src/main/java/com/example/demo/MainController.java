package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping ("/")
    public void animal(){
        Car a = new Car("black", "truck", 80);
        //Car b = new Car("red", "sedan", 50);
        //Car c = new Car("blue", "convertible", 70);
        //Car d = new Car("white","moped",60);
        print(a.start());
        //print(b.start());
        //print(c.start());
        //print(d.start());
        print(a.speed());
        //print(b.speed());
        //print(c.speed());
        //print(d.speed());
        print(a.speedChange());
        //print(a.accelerate());
        //print(b.accelerate());
        //print(c.accelerate());
        //print(d.accelerate());
        print(a.speed());
        print(a.stop());
        //print(b.stop());
        //print(c.stop());
        //print(d.stop());









    }

    private static void print(String s){
        System.out.println(s);
    }
}
