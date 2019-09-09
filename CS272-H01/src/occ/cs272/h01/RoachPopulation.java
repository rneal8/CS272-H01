/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author rneal8
 * @version 9/9/19
 * 
 */
public class RoachPopulation
{
    public static final String STUDENT = "rneal8";
    public static final String ASSIGNMENT = "H01-A";
    
    private int population;

    public RoachPopulation(int startPop)
    {
        population = startPop;    
    }
    
    public void breed()
    {
        population = population * 2;
    }
    
    public void spray()
    {
        population = population - population / 10;
    }
    
    public int getRoaches()
    {
        return population;
    }
}
