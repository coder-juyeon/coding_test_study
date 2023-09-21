import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = Arrays.stream(arr).max().getAsInt();		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}
	}
	
}
