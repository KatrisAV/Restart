package HW;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = scan.nextInt();

        System.out.println("Pairs multiplier number "+num+ ":");

        for (int i= 1; i<= num;i++){
            if (num %i == 0){
                int factor = num/i;
                System.out.println(i+" and "+factor);
            }
        }
    }
}
