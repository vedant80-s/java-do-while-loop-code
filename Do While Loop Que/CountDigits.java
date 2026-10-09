// This program counts the number of digits in a given integer using a do-while loop.
// It repeatedly divides the number by 10 until it becomes 0, incrementing a counter each time.
// Sample Output:
// Enter A Number : 
// 12345
// Number of digit in number : 5

import java.util.*;
public class CountDigits {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = Sc.nextInt();
        int i = 0;
        do {
            if (n == 0) {
                break;
            }
            n = n / 10;
            i++;
        } while (n > 0 || n < 0);
        System.out.println("Number of digit in number : " + i);
Sc.close();
    }
}