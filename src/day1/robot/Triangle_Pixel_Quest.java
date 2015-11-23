package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Triangle_Pixel_Quest {
	public static void main(String[] args) {
Robot Pixel_TQ = new Robot();
Pixel_TQ.penDown();
Pixel_TQ.turn (60);
Pixel_TQ.move (100);
Pixel_TQ.turn(60);
Pixel_TQ.move(100);
Pixel_TQ.turn(150);
Pixel_TQ.move(175);
Pixel_TQ.penUp();
Pixel_TQ.move(70);
for (int i = 0; i < 3; i++)
{ Pixel_TQ.penDown();
Pixel_TQ.turn(120);
Pixel_TQ.move(60);
}
Pixel_TQ.penUp();
Pixel_TQ.move(70);
Pixel_TQ.sparkle(); 
	}}

