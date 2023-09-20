import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNum = scanner.nextInt();
		String secondNum = scanner.next();
		
		System.out.println(firstNum * (secondNum.charAt(2) - '0'));
		System.out.println(firstNum * (secondNum.charAt(1) - '0'));
		System.out.println(firstNum * (secondNum.charAt(0) - '0'));
		System.out.println(firstNum * Integer.parseInt(secondNum));
		
	}

}
