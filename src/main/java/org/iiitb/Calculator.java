package org.iiitb;
import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    public static double sqRoot(double input){
        double out = Math.sqrt(input);
        return out;
    }

    public static int factorial(int input){
        int out = 1;
        if (input < 0)
            out=0;
        for(int i=input; i>0; i--){
            out *=i;
        }
        return out;
    }

    public static double naturalLog(double input){
        double out = Math.log(input);
        return out;
    }

    public static double power(double inputX, double inputY){
        double out = Math.pow(inputX, inputY);
        return out;

    }

    public static void main(String[] args)
    {

        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag)
        {
            System.out.println("Please enter the number corresponding to the operation that you want to execute ... ");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");

            int choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("Input the number ...");
                        double number = in.nextDouble();
                        System.out.println("The Square root of " + number + " is " + sqRoot(number));
                        break;
                    }
                case 2:
                    {
                        System.out.println("Input the number ...");
                        int number = in.nextInt();
                        System.out.println("The Factorial of " + number + " is " + factorial(number));
                        break;
                    }
                case 3:
                    {
                        System.out.println("Input the number ...");
                        double number = in.nextDouble();
                        System.out.println("The natural log of " + number + " is " + naturalLog(number));
                        break;
                    }
                case 4:
                    {
                        System.out.println("Input the base value ...");
                        double base = in.nextDouble();
                        System.out.println("Input the exponent value ...");
                        double exponent = in.nextDouble();
                        System.out.println("The value of " + base + " raised to the power of " + exponent + " is " + power(base, exponent));
                        break;
                    }
                case 5:
                    {
                        flag = false;
                        System.out.println("Thank you! Exiting now ...");
                        break;
                    }
                default:
                    {
                        System.out.println("Invalid Choice .. Please Try Again");
                    }
            }
        }
    }
}