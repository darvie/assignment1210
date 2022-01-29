package Q2.ui;

import javax.swing.*;

//student need to import the car class to be able to use it
import Q2.model.Car;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Student need to create a new object of the class car and call it p
        //WRITE YOUR CODE HERE
        Car p = new Car();



        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        Thread.sleep(3000);

        //student need to move the car. call the method called moverCar and use different deltaX and deltaY values
        //WRITE YOUR CODE HERE
        p.moveCar(-2000,-5000);
//        p.moveCar(50,70);
//        p.moveCar(150,150);
//        p.moveCar(1,1);
//        p.moveCar(300,300);


    }

}
