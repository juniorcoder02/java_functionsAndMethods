import java.util.*;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("Binomial Coefficient of " + n + " and " + r + " is: " + BinCoeff(n, r));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BinCoeff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);
        int ans = factN / (factR * factNR);
        return ans;
    }
    
}
