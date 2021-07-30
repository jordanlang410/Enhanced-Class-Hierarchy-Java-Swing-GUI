/* File Name: Square.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the edges to calculate the Area of a square.
*/

package Project2Cmsc335;

public class Square extends TwoDimensionalShape {
	
	private double edge;

	Square(double edge) {
		
		super("Square");
		this.edge = edge;
	}
	
	public double calcSquareArea() {
		
		area = Math.pow(edge, 2);
		return area;
	}

	
}
