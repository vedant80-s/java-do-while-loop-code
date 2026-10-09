// This program checks whether a given number is prime using a do-while loop.
// It takes an integer input and tests divisibility from 2 to n-1.
// If the number has no divisors other than 1 and itself, it is prime.
// Sample Output:
// Enter A Number : 
// 7 is Prime Number

import java.util.*;
public class PrimeChecker {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();
        boolean isPrime = false;
        int i = 2;

        do {
            if (n % i == 0) {
                isPrime = false;
                if (n == 2) {
                    isPrime = true;
                }
                break;
            } else {
                isPrime = true;
            }
            i++;
        } while (i <= (n - 1));

        if (isPrime) {
            System.out.println(n + " is Prime Number");
        } else {
            System.out.println(n + " is Not Prime Number");
Sc.close();
        }
    }
}