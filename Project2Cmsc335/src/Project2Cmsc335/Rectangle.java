/* File Name: Rectangle.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the length and width to calculate the
 * Area of a rectangle.
*/
package Project2Cmsc335;

public class Rectangle extends TwoDimensionalShape {
	//is a two Dimensional Shape inherited from the TwoDimensionalShape Class

	private double length;
	private double width;

	Rectangle(double length, double width) {

		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	public double calcRectangleArea() {
		//has an area (from the TwoDimensionalShape Class)
		area = length * width;
		return area;

	}
}
