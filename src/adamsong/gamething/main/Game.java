package adamsong.gamething.main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The main class for the game thing
 */
public class Game extends JFrame {
	private static final long serialVersionUID = 1L;

	/**
	 * Initializes game window
	 */
	public Game(){
		//Runs the constructor for the superclass
		super();
		//Sets the background color for the window from a grey to white
		setBackground(Color.WHITE);
		//Sets the title on the title bar
		setTitle("Yay Game");
		//Tells the JVM what to do when the exit button is clicked, exit on close terminate the current program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sets the size of the window (must be before location)
		setSize(new Dimension(1440, 900));
		//Sets the location relative to something, null puts it in the middle
		setLocationRelativeTo(null);
		//Allows the window to be seen
		setVisible(true);
	}
	
	/**
	 * Method called by the JVM on program launch
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		new Game();
	}

}
