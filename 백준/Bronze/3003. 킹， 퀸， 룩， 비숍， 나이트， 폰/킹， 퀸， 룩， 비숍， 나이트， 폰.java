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

        int[] chess = {1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chess.length; i++) {
            int num = chess[i];
            int val = Integer.parseInt(st.nextToken());
            int result = num - val;
            sb.append(result);
            if (i < chess.length-1) {
                sb.append(" ");
            }
        }
        
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
	}
}