/* File Name: Torus.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the minorRadius and majorRadius to 
 * calculate the Volume of a Torus.
*/
package Project2Cmsc335;

public class Torus extends ThreeDimensionalShape {
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
	private double minorRadius;
	private double majorRadius;

	public Torus(double minorRadius, double majorRadius) {
		super("Torus");
		this.minorRadius = minorRadius;
		this.majorRadius = majorRadius;
	}

	public double calcTorusVolume() {
		//has a volume (from ThreeDimensionalShape Class)
		volume = (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
		return volume;
				
	}
}