import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true) {
            System.out.println("Press ( Q or q ) to start & ( X or x) to quit");
            char op = in.next().trim().charAt(0); // Moved inside the loop

            if (op == 'X' || op == 'x') { // Corrected the logical OR operator
                break;
            }
            else if (op == 'Q' || op == 'q'){ // Corrected the logical OR operator

                System.out.println("Enter the operator");
                op = in.next().trim().charAt(0);

                System.out.println("Enter 2 numbers to perform calculation");

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                System.out.println("Your Numbers are :" + num1 + "," + num2); // Moved inside the loop
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                    if (op == '+'){
                        ans = num1 + num2;
                    }
                    if (op == '-'){
                        ans = num1 - num2;
                    }
                    if (op == '/'){
                        if (num2 !=0 ){
                            ans = num1 / num2;
                        }
                        else{
                            System.out.println("Cannot divide the second number on 0");
                        }
                    }
                    if (op == '%'){
                        ans = num1 % num2;
                    }

                    System.out.println("Result: " + ans); // Moved inside the loop
                }
                else {
                    System.out.println("Invalid operator");
                }
            }
        }
    }
}
