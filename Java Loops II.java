import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();            
            int sum = a;
            for (int j = 0; j<n; j++) {                
                int nextEle = (int)Math.pow(2, j)*b;
                sum = sum + nextEle;
                System.out.printf("%s ",sum);                                
            }
            if (i < t-1) {
                System.out.print("\n");
            }
            
        }
        in.close();       

    }
}
