// This program prints all numbers divisible by 5 between a given range using a do-while loop.
// The user enters a starting and ending number, and the program displays all multiples of 5 within that range.
// Sample Output:
// Enter First Number : 
// 10
// Enter Last Number : 
// 25
// 10 15 20 25

import java.util.*;
public class  DivisibleByFive {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter First Number : ");
        int i = Sc.nextInt();
        System.out.print("Enter Last Number : ");
        int n = Sc.nextInt();
        do {
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
            i++;
        } while(i <= n);
Sc.close();
    }
}