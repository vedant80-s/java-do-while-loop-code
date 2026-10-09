// This program reverses an integer entered by the user and calculates the sum of its digits using a do-while loop.
// It extracts each digit from the number, builds the reversed number, and adds the digits to compute the total sum.
// Sample Output:
// Enter an integer: 
// 123
// Reversed number: 321
// Sum of digits: 6

import java.util.Scanner;

public class ReverseAndSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reverse = 0;
        int sum = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}