public class isPrime {
    public static void main(String[] args){
        int n =7;
        System.out.println(IsPrime(n));
        primeInRange(n);

    }
    public static boolean IsPrime(int num){
        if(num==2){ // special case
            return true;
        }else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;

        }
    }
    public static void primeInRange(int n){
        for(int i =2;i<=n;i++){
            if(IsPrime(i)){
                System.out.println(i+" ");
            }

        }
    }
}
