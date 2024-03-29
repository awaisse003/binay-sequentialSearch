package bs_vs_sq;

public class Rational {

    // Private instance variables
    private int numerator;
    private int denominator;

    // Constructor
    public Rational() {

        this.numerator = 0;
        this.denominator = 1;

    }

    // Overloaded constructor
    public Rational(int num, int den) {

        this.numerator = num;
        this.denominator = den;

        reduce();

    }

    // Getter method for numerator
    public int getNumerator() {

        return this.numerator;

    }

    // Getter method for denominator
    public int getDenominator() {

        return this.denominator;

    }

    // Getter method for double
    public double toDouble() {

        return (double) this.numerator / this.denominator;

    }

    // Getter method for string
    public String toString() {
        if (denominator == 0) {

            return "ERROR";

        }
        if (denominator == 1) {

            return this.numerator + "";

        } else {

            return this.numerator + "/" + this.denominator;

        }
    }

    // Void method for negate
    public void negate() {

        this.numerator = -1 * numerator;

    }

    //  Void method for invert
    public void invert() {

        int flip = this.numerator;

        this.numerator = this.denominator;
        this.denominator = flip;

    }

    // Value method for addition 
    public Rational add(Rational test) {

        this.numerator = (numerator * denominator) + (test.getDenominator() * test.getNumerator());
        this.denominator = test.getDenominator() * denominator;

        return new Rational(numerator, denominator);

    }

    // Euclid's GCD
    private static int gcd(int x, int y) {
        if (0 == y) {

            return x;

        } else {

            return gcd(y, x % y);

        }
    }

    // Void method for reduce, using GCD 
    public void reduce() {

        int div;
        div = Rational.gcd(numerator, denominator);

        this.numerator = numerator / div;
        this.denominator = denominator / div;

    }

    // *Bonus* value method for multiplication 
    public Rational multiply(Rational test) {

        int numx = this.numerator * test.getNumerator();
        int denx = this.denominator * test.getDenominator();

        return new Rational(numx, denx);

    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          