import java.util.Arrays;
import java.util.Scanner;

class ComplexNumber {
    public float real;
    public float imaginary;

    // Define constructor here
    ComplexNumber(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber x){
        // Complete the function
        float sumReal = this.real + x.real;
        float sumImaginary = this.imaginary + x.imaginary;

        ComplexNumber res = new ComplexNumber(sumReal, sumImaginary);

        return res;
    }

    public ComplexNumber subtract(ComplexNumber x){
        // Complete the function
        float subReal = this.real - x.real;
        float subImaginary = this.imaginary - x.imaginary;

        ComplexNumber res = new ComplexNumber(subReal, subImaginary);

        return res;
    }

    public ComplexNumber multiply(ComplexNumber x){
        // Complete the function
        float mulReal = (this.real * x.real) - (this.imaginary * x.imaginary);
        float mulImaginary = (this.real * x.imaginary) + (this.imaginary * x.real);

        ComplexNumber res = new ComplexNumber(mulReal, mulImaginary);

        return res;
    }

    public ComplexNumber divide(ComplexNumber x){
        // Complete the function
        float divisor = (x.real * x.real) + (x.imaginary * x.imaginary);
        float divReal = ((this.real * x.real) + (this.imaginary * x.imaginary)) / divisor;
        float divImaginary = ((this.imaginary * x.real) - (this.real * x.imaginary)) / divisor;

        ComplexNumber res = new ComplexNumber(divReal, divImaginary);

        return res;
    }

    public String toString(){
        return this.real + " + " + this.imaginary + "i";
    }
}

public class testRun {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(10, 5);
        ComplexNumber b = new ComplexNumber(2, 3);
        ComplexNumber c1 = a.add(b);
        ComplexNumber c2 = a.subtract(b);
        ComplexNumber c3 = a.multiply(b);
        ComplexNumber c4 = a.divide(b);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
