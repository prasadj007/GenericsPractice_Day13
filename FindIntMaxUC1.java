package com.bridgelabz.generic;

public class FindIntMaxUC1 {

		public static void findMax(Integer num1, Integer num2, Integer num3) {
			Integer maxNum;
			
			if(num1.compareTo(num2)>0 && num1.compareTo(num3)>0) {
				maxNum = num1;
			}
			else if(num2.compareTo(num1)>0 && num2.compareTo(num3)>0) {
				maxNum = num2;
			}
			else {
				maxNum = num3;
			}
			
			System.out.println("The Max number is: " + maxNum);
		}
		
		
		public static void main(String[] args) {

			System.out.println("Finding Max out of three Numbers");

			Integer num1 = 98, num2 = 56, num3 = 40;
			findMax(num1, num2, num3);

		}


	}

