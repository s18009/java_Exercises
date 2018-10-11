import java.util.*;

public class Main{
	public static void main(String[] args) {
		PrimeNumberCalculator x = new PrimeNumberCalculator();
		printNumbers(x.calcTo(100));
		System.out.println("1回目のループ数：" + x.count);
		System.out.println();
	}
	public static void printNumbers(List<Integer> numbers) {
		for (int number: numbers) {
			System.out.println(number);
				}
			}
		}
