import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] words;
        String num = br.readLine();
        int iNum = Integer.parseInt(num);
        words = new String[iNum];

        for (int i = 0; i < iNum; i++) {
            String word = br.readLine();
            words[i] = word;
        }

        for (String string : words) {
            char first = string.charAt(0);
            char last = string.charAt(string.length()-1);
            String result = String.valueOf(first) + String.valueOf(last);
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
} 
