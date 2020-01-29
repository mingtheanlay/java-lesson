import java.util.Scanner;

public class Main {

    public static void AdditionOperator(int x, int y) {
        System.out.println(x+y);
    }

    public static void SubtractionOperator(int x, int y) {
        System.out.println(x-y);
    }

    public static void MultiplicationOperator(int x, int y) {
        System.out.println(x*y);
    }

    public static void DivisionOperator(int x, int y) {
        System.out.println(x/y);
    }

    public static void main(String[] args) {
        int num1, num2;
        String option = null;

        Scanner scanOption = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);

        System.out.print("Num 1: ");
        num1 = scanNum.nextInt();
        System.out.print("Num 2: ");
        num2 = scanNum.nextInt();
        System.out.print("+ - * /: ");
        option = scanOption.nextLine();
        switch (option) {
            case "+": AdditionOperator(num1,num2); break;
            case "-": SubtractionOperator(num1,num2); break;
            case "*": MultiplicationOperator(num1,num2); break;
            case "/": DivisionOperator(num1,num2); break;
            default: System.out.print("Wrong Option!, Input + - * /: "); option = scanOption.nextLine();
        }
    }
}
