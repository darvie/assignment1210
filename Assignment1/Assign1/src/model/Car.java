package model;

import javax.swing.*;
import java.awt.*;

public class Car extends JFrame {
    public int posX;
    public int posY;
    public Car() {
        posX=200;
        posY=200;
        setTitle("Assign 1");
        setSize(500,500);
    }
    public void moveCar(int deltaX, int deltaY){
        //student insert code here to implement the logic for moving the car
        //the new x position and y position should be incremented by deltaX and deltaY respectively
        //make sure to check boundary values as described in the assign

        //WRITE YOUR CODE HERE

        //Donot change this statament
        repaint();
    }

    public void paint(Graphics g){
        g.clearRect(0, 0, 500, 500);
        g.setColor(Color.blue);
        g.drawRect(posX,posY,100,50);
        g.setColor(Color.orange);
        g.fillRect(posX,posY,100,50);
    }


}
