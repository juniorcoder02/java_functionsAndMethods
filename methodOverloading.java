import java.util.*;
public class methodOverloading {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        greet(name);
        greet();
        sc.close();
    }
    public static void greet (String name){
        System.out.println("Hello "+name);


    }
    public static void greet (){
        System.out.println("Hello anonymous!");


    }
   

    
}
