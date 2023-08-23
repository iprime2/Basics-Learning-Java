class Fraction {
    int numerator, denominator;

    // Define constructor here
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction add(Fraction a){
        // Complete the function
        int sumNumerator = this.numerator + a.numerator;
        int sumDenominator = this.denominator + a.denominator;

        Fraction res = new Fraction(sumNumerator, sumDenominator);

        return res;
    }

    Fraction subtract(Fraction a){
        // Complete the function
        int subNumerator = this.numerator - a.numerator;
        int subDenominator = this.denominator - a.denominator;

        Fraction res = new Fraction(subNumerator, subDenominator);

        return res;
    }

    Fraction multiply(Fraction a){
        // Complete the function
        int mulNumerator = this.numerator * a.numerator;
        int mulDenominator = this.denominator * a.denominator;

        Fraction res = new Fraction(mulNumerator, mulDenominator);

        return res;
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}

public class FractionExample {
    public static void main(String[] args) {
        Fraction x = new Fraction(2, 3);  // 2/3
        Fraction y = new Fraction(4, 5) ;// 4/5
        Fraction z1 = x.add(y); // 22/15
        Fraction z2 = x.subtract(y); // -2/15
        Fraction z3 = x.multiply(y); // 8/15

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}
