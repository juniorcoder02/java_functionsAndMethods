public class powerCalculator {
    public static void main (String[] args){
    int base = 2;
    int exponent =3;
    System.out.println(power(base,exponent));
    }
    public static int power(int base, int expo){
        int result =1;
        for(int i = 0;i<expo;i++){
            result*=base;
        }
        return result;
    }
    
}