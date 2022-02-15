package com.bridgelabz.generic;

public class FindFloatMaxUC2 {


		public static void findMaximum(Integer num1, Integer num2, Integer num3) {
			Integer maximumNumber;
			
			if(num1.compareTo(num2)>0 && num1.compareTo(num3)>0) {
				maximumNumber = num1;
			}
			else if(num2.compareTo(num1)>0 && num2.compareTo(num3)>0) {
				maximumNumber = num2;
			}
			else {
				maximumNumber = num3;
			}
			
			System.out.println("The maximum number is: " + maximumNumber);
		}
		
		
		public static void findMaximum(Float num1, Float num2, Float num3) {
			Float maxNumber;
			
			if(num1.compareTo(num2)>0 && num1.compareTo(num3)>0) {
				maxNumber = num1;
			}
			else if(num2.compareTo(num1)>0 && num2.compareTo(num3)>0) {
				maxNumber = num2;
			}
			else {
				maxNumber = num3;
			}
			
			System.out.println("The maximum number is: " + maxNumber);
		}
		
		public static void main(String[] args) {

			System.out.println("Java Generics Find Max Integer and Float");

			Integer num1 = 15, num2 = 20, num3 = 25;
			findMaximum(num1, num2, num3);
			
			Float Float1 = 12f, Float2 = 8f, Float3 = 7f;
			findMaximum(Float1, Float2, Float3);

		}


	}

