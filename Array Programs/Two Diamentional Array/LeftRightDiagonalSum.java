/*
1     2    3 
4     5    6 
7     8    9 

OUTPUT : 
lsum = 1 + 5 + 9 = 15 
rsum = 3 + 5 + 7 = 15
*/
package LeftRightDiagonalSum;

import java.util.Scanner;

public class LeftDiagonalSumMatrix {

	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter values in matrix : ");
		int a[][] = new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("=================");
		System.out.println("DISPLAY MATRIX ");
		System.out.println("=================");

		int lsum = 0;
		int rsum = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("  "+a[i][j]);
				
				if(i==j)
				{
					lsum += a[i][j];
				}
				if(j==2-i)
				{
					rsum += a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("LEFT DIAGONAL SUM : "+lsum);
		System.out.println("RIGHT DIAGONAL SUM : "+rsum);
	}
}
