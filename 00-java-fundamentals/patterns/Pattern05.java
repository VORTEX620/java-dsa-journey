
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Pattern05{
static void pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j>n-i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        pattern(n);
    }
}
