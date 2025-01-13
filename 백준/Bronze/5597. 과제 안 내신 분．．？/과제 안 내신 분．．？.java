import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] attendance = new int[31];

        for (int i = 1; i < 29; i++) {
            int input = Integer.parseInt(br.readLine());
            attendance[input] = 1;
        }

        for (int i = 1; i < attendance.length; i++) {
            if (attendance[i] != 1) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
	}
}