import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int objective = 5;
        int userInput;
        boolean condition = true;
        Scanner scan = new Scanner(System.in);
        while(condition) {
            System.out.println("Guess the number: ");
            userInput = scan.nextInt();
            if(userInput < objective) {
                System.out.println("HIGHER");
            }
            else if (userInput > objective) {
                System.out.println("LOWER");
            }
            else if (objective == userInput){
                System.out.println("CONGRATS");
                condition = false;
            }
            else {
                System.out.println("ERORR");
            }
        }
    }
}