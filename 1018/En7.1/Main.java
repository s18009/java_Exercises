import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> fruits = new ArrayList<Integer>();
		fruits.add(2);
		fruits.add(3);
		fruits.add(1);
		fruits.add(2);

		for (Integer fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
