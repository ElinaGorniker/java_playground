import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int second = 0;
		second = days * 24 * 60 * 60;
		System.out.println(second);
	}
}