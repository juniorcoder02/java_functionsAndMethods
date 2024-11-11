import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + num + " is :" + factorial(num));

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            
        }
        return fact;
    }

}
