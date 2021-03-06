/* File Name: Circle.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the radius to calculate the Area of a circle.
*/
package Project2Cmsc335;

public class Circle extends TwoDimensionalShape {
	//is a two Dimensional Shape inherited from the TwoDimensionalShape Class
	
	private double radius;

	Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double calcCircleArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}