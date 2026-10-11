package com.kirill;

import com.kirill.absfactory.Button;
import com.kirill.absfactory.Checkbox;
import com.kirill.absfactory.GUIFactory;
import com.kirill.absfactory.WindowsFactory;
import com.kirill.builder.Car;
import com.kirill.builder.Computer;
import com.kirill.factory.Notification;
import com.kirill.factory.NotificationFactory;
import com.kirill.prototype.Character;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

//        Computer computer = new Computer.Builder()
//                .cpu("Intel i7")
//                .ram(32)
//                .storage(1000)
//                .gpu("RTX 5070")
//                .build();
//        System.out.println(computer);
//
//        Car car = new Car.Builder()
//                .engine("3.0L S58 Twin-Turbo Inline-6")
//                .transmission("ZF 8HP75 8-Speed Automatic")
//                .brakes("M Carbon Ceramic Brakes")
//                .suspension("Adaptive M Suspension")
//                .build();
//        System.out.println(car);

//        Notification notification =
//                NotificationFactory.createNotification("SMS");
//
//        notification.send();
//    }

// public class Main {
//    public static void main(String[] args) {

//        String type = "EMAIL";

//        Notification notification;

//         if (type.equals("EMAIL")) {
//            notification = new EmailNotification();
//         } else if (type.equals("SMS")) {
//            notification = new SmsNotification();
//        } else {
//            notification = new PushNotification();
//        }

//        notification.send();
//    }
// }

//        GUIFactory factory = new WindowsFactory();
//
//        Button button = factory.createButton();
//        Checkbox checkbox = factory.createCheckbox();
//
//        button.paint();
//        checkbox.paint();

        Character original =
                new Character(
                        "Zombie",
                        100,
                        50,
                        20
                );

        Character copy = original.copy();

        copy.setName("Zombie 2");
        copy.setHealth(150);

        System.out.println("Original: ");
        System.out.println(original);

        System.out.println();

        System.out.println("Copy: ");
        System.out.println(copy);
    }
}
