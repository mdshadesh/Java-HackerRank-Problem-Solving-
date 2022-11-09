import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            in.nextLine();
            int[] widths = getWidthArray(in.nextLine());
            while (in.hasNextLine()) {
                printMin(widths, in.nextInt(), in.nextInt());
            }
        }
    }
    
    public static int[] getWidthArray(String widthLine) {
        String[] stringWidths = widthLine.split(" ");
        int[] widths = new int[stringWidths.length];
        for (int i = 0; i < stringWidths.length; i++) {
            widths[i] = Integer.parseInt(stringWidths[i]);
        }
        return widths;
    }
    
    public static void printMin(int[] width, int l, int u) {
        int maxWidth = Integer.MAX_VALUE;
        for(int i = l; i <= u; i++) {
            if (width[i] < maxWidth)
                maxWidth = width[i];
        }
        System.out.println(maxWidth);
    }
}