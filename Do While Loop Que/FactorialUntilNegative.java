// This program calculates the factorial of multiple positive numbers entered by the user using nested do-while loops.
// It continues to prompt for numbers and displays their factorial until a negative number is entered.
// Sample Output:
// Enter A Number For Entering The Loop Please Enter A Positive Number : 
// 5
// Enter a number : 4
// Factorial : 24
// Enter a number : 6
// Factorial : 720
// Enter a number : -1

import java.util.*;
public class FactorialUntilNegative {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number For Entering The Loop Please Enter A Positive Number : ");
        int n = Sc.nextInt();
        int i = 1;
        int fact = 1;
        do {
            if (n < 0) {
                break;
            }
            System.out.print("Enter a number : ");
            n = Sc.nextInt();
            fact = 1;
            i = 1;
            do {
                fact = fact * i;
                i++;
            } while (i <= n);
            System.out.println("Factorial : " + fact);
        } while (n > 0);
Sc.close();
    }
}