import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int v = scanner.nextInt();
		
		for (int num : arr) {
			if(num == v) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	

}
