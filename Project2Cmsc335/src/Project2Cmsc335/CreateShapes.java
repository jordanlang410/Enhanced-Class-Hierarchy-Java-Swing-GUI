/* File Name: CreateShapes.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class is used to assist the MainProject2Cmsc335 class by drawing the 2 dimensional
 * shapes and calculating the area or volume for each of the shapes.
*/
package Project2Cmsc335;

import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class CreateShapes extends JPanel {
	
	private String shape;
	private int singleInput;
	private int inputValue1;
	private int inputValue2;

	// overloading constructors if the shape needs 1 input for the dimensions
	public CreateShapes(String shape, int singleInput) {
		this.shape = shape;
		this.singleInput = singleInput;
		
	}
	// overloading constructors if the shape needs 2 inputs for the dimensions
	public CreateShapes(String shape, int inputValue1, int inputValue2) {
		this.shape = shape;
		this.inputValue1 = inputValue1;
		this.inputValue2 = inputValue2;
		
	}
	
    @Override
    protected void paintComponent(Graphics g) { //use paintCompnenet to draw shapes
        drawShape(g);
    }
	
	public void drawShape(Graphics draw) {
		
		// set the format to use for the output areas and volumes
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		if(shape == "Circle") {
			draw.drawOval(100, 100, singleInput, singleInput);
			
			//Create object from Circle class to take inputs and calculate area
			Circle circle = new Circle(singleInput);
			circle.calcCircleArea();
			draw.drawString("The area of the " + circle.shapeType + " is: " + numberFormat.format(circle.area), 65, 30);
			
		}
		
		else if(shape == "Square") {
			draw.drawRect(100, 100, singleInput, singleInput);
			
			//Create object from Square class to take inputs and calculate area
			Square square = new Square(singleInput);
			square.calcSquareArea();
			draw.drawString("The area of the " + square.shapeType + " is: " + numberFormat.format(square.area) , 65, 30);
		
		}
		
		else if(shape == "Triangle") {
			// use drawPolygon to draw the triangle.  It's using coordinates to plot the triangle so it does not produce
			// a perfect image, but I edited the numbers a bit so that it prints reasonably like what it should.
			int[] xValues = {25, inputValue1 + 25, inputValue1 + 25 / 3};
			int[] yValues = {300, 300, 300 - inputValue2};
			
			draw.drawPolygon(xValues, yValues, 3);
			
			//Create object from Triangle class to take inputs and calculate area
			Triangle triangle = new Triangle(inputValue1, inputValue2);
			triangle.calcTriangleArea();
			draw.drawString("The area of the " + triangle.shapeType + " is: " + numberFormat.format(triangle.area) , 65, 30);
		
		}
		
		else if(shape == "Rectangle") {
			draw.drawRect(100, 100, inputValue1, inputValue2);
			
			//Create object from Rectangle class to take inputs and calculate area
			Rectangle rectangle = new Rectangle(inputValue1, inputValue2);
			rectangle.calcRectangleArea();
			draw.drawString("The area of the " + rectangle.shapeType + " is: " + numberFormat.format(rectangle.area) , 65, 30);
			
		}
		
		else if(shape == "Cube") {
			
			//Create object from Cube class to take inputs and calculate volume
			Cube cube = new Cube(singleInput);
			cube.calcCubeVolume();
			draw.drawString("The volume of the " + cube.shapeType + " is: " + numberFormat.format(cube.volume) , 65, 30);
			
		}
		
		else if(shape == "Sphere") {
			
			//Create object from Sphere class to take inputs and calculate volume
			Sphere sphere = new Sphere(singleInput);
			sphere.calcSphereVolume();
			draw.drawString("The volume of the " + sphere.shapeType + " is: " + numberFormat.format(sphere.volume) , 30, 30);
			
		}
		
		else if(shape == "Cone") {
			
			//Create object from Cone class to take inputs and calculate volume
			Cone cone = new Cone(inputValue1, inputValue2);
			cone.calcConeVolume();
			draw.drawString("The volume of the " + cone.shapeType + " is: " + numberFormat.format(cone.volume) , 30, 30);
			
		}
		
		else if(shape == "Cylinder") {
			
			//Create object from Cylinder class to take inputs and calculate volume
			Cylinder cylinder = new Cylinder(inputValue1, inputValue2);
			cylinder.calcCylinderVolume();
			draw.drawString("The volume of the " + cylinder.shapeType + " is: " + numberFormat.format(cylinder.volume) , 30, 30);
		
		}
		
		else if(shape == "Torus") {
			
			//Create object from Torus class to take inputs and calculate volume
			Torus torus = new Torus(inputValue1, inputValue2);
			torus.calcTorusVolume();
			draw.drawString("The volume of the " + torus.shapeType + " is: " + numberFormat.format(torus.volume) , 30, 30);
		
		}
		
	}
	

}
