/* 
P: print this pattern ****
                      ****
                      ****    
                      ****
*/

/* S: (1) for the outer loop, count the no of lines that is no of rows
(2) for the inner loop, focus on the columns & connect them somehow to the rows
(3) print the pattern or print("*") */
import java.util.*;
public class Pattern01{
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
/* 
N: when we look at pattern from top to bottom means vertically , lets say from left hand side , there will be a stack of 4 * for 4 times which represents columns and if we look at them from horizontally then , they will be called rows 
// K: Inner loop -> columns
// K: Outer loop -> rows
// IMP: print() stays on same line
// IMP: println() moves to next line
 */