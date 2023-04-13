package HW;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose language/Выберите язык/Alegeti limba: (Eng,RU,RO): ");
        String lang = input.nextLine();

        switch (lang){
            case "Eng":
                System.out.println("Hello");
                break;
            case "RU":
                System.out.println("Привет!");
                break;
            case "RO":
                System.out.println("Salut!");
                break;
            default:
                System.out.println("Default language is English");
        }

    }
}
