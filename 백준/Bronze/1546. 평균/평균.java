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
        StringTokenizer st;
        
        int count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] score = new int[count];
        double newScore = 0;
        double max = 0;

        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(st.nextToken());
            score[i] = temp;
            max = Math.max(temp, max);
        }

        for (int s : score) {
            newScore += s / max * 100;
        }

        // 점수/M*100
        double avg = newScore/count;

        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
    }
} 
