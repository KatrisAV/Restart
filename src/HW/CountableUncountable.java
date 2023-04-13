package HW;

import java.util.Scanner;

public class CountableUncountable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        if (num  %2 == 0){
            System.out.println("Its countable");
        }else {
            System.out.println("Its uncountable");
        }
    }
}
