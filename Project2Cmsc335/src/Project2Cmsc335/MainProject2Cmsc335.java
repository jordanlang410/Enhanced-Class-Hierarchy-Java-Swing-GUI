/* File Name: MainProject2Cmsc335.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class creates a GUI interface which allows the user choose between which two or
 * three dimensional structure they would like to construct and find out the area or volume for. It draws
 * a picture for the two dimensional shapes and outputs an image for the three dimensional shapes.
*/
package Project2Cmsc335;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainProject2Cmsc335 extends JFrame implements ActionListener {

	private JButton circleButton, squareButton, triangleButton, rectangleButton, sphereButton, cubeButton, coneButton,
			cylinderButton, torusButton;

	private JLabel label1;

	public MainProject2Cmsc335() {

		super("SWING Shapes");

		setSize(450, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		add(mainPanel);

		this.circleButton = new JButton("Circle");
		this.squareButton = new JButton("Square");
		this.triangleButton = new JButton("Triangle");
		this.rectangleButton = new JButton("Rectangle");
		this.sphereButton = new JButton("Sphere");
		this.cubeButton = new JButton("Cube");
		this.coneButton = new JButton("Cone");
		this.cylinderButton = new JButton("Cylinder");
		this.torusButton = new JButton("Torus");

		mainPanel.add(northPanel(), BorderLayout.NORTH);
		mainPanel.add(centerPanel(), BorderLayout.CENTER);
	}

	// create JPanel upper layout
	private JPanel northPanel() {
		JPanel northPanel = new JPanel();

		northPanel.add(circleButton);
		northPanel.add(squareButton);
		northPanel.add(triangleButton);
		northPanel.add(rectangleButton);
		
		circleButton.addActionListener(this);
		squareButton.addActionListener(this);
		triangleButton.addActionListener(this);
		rectangleButton.addActionListener(this);

		return northPanel;
	}

	// create JPanel center layout
	private JPanel centerPanel() {
		JPanel centerPanel = new JPanel();

		centerPanel.add(sphereButton);
		centerPanel.add(cubeButton);
		centerPanel.add(coneButton);
		centerPanel.add(cylinderButton);
		centerPanel.add(torusButton);

		sphereButton.addActionListener(this);
		cubeButton.addActionListener(this);
		coneButton.addActionListener(this);
		cylinderButton.addActionListener(this);
		torusButton.addActionListener(this);

		return centerPanel;
	}

	// create actions based on the button the user clicks
	public void actionPerformed(ActionEvent e) {

		try {

			if (e.getSource() == circleButton) {

				// Take user input
				int radius = Integer.parseInt(JOptionPane.showInputDialog("What is the Radius?"));
				JFrame frame1 = new JFrame();
				frame1.setSize(350, 350);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Circle", radius);
				frame1.add(panel1);
			}

			else if (e.getSource() == squareButton) {

				// Take user input
				int edge = Integer.parseInt(JOptionPane.showInputDialog("What are the lengths of all the edges?"));

				JFrame frame1 = new JFrame();
				frame1.setSize(350, 350);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Square", edge);
				frame1.add(panel1);
			}
			
			else if (e.getSource() == triangleButton) {

				// Take user input
				int base = Integer.parseInt(JOptionPane.showInputDialog("What is the base?"));
				int height = Integer.parseInt(JOptionPane.showInputDialog("What is the height?"));

				JFrame frame1 = new JFrame();
				frame1.setSize(350, 350);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Triangle", base, height);
				frame1.add(panel1);
			}
			
			else if (e.getSource() == rectangleButton) {

				// Take user input
				int length = Integer.parseInt(JOptionPane.showInputDialog("What is the length?"));
				int width = Integer.parseInt(JOptionPane.showInputDialog("What is the width?"));

				JFrame frame1 = new JFrame();
				frame1.setSize(350, 350);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Rectangle", width, length);
				frame1.add(panel1);
			}
			
			
			else if (e.getSource() == sphereButton) {
				
				String imagePath = System.getProperty("user.dir") + "\\src\\Project2Cmsc335\\sphere.png";

				// Take user input
				int radius = Integer.parseInt(JOptionPane.showInputDialog("What is the radius?"));

				JFrame frame1 = new JFrame();
				JFrame frame2 = new JFrame();
				
				frame1.setSize(300, 300);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Sphere", radius);
				
				frame2.setSize(300, 71);
				frame2.setVisible(true);
				
				//Load in image
				frame1.add(new JLabel(new ImageIcon(imagePath)));
				frame2.add(panel1);
			}
			
			else if (e.getSource() == cubeButton) {
				String imagePath = System.getProperty("user.dir") + "\\src\\Project2Cmsc335\\cube.png";

				// Take user input
				int edge = Integer.parseInt(JOptionPane.showInputDialog("What are the lengths of all the edges?"));

				JFrame frame1 = new JFrame();
				JFrame frame2 = new JFrame();
				
				frame1.setSize(300, 300);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Cube", edge);
				
				frame2.setSize(300, 71);
				frame2.setVisible(true);
				
				//Load in image
				frame1.add(new JLabel(new ImageIcon(imagePath)));
				frame2.add(panel1);
			}
			
			else if (e.getSource() == coneButton) {
				
				String imagePath = System.getProperty("user.dir") + "\\src\\Project2Cmsc335\\cone.png";

				// Take user input
				int radius = Integer.parseInt(JOptionPane.showInputDialog("What is the radius?"));
				int height = Integer.parseInt(JOptionPane.showInputDialog("What is the height?"));

				JFrame frame1 = new JFrame();
				JFrame frame2 = new JFrame();
				
				frame1.setSize(300, 300);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Cone", radius, height);
				
				frame2.setSize(300, 71);
				frame2.setVisible(true);
				
				//Load in image
				frame1.add(new JLabel(new ImageIcon(imagePath)));
				frame2.add(panel1);
			}
			
			else if (e.getSource() == cylinderButton) {
				
				String imagePath = System.getProperty("user.dir") + "\\src\\Project2Cmsc335\\cylinder.png";

				// Take user input
				int radius = Integer.parseInt(JOptionPane.showInputDialog("What is the radius?"));
				int height = Integer.parseInt(JOptionPane.showInputDialog("What is the height?"));

				JFrame frame1 = new JFrame();
				JFrame frame2 = new JFrame();
				
				frame1.setSize(300, 300);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Cylinder", radius, height);
				
				frame2.setSize(300, 71);
				frame2.setVisible(true);
				
				//Load in image
				frame1.add(new JLabel(new ImageIcon(imagePath)));
				frame2.add(panel1);
			}
			
			else if (e.getSource() == torusButton) {
				
				String imagePath = System.getProperty("user.dir") + "\\src\\Project2Cmsc335\\torus.png";

				// Take user input
				int minorRadius = Integer.parseInt(JOptionPane.showInputDialog("What is the minor radius?"));
				int majorRadius = Integer.parseInt(JOptionPane.showInputDialog("What is the major radius?"));

				JFrame frame1 = new JFrame();
				JFrame frame2 = new JFrame();
				
				frame1.setSize(300, 300);
				frame1.setVisible(true);
				CreateShapes panel1 = new CreateShapes("Torus", minorRadius, majorRadius);
				
				frame2.setSize(300, 71);
				frame2.setVisible(true);
				
				//Load in image
				frame1.add(new JLabel(new ImageIcon(imagePath)));
				frame2.add(panel1);
			}
		}
		
		// display the exceptions in a new panel if they occur
		catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "Please try again. You must eneter an Integer.");
			return;
		}

	}

	public static void main(String[] args) {
		MainProject2Cmsc335 display = new MainProject2Cmsc335();
		display.setVisible(true);
	}
}
