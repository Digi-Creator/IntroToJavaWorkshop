package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Pixel_is_Magic { public static void main(String[] args) { 
	Robot Pixel = new Robot();
	Pixel.move (30);
	Pixel.sparkle ();
	Pixel.penDown ();
	Pixel.move (100);
	Pixel.setAngle (180);
	Pixel.move (100);
	Pixel.setAngle(90);
	Pixel.move (100);
	Pixel.turn(180);
	Pixel.move(100);
	Pixel.penUp ();
	Pixel.unSparkle ();
	Pixel.sparkle();
	Pixel.hide ();
	Pixel.show ();
	Pixel.unSparkle();
	
}

}
