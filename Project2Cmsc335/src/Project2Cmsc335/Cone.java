/* File Name: Cone.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the radius and height to calculate the
 *  Volume of a Cone.
*/
package Project2Cmsc335;

public class Cone extends ThreeDimensionalShape{
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
	private double radius;
	private double height;

	public Cone(double radius, double height) {
		super("Cone");
		this.radius = radius;
		this.height = height;

	}

	public double calcConeVolume() {
		//has a volume (from the ThreeDimensionalShape Class)
		volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
		return volume;
	}

}
