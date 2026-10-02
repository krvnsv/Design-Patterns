package com.kirill;

import com.kirill.builder.Car;
import com.kirill.builder.Computer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Computer computer = new Computer.Builder()
                .cpu("Intel i7")
                .ram(32)
                .storage(1000)
                .gpu("RTX 5070")
                .build();
        System.out.println(computer);

        Car car = new Car.Builder()
                .engine("3.0L S58 Twin-Turbo Inline-6")
                .transmission("ZF 8HP75 8-Speed Automatic")
                .brakes("M Carbon Ceramic Brakes")
                .suspension("Adaptive M Suspension")
                .build();
        System.out.println(car);
    }
}
