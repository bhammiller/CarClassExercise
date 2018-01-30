package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping ("/")
    public void animal(){
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();
        a.setCar_model("truck");
        b.setCar_model("Sedan");
        c.setCar_model("convertible");
        a.setCar_color("black");
        b.setCar_color("red");
        c.setCar_color("blue");
        a.setSpeed(200);
        b.setSpeed(50);
        c.setSpeed(70);
        print(a.start());
        print(b.start());
        print(c.start());
        print(a.accelerate());
        print(b.accelerate());
        print(c.accelerate());
        print(a.speed());
        print(b.speed());
        print(c.speed());
        print(a.stop());
        print(b.stop());
        print(c.stop());









    }

    private static void print(String s){
        System.out.println(s);
    }
}
