package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Pixel_TriSpiral_Quest {public static void main(String[] args) {
	Robot Pixel_SQ = new Robot();
			Pixel_SQ.penDown();
     Pixel_SQ.setSpeed(10);    
     for (int i = 0; i < 75; i++) {
Pixel_SQ.setRandomPenColor();	
Pixel_SQ.move(5*i);
Pixel_SQ.turn(360/3);	
Pixel_SQ.setPenWidth(i);
     }}
}

