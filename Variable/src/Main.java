import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner getStr = new Scanner(System.in);

        System.out.print("Input Number: ");
        int num = scan.nextInt();
        System.out.println("Your number is " + num);

        System.out.print("Input Double: ");
        double doub = scan.nextDouble();
        System.out.println("Your double is " + doub);

        System.out.print("Input String: ");
        String str = getStr.nextLine();
        System.out.println("Your str is " + str);
    }
}
