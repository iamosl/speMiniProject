package org.iiitb;
import java.lang.Math;

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
}