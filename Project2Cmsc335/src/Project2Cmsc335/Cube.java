/* File Name: Cube.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the length of the edges to calculate the
 *  Volume of a cube.
*/
package Project2Cmsc335;

public class Cube extends ThreeDimensionalShape{
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
    private double edge;
    
    public Cube(double edge) {
        super("Cube");
        this.edge = edge;
    }
    
    public double calcCubeVolume() {
    	//has a volume (from the ThreeDimensionalShape Class)
        volume = Math.pow(edge, 3);
        return volume;
    }

}
