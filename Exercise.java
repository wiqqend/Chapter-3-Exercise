/*
Quadratic Formula Solver
Programmer: Jacob Hartzell
Date: 8/24/2026
Purpose: The purpose of this program is to solve the quadratic formula based on the three input values a,b,c 
and return the roots back to the user
*/

import java.util.Scanner; // Import Scanner Utility to Read Inputs

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Formula Solver ");
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // Prompt the User for Input of A, B, C.


        double discriminantSolved = Math.pow(b,2) - (4*a*c);
        double r1 = (-b + Math.pow(discriminantSolved,0.5))/ (2 * a);
        double r2 = (-b - Math.pow(discriminantSolved,0.5))/ (2 * a);
        // Solve for the discriminant and Roots.


        // Displays output based on what the discriminant is.
        if (discriminantSolved < 0){ 
            System.out.println("The equation has no real roots");}
        if (discriminantSolved > 0){
            System.out.println("The roots are " + r1 + " and " + r2);}
        if (discriminantSolved == 0){
            System.out.println("The root is " + r1);}

        input.close(); // close input 
    }
    
}
