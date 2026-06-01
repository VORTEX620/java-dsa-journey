
// P: print sum of first n natural number
// This is parameterised way but functional way is better approach

import java.util.Scanner;

public class Sum{

    static void sum(int n,int i,int sum){
        if(i>n){
            System.out.println(sum);
            return;
            
        }else{
            sum += i;
            sum(n,i+1,sum);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1,sum=0;
        sum(n,i,sum);
    } 
}
//Functional way
// P: print sum of first n natural number

// import java.util.Scanner;

// public class Main{

//     static int sum(int n){
//         if(n == 0){
//             return 0;
            
//         }else{
//             return n + sum(n-1);
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.close();
//         System.out.println(sum(n));
//     } 
// }


