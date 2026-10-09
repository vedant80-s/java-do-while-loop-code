// This program continuously accepts numbers from the user using a do-while loop.
// It adds only the even numbers to a running sum and displays the updated sum each time.
// The loop exits when the user enters 0.
// Sample Output:
// Enter A Number For Entering The Loop Please Enter A Positive Number : 
// 5
// Enter a number : 4
// Sum is : 4
// Enter a number : 7
// Enter a number : 2
// Sum is : 6
// Enter a number : 0

import java.util.*;
public class  SumEvenNumbers {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            if (n == 0) {
                break;
            }
            System.out.print("Enter a number : ");
            n = Sc.nextInt();
            if (n % 2 == 0) {
                sum = sum + n;
                System.out.println("Sum is : " + sum);
            }
        } while (n > 0 || n < 0);
Sc.close();
    }
}