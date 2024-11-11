//Create a method named sum that can accept a variable number of integer arguments and returns their sum.
public class calculator {
    public static void main (String[] args){
        System.out.println(add(1,24,7,8,89));
        System.out.println(add(1,2,3));

    }
    public static int add (int... args){
        int sum = 0;
        for(int number:args){
            sum+=number;
        }
        return sum;
    }
}