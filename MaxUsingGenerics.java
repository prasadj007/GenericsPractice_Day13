package com.bridgelabz.generic;

public class MaxUsingGenerics <T extends Comparable<T>> {

		T toCompare1, toCompare2, toCompare3;
		
		public MaxUsingGenerics(T tocompare1, T tocompare2, T tocompare3) {
			this.toCompare1 = tocompare1;
			this.toCompare2 = tocompare2;
			this.toCompare3 = tocompare3;
		}

		public void testMaximum() {
			MaxUsingGenerics.findMaximum(this.toCompare1, this.toCompare2, this.toCompare3);
		}
		
		public static <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
			T maximumNumber;
			
			if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
				maximumNumber = firstNumber;
			}
			else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
				maximumNumber = secondNumber;
			}
			else {
				maximumNumber = thirdNumber;
			}
			
			System.out.println("The maximum T is: " + maximumNumber);
		}
		
		
		
		public static void main(String[] args) {

			System.out.println(" Java Generics Find Max Integer,Float and String");

			Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
			Float number1 = 12f, number2 = 8f, number3 = 7f;
			String firstString = "Peach", secondString = "Banana", thirdString = "Apple";
			
			new MaxUsingGenerics<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
			new MaxUsingGenerics<Float>(number1, number2, number3).testMaximum();
			new MaxUsingGenerics<String>(firstString, secondString, thirdString).testMaximum();
			
		}


	}

