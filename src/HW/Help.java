package HW;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] operators = {" if", "switch", " for", " while", "do-while", "break ", "continue"};

        for (; ; ) {

            System.out.println(" Выберите оператор для получения информации или нажмите 'q' для выхода из программы");

            for (int i = 0; i < operators.length; i++) {
                System.out.println((i + 1) + " . " + operators[i]);
            }
            String input = scan.nextLine();
            if (input.equals("q")) {
                break;
            }
            int choice;
            try {
                choice = Integer.parseInt(input);

            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз.");
                continue;
            }
            if (choice >= 1 && choice <= operators.length) {


                switch (choice) {
                    case 1 -> System.out.println("if(Логическое выражение)\n" +
                            "{\n" +
                            "   //Выполняется, если истинно\n" +
                            "} ");
                    case 2 -> System.out.println("switch (ВыражениеДляВыбора) {\n" +
                            "           case  (Значение1):\n" +
                            "               Код1;\n" +
                            "               break;\n" +
                            "           case (Значение2):\n" +
                            "               Код2;\n" +
                            "               break;\n" +
                            "...\n" +
                            "           case (ЗначениеN):\n" +
                            "               КодN;\n" +
                            "               break;\n" +
                            "           default:\n" +
                            "               КодВыбораПоУмолчанию;\n" +
                            "               break;\n" +
                            "       }");
                    case 3 -> System.out.println("for(<начальная точка>; <условие выхода>; <операторы счетчика>) {\n" +
                            "\t// Тело цикла\n" +
                            "}");
                    case 4 -> System.out.println("while(Логическое выражение) {\n" +
                            "\t// Тело цикла - периодически выполняемые оператор(ы)\n" +
                            "}");
                    case 5 -> System.out.println("do {\n" +
                            "    Тело цикла;\n" +
                            "} while (условие выполения);");
                    case 6 -> System.out.println(" break; ");
                    case 7 -> System.out.println("continue; // форма оператора без метки\n" +
                            "continue labelName; // форма оператора с меткой");
                    default -> System.out.println("Введите корректное значение");
                }
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        System.out.println("Вы вышли из программы.");
    }
}


