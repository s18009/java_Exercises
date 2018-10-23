import java.io.*;

public class Main {
	private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) {
		final String fileName = "index.txt";
		if (writeToFile(fileName, readFromFile("Main.java"))) {
			System.out.println(String.format(
						"%sに書き込み成功しました。", fileName));
		} else {
			System.out.println(String.format(
						"%sに書き込み失敗しました。", fileName));
		}
	}

	public static String readFromFile(String fileName) {
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();

		try (
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				) {
				String line;
				while ((line = br.readLine()) != null ) {
					sb.append(line).append(LINE_SEPARATOR);
				}
				return sb.toString();
				
		} catch (FileNotFoundException e) {
			System.out.println(String.format(
						"ファイルが見つかりません: %s", fileName));
			return null;
		} catch (IOException e ) {
			System.err.println(String.format(
						"ファイルの読み込みに失敗しました。: %s", fileName));
			return null;
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

