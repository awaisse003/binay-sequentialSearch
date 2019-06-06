# binay-sequentialSearch
"Write an original Java program that explores the costs &amp; benefits of binary search vs sequential search. Write a new class, SearchMachine, that uses an array of n random fractions represented by your Rational class. Each experiment should create n random fractions between 10/1 and 1/10 and then search for the fraction 1/1. Re-run the experiment for these values of n: {10, 100, 1000, 1000, 10000, 100000}.




For each experiment:

Set n. Print the value of n. Create and populate the array of size n.
Perform a sequential search and print the number of comparisons. Use a loop and Rational.compareTo().
Perform a sort and print the number of comparisons. Use Arrays.sort().
Perform a binary search and print the number of comparisons. Use Arrays.binarySearch().
In your code, use Java's native array and the Arrays helper class. Do not use ArrayList for this project.

Reuse the Rational class without changing it. Extend it to implement Comparable. The extended class can be called RationalC.

The easiest way to count comparisons is with a static counter in RationalC. Declare a static int count. Write a static method called initializeCount() that sets it to zero. Write a static method getCount() that returns the current value. from within the Rational's compareTo() method. For sort, the experiment code should set the count to zero before the sort and then print its value after the sort. Same for the other algorithms.

The whole set of experiments should be kicked off in one click by invoking the Machine's public static void main() method."
