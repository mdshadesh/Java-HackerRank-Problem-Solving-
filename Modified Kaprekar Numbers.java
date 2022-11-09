import java.io.*;
import java.util.*;

public class Solution {   
    
    
    public static void main(String[] args) throws Exception {
              
        Scanner sc = new Scanner(System.in); 
        int p = sc.nextInt();
        int q = sc.nextInt();
        boolean isFirst = true;
        for(int i = p; i <= q; i++)
            if(isKaprekar(i)) {
                System.out.printf((isFirst) ? "%d" : " %d", i);
                isFirst = false;
            }
        System.out.println((isFirst) ? "INVALID RANGE" : "");
    }
    
    public static boolean isKaprekar(long a) {
        int d = String.valueOf(a).length();
        String sqr = String.valueOf(a * a);
        if(sqr.length() == 1) return a == 1;
        int idx = sqr.length() - d;
        long x = Long.valueOf(sqr.substring(0, idx));        
        long y = Long.valueOf(sqr.substring(idx));
        return x + y == a;
    }
}