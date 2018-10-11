import itcollege.*;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		printNumbers(PrimeNumberCalculator.calcTo(100));
		System.out.println("1回目のループ数：" + PrimeNumberCalculator.count);
		System.out.println();
		printNumbers(PrimeNumberCalculator2.calcTo(100));
		System.out.println("2回目のループ数：" + PrimeNumberCalculator2.count);
		System.out.println();
		printNumbers(PrimeNumberCalculator3.calcTo(100));
		System.out.println("3回目のループ数：" + PrimeNumberCalculator3.count);
		System.out.println();
		printNumbers(PrimeNumberCalculator4.calcTo(100));
		System.out.println("4回目のループ数:" + PrimeNumberCalculator4.count);
		System.out.println();
	}
	public static void printNumbers(List<Integer> numbers) {
		for (int number: numbers) {
			System.out.println(number);
				}
			}
		}
