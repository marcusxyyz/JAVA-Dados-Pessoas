package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be typed? ");
		int n = sc.nextInt();
		
		double[] height = new double[n];
		String[] gender = new String[n];
		double sum = 0;
		int women = 0;
		int men = 0;
		
		for (int i=0; i < n; i++) {
			System.out.print("Height of the " + (i+1) +"st person: ");
			height[i] = sc.nextDouble();
			System.out.print((i + 1) + "st person gender: ");
			gender[i] = sc.next().toUpperCase();
			
			if (gender[i].equals("F")) {
				sum += height[i];
				women += 1;
			}
			else {
				men += 1;
			}
		}
		
		double lowerHeight = height[0];
		double higherHeight = height[0];
		
		for(int i=0; i<height.length; i++) {
			if(higherHeight < height[i]) {
				higherHeight = height[i];
			}
			
			if(height[i] < lowerHeight) {
				lowerHeight = height[i];
			}
		}
		
		double avgHeightWomen = sum / women;
		
		System.out.printf("Lower Height = %.2f%n", lowerHeight);
		System.out.printf("Higher Height = %.2f%n", higherHeight);
		System.out.printf("Average Height of women = %.2f%n", avgHeightWomen);
		System.out.println("Number of men = " + men);
		
		sc.close();
	}

}
