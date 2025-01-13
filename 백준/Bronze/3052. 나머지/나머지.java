import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = 42;
        int result = 0;
        List<Integer> restArr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int rest = input % num;
            if (!restArr.contains(rest)) {
                restArr.add(rest);
            }
        }
        
        result = restArr.size();
        
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
	}
}