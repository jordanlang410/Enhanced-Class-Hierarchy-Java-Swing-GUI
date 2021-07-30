/* File Name: ThreeDimensionalShape.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class is the a child class of the Shapes class. It defines
 * the number of dimensions to be 3 and that a ThreeDimensionalShape has a volume.
*/
package Project2Cmsc335;


public class ThreeDimensionalShape extends Shapes {
	// is a shape
	
	// has a volume
	double volume;
    
    public ThreeDimensionalShape(String shapeType) {
    	
        super(shapeType);
    }
}