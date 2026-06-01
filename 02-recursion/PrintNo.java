
// P: print number from n to 1 using recursion 

import java.util.Scanner;

public class PrintNo{

    static void print_name(int n,int i){
        if(i<1){
            System.out.println(i);
            System.out.println("Completed");
        }else{
                System.out.println(i);
                print_name(n,i-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        print_name(n,n);
    } 
}
// Tc: O(n)
// Sc:O(n)   here, stack memory of function are used
