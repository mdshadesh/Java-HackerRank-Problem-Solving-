import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		Integer hour = Integer.parseInt(sc.nextLine());
		Integer min = Integer.parseInt(sc.nextLine());
		String[] numNames = { "", " one", " two", " three", " four", " five",
				" six", " seven", " eight", " nine", " ten", " eleven",
				" twelve", " thirteen", " fourteen", " fifteen", " sixteen",
				" seventeen", " eighteen", " nineteen" };
		String[] tensNames = { "", " ten", " twenty", " thirty", " fourty",
				" fifty", " sixty", " seventy", " eighty", " ninety" };
		String sepString1 = " minutes past ";
		String sepString2 = " minutes to ";
		String minString = "";
		if (min == 0)
			System.out.println(numNames[hour].trim() + " o' clock");
		else if (min == 15)
			System.out.println("quarter past " + numNames[hour].trim());
		else if (min < 30) {
			if (min == 1)
				sepString1 = " minute past ";
			if (min < 20)
				minString = numNames[min % 20];
			else {
				minString = numNames[min % 10];
				min /= 10;
				minString = tensNames[min % 10] + minString;
			}
			System.out.println(minString.trim() + sepString1
					+ numNames[hour].trim());
		} else if (min == 30)
			System.out.println("half past " + numNames[hour].trim());
		else if (min == 45)
			System.out.println("quarter to "
					+ numNames[hour + 1 < 12 ? hour + 1 : 1].trim());
		else if (min > 30) {
			min = 60 - min;
			if (min == 1)
				sepString2 = " minute to ";
			if (min < 20)
				minString = numNames[min % 20];
			else {
				minString = numNames[min % 10];
				min /= 10;
				minString = tensNames[min % 10] + minString;
			}
			System.out.println(minString.trim() + sepString2
					+ numNames[hour + 1 <= 12 ? hour + 1 : 1].trim());
		}
    }
}