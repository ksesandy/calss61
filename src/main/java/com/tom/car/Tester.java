package com.tom.car;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123", "08:00");
        Car c2 = new Car("abc-456", "09:00");
        Car c3 = new Car("abc-789", "10:30");
        int fee = 30;
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);

        String id = "abc-123";
        Car car = cars.get(id);

        if(car == null){
            System.out.println("Car no found!!");
        }
        else {
            Date now = new Date();
            long a = now.getTime() - car.enter.getTime();
            long mins = a/(60*1000);
            int fees = (int)mins/60 *fee +fee;
            System.out.println(mins + "\t" +"$:" +fees);

        }
    }
}
