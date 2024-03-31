//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int num = 4321;

        int ans = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10; // num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println("Your reversed input is : "+ ans);
    }
}