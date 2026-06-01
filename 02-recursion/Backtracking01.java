
// P: print number from 1 to n using backtracking 

import java.util.Scanner;

public class Backtracking01{

    static void print_name(int n,int i){
        if(i>n){
            return;
            
        }else{
            print_name(n,i+1);
            System.out.println(i);
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

