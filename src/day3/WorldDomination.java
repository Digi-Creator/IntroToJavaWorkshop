package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) { 
		// 1. Ask the user if they know how to write code.
String desicion = JOptionPane.showInputDialog("Do u know how to write code? -Anonymus");
		// 2. If they say "yes", tell them they will rule the world.
if (desicion .equals ("yes") )
 JOptionPane.showMessageDialog(null, "Then, you shall rule thy world! ;)");
		// 3. Otherwise, wish them good luck washing dishes.
else JOptionPane.showMessageDialog(null, "Well, good luck washing dishes! :D"); 
	}
}

