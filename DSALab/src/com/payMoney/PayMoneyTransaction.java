package com.payMoney;

import java.util.Scanner;

public class PayMoneyTransaction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int Arrsize = sc.nextInt();
		int[] arr = new int[Arrsize];
		
		System.out.println("Enter the values of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets that needs to be achieved");
		int totalTargets = sc.nextInt();
		
		long targetValue,sum = 0;
		int flag = 0;
		for (int j = 0; j < totalTargets; j++) {
			System.out.println("Enter the value of target");
			targetValue = sc.nextLong();
			for(int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				if(targetValue <= sum) {
					flag = 1;
					System.out.println("Target achieved after "+ (i+1) + " transactions");
					break;
				}
				
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
			
		}
		

	}

}
