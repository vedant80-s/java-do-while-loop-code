// This program prints the multiplication table of a number entered by the user using nested do-while loops.
// It continues to prompt the user to enter numbers and display their tables until the user types anything other than "yes".
// Sample Output:
// Enter yes : 
// yes
// Enter a number : 
// 5
// Table of 5
// 5 X 1 = 5
// ...
// 5 X 10 = 50
// If you want to continue please enter yes : 
// yes
// Enter a number : 
// 3
// Table of 3
// ...
// If you want to continue please enter yes : 
// no

import java.util.*;

public class MultiplicationTableLoop {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter yes : ");
        String b = Sc.next().toLowerCase();

        do {
            if (!b.equals("yes")) {
                break;
            }

            System.out.print("Enter a number : ");
            int n = Sc.nextInt();
            int i = 1;

            System.out.println("Table of " + n);
            do {
                System.out.println(n + " X " + i + " = " + (n * i));
                i++;
            } while (i <= 10);

            System.out.print("If you want to continue please enter yes : ");
            b = Sc.next().toLowerCase();

        } while (b.equals("yes"));
Sc.close();
    }
}