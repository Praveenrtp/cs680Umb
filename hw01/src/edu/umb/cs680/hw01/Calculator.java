package edu.umb.cs680.hw01;

public class Calculator {
	
	public  float multiply(float x, float y) {
        return x * y;
}

public  float divide(float x, float y) {
    if (y == 0) {
        throw new IllegalArgumentException("Division by zero");
    }
    else
        return x/y;
}

public float power(float x, float y) {
    if (y == 0) {
        return 1;
    } else
        return (float) Math.pow(x,y);
}

public float squareRoot(float x) {
    return (float) Math.sqrt(x);
}


public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("The value is : " +calculator.multiply(5,4));
    System.out.println("The value is : " +calculator.divide(6,4));
    System.out.println("The value is : " +calculator.power(2,4));
    System.out.println("The value is : " +calculator.squareRoot(5));
}
}


