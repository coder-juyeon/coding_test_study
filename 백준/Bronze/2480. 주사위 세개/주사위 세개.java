import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dice = new int[3];
		int[] eyeCount = new int[7]; 
		int money = 0;
		
		
		for (int i = 0; i < dice.length; i++) {
			dice[i] = sc.nextInt();
		}
		
		Arrays.sort(dice);
		
		for (int i : dice) {
			eyeCount[i]++;
		}
		
		for (int i = 0; i < eyeCount.length; i++) {
			if(eyeCount[i] == 3) {
				money = 10000+i *1000;
				break;
			}
			else if(eyeCount[i] == 2) {
				money = 1000+i *100;
				break;
			}
			else {
				money = dice[2] * 100;
			}
		}
		System.out.println(money);
		
	}
	

}
