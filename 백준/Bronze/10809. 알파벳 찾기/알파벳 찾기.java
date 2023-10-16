import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		int[] arData = new int[26];
		Arrays.fill(arData, -1);
		
		for (int i = 0; i < s.length(); i++) {
			int charNum = s.charAt(i)-'a';
			
			if(arData[charNum] == -1) {
				arData[charNum] = i;
			}
			
		}
		for (int i : arData) {
			bw.write(i + " ");
		}
		bw.close();
	}

}
