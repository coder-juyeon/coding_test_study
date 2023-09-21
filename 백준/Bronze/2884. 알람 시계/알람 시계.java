import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int totalMinute = h * 60 + m - 45;
		
		if(totalMinute < 0) {
			totalMinute += 24 * 60;
		}
		
		h = totalMinute / 60;
		m = totalMinute % 60;
	
		
		System.out.println(String.format("%d %d", h, m));
	}
	

}
