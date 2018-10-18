import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		fruits.put("apple", "林檎");
		fruits.put("りんご", "apple");
		fruits.put("orange", "オレンジ");
		fruits.put("banana", "バナナ");
		fruits.put("melon", "メロン");
		
		System.out.println(fruits.get("りんご"));
	}
}
