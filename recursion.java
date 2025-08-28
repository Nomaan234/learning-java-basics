import java.util.*;

class methods{
    void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }


    void printDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}



public class recursion {


    public static void main(String[] args){

        methods obj=new methods();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        obj.printIncreasing(n);
        obj.printDecreasing(n);


    }
}
