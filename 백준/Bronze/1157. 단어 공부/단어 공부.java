import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        int[] frequency = new int[26];
        Arrays.fill(frequency, 0);

        int maxCount = 0;
        int maxIndex = -1;
        boolean isDuplicate = false;

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            int cInput = input.charAt(i) - 'A';
            frequency[cInput] += 1;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxIndex = i;
                isDuplicate = false;
            } else if (frequency[i] == maxCount) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            result = "?";
        } else {
            char val = (char)(maxIndex + 'A');
            result = String.valueOf(val);
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
	}
}