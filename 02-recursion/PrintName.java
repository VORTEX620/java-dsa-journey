
// P: print name n times using recursion 

import java.util.Scanner;

public class PrintName{

    static void print_name(int n,int i){
        if(i>n){
            System.out.println("Completed");
        }else{
                System.out.println("Piyush Raj");
                print_name(n,i+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1;
        print_name(n,i);
    } 
}
// Tc: O(n)
// Sc:O(n)   here, stack memory of function are used