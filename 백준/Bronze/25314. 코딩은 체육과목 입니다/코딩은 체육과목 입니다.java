import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String strInt = "int";
		String strLong = "long";
		String result = "";
		
		int num = n/4;
		
		for (int i = 0; i < num; i++) {
			result += strLong + " ";
		}
		
		result += strInt;
		System.out.println(result);
	}
	

}
