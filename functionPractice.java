
public class functionPractice {
    // Q.1 Write a Java method to compute the average of three numbers..

    public static float avgOfThree(int a, int b, int c) {
        float average = (a + b + c) / 3;
        return average;
    }
    // Question 2 : Write a method named isEven that accepts an int argument. The
    // method
    // should return true if the argument is even, or false otherwise. Also write a
    // program to test your
    // method.

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }


    // Ques. 5 Write a Java method to compute the sum of the digits in an integer.
    // (Hint : Approach this question in the following way :
    // a. Take a variable sum = 0
    // b. Find the last digit of the number
    // c. Add it to the sum
    // d. Repeat a & b until the number becomes 0 )

    public static int sumOfDigits(int number){
        int sum =0;
        while(number>0){
            int lastDigit=number%10;
            sum=sum+lastDigit;
            number=number/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        // System.out.println("Average of 3 5 and 6 is : " + avgOfThree(3, 5, 6));
        // System.out.println(isEven(4));
        int number=1234;
        System.out.println("Sum is : "+sumOfDigits(number));

    }

}
