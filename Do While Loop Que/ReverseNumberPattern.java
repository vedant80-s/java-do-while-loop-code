// This program prints a reverse number pattern starting from 1 to n in decreasing rows.
// For example, if n = 5, it prints:
// 12345
// 1234
// 123
// 12
// 1

import java.util.*;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input number of rows
        int i = n;
        do {
            int j = 1;
            do {
                System.out.print(j);
                j++;
            } while (j <= i);
            System.out.println();
            i--; 
        } while (i > 0);
Sc.close();
    }
}







