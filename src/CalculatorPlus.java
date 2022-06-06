import java.io.IOException;
import java.util.Scanner;

public class CalculatorPlus {

    public static void main(String[] args) throws IOException {
        System.out.println("Программа калькулятор+ ПРИВЕТСТВУЕТ ВАС!");
        System.out.println("Предлагаем Вам произвести математические операции над числами. Какую операцию вы хотите " +
                "произвести?");
        System.out.println("Для умножения введите * с клавиатуры, для деления кнопку / . ");
        System.out.println("Для сложение введите + с клавиатуры, для вычитания кнопку - . ");

        int code = System.in.read();
        char q = (char) code;

        Scanner in = new Scanner(System.in);
        System.out.println("Для начала через кнопку Enter введите два значения, для получения результата");
        int a = in.nextInt();
        int b = in.nextInt();

        if (q == '+') {
            int с = sum(a, b);
            print("Результат сложения = " + с);
        } else if (q == '-') {
            int c = diff(a, b);
            print("Результат вычитания = " + c);
        } else if (q == '*') {
            int c = times(a, b);
            print("Результат умножения = " + c);
        } else if (q == '/') {
            if (check(b)) {
                System.out.println("Делить на ноль нельзя");
            } else {
                int c = per(a, b);
                print("Результат деления = " + c);
            }
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int diff(int a, int b) {               //почему поставили int?
        return a - b;
    }

    private static int times(int a, int b) {
        return a * b;
    }

    private static int per(int a, int b) {
        return a / b;
    }

    private static void print(String message) {
        System.out.print(message);
    }

    private static boolean check(int b) {
        if (b == 0) {
            return true;
        }
        return false;
    }
}