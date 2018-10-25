import java.io.*;
import java.util.Scanner;

public class MainWrite {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String fileName = "index.txt, ../chap7/index.txt";
		final String content = scanner.nextLine();
		if (writeToFile(fileName, content)) {
			System.out.println(String.format(
						"%sへの書き込みに成功しました。", fileName));
		} else {
			System.out.println(String.format(
						"%sへの書き込みに失敗しました。", fileName));
		}
	}

	private static boolean writeToFile(String fileName, String content) {
		File file = new File(fileName);
		try (
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				) {
			pw.println(content);
			return true;
				} catch (IOException e) {
				return false;
				}
	}
}
