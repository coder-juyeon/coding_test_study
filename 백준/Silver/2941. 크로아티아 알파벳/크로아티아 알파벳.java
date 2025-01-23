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

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = br.readLine();
        
        for(int i = 0; i < croatia.length; i++) {
            if (input.contains(croatia[i])) {  
                input = input.replaceAll(croatia[i], "1"); 
            }
        }

        bw.write(String.valueOf(input.length()));

        bw.flush();
        bw.close();
        br.close();
	}
}