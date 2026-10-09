// This program reverses an integer entered by the user and checks whether it is a palindrome using a do-while loop.
// It handles both positive and negative numbers and compares the reversed value with the original.
// Sample Output:
// Enter an integer: 
// 121
// Reversed number: 121
// 121 is a palindrome.

import java.util.Scanner;

public class ReverseAndCheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int temp = Math.abs(num);
        do {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Reversed number: " + reverse);
        if (original == reverse || original == -reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        sc.close();
    }
}