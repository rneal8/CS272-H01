/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author rneal8
 * @version 9/9/19
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "rneal8";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
        double result = -1.0;
        
        switch(grade) {
            case "F":
                result = 0.0;
                break;
            case "D-":
                result = 0.7;
                break;
            case "D":
                result = 1.0;
                break;
            case "D+":
                result = 1.3;
                break;
            case "C-":
                result = 1.7;
                break;
            case "C":
                result = 2.0;
                break;
            case "C+":
                result = 2.3;
                break;
            case "B-":
                result = 2.7;
                break;
            case "B":
                result = 3.0;
                break;
            case "B+":
                result = 3.3;
                break;
            case "A-":
                result = 3.7;
                break;
            case "A":
                result = 4.0;
                break;
            case "A+":
                result = 4.0;
                break;
            case "f":
                result = 0.0;
                break;
            case "d-":
                result = 0.7;
                break;
            case "d":
                result = 1.0;
                break;
            case "d+":
                result = 1.3;
                break;
            case "c-":
                result = 1.7;
                break;
            case "c":
                result = 2.0;
                break;
            case "c+":
                result = 2.3;
                break;
            case "b-":
                result = 2.7;
                break;
            case "b":
                result = 3.0;
                break;
            case "b+":
                result = 3.3;
                break;
            case "a-":
                result = 3.7;
                break;
            case "a":
                result = 4.0;
                break;
            case "a+":
                result = 4.0;
                break;
        }
                
        return result; 
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
