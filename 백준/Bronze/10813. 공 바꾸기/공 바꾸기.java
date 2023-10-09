import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] baskets = new int[n];
		
		for (int i = 0; i < baskets.length; i++) {
			baskets[i] = i+1;
		}
		
		
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int first = baskets[i-1];
			int second = baskets[j-1];
			
			baskets[i-1] = second;
			baskets[j-1] = first;
		}
		
		for (int num : baskets) {
			bw.write(num + " ");
		}
		
		bw.close();

	}

}
