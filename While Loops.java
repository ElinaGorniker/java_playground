import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            int  number = scanner.nextInt();
            int fact = 1;
            for (int i=1; i<=number;i++) {
                fact=fact*i;
            }
            System.out.println(fact);
        
            
    }
}