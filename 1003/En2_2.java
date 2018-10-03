public class En2_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i ++){
			String str_number = String.valueOf(i);
			String result = (str_number.contains("3") || i % 3 == 0) ? "THREE" : String.valueOf(i);
			System.out.println(result);
		}
	}
}
