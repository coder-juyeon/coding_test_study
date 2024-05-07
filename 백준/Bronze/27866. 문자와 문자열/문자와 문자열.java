import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String i = br.readLine();
        int intI = Integer.parseInt(i) - 1;
        char result = s.charAt(intI);
        bw.write(result);
        bw.flush();
        bw.close();
    }
} 
