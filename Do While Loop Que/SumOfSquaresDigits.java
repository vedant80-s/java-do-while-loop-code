// This program calculates the sum of squares of each digit of a number entered by the user using a do-while loop.
// It continues to extract digits, square them, and add to the sum until all digits are processed.
// Sample Output:
// Enter A Number : 
// 123
// Sum Is : 14

import java.util.*;
public class SumOfSquaresDigits {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter A Number : ");
        int i = Sc.nextInt();
        int sum = 0 ;
        do{
            if (i == 0){
                break;}
            int c = i % 10 ;
            c = c * c ;
            sum = sum + c ;
            i = i / 10 ;
        }while(i != 0);
        System.out.println ("Sum Is : " + sum );
	Sc.close();
    }
}