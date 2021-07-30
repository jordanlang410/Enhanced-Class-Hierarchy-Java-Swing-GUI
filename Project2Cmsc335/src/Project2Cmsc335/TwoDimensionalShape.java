/* File Name: TwoDimensionalShape.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class is the a child class of the Shapes class. It defines
 * the number of dimensions to be 2 and that a TwoDimensionalShape has an area.
*/
package Project2Cmsc335;

public class TwoDimensionalShape extends Shapes {
	// is a shape

	// has an area
    double area;
    
    TwoDimensionalShape(String shapeType) {
    	
        super(shapeType);
    }
}