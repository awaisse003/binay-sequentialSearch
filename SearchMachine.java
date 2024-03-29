package bs_vs_sq;

import static bs_vs_sq.RationalC.getCount;
import static bs_vs_sq.RationalC.initializeCounter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SearchMachine {

    static int n = 10;

    public int sequentialSearch(int[] numeratorDenominator, int key) {
        Rational r = new Rational();
        RationalC rc = new RationalC();

        initializeCounter();
        int i = 0;
        while (i < n || i == key) {
            i++;
            rc.compareTo(numeratorDenominator);
            return i;

        }
        System.out.println("The number of comparisons are: " + getCount());
        sort(numeratorDenominator);
        return 0;
    }

    public static void sort(int[] numeratorDenominator) {
                                      

    }

    public static void main(String[] args) {

        SearchMachine sm = new SearchMachine();

        int maximum = 10;
        int minimum = 1;

        int range = maximum - minimum + 1;

        Rational r;
        Random rn = new Random();

        int aNumerator[] = new int[n + 1];
        int aDenominator[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int numerator = rn.nextInt(range) + minimum;
            int denominator = rn.nextInt(range) + minimum;

            r = new Rational(numerator, denominator);

            aNumerator[n] = r.getNumerator();
            aDenominator[n] = r.getDenominator();

        }

        int numerator_key = 1;
        int denominator_key = 1;

        int result_binary_search_numerator = Arrays.binarySearch(aNumerator, numerator_key);
        int result_binary_search_denomerator = Arrays.binarySearch(aDenominator, denominator_key);

        System.out.println("Result of Denominator is: " + result_binary_search_denomerator);
        if (result_binary_search_numerator == result_binary_search_denomerator) {
            System.out.println("Element is found at index: " + result_binary_search_numerator);
        } else {
            System.out.println("Element is Not found ");
        }

        int result_sequential_search_numerator = sm.sequentialSearch(aNumerator, numerator_key);
        int result_sequential_search_denominator = sm.sequentialSearch(aDenominator, denominator_key);

        System.out.println("Result of Numerator is: " + result_sequential_search_denominator);
        if (result_binary_search_numerator == result_binary_search_denomerator) {
            System.out.println("Element is found at index: " + result_binary_search_numerator);
        } else {
            System.out.println("Element is Not found ");
        }

    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           