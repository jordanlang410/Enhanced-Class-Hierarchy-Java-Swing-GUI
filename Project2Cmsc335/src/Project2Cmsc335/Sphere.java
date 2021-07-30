/* File Name: Sphere.java
 * Author: Lang, Jordan
 * Project Name: Project 2 CMSC335
 * Date: 06/08/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the radius to calculate the Volume
 * of a Sphere.
*/
package Project2Cmsc335;


public class Sphere extends ThreeDimensionalShape {
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
	private double radius;

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public void calcSphereVolume() {
		//has a volume (from ThreeDimensionalShape Class)
		volume = 1.33 * (Math.PI) * (Math.pow(radius, 3));
	}
}