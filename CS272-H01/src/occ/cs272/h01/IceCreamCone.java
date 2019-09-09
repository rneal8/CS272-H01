/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author rneal8
 * @version 9/9/19
 * 
 */
public class IceCreamCone
{
    public static final String STUDENT = "rneal8";
    public static final String ASSIGNMENT = "H01-B";

    private double height;
    private double radius;
    
    public IceCreamCone(double h, double r)
    {
        height = h;
        radius = r;
    }
    
    public double getSurfaceArea()
    {
        return (Math.PI * radius * (radius + Math.sqrt( Math.pow(radius, 2) + Math.pow(height, 2)))) - (Math.PI *  Math.pow(radius, 2));
    }
    
    public double getVolume()
    {
        return (Math.PI * Math.pow(radius, 2) * height) / 3.0; 
    }
    
}
