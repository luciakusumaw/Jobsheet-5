import java.util.Scanner;

public class mainFactorial13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int num = input.nextInt();

        factorial13 fk = new factorial13();
        System.out.println("The Factorial of " +num+ " Using BF: "+ fk.factorialBF(num));
        System.out.println("The Factorial of " +num+ " Using DC: "+ fk.factorialDC(num));
    input.close();
    }

}
