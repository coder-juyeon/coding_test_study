import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] numbers = num.split(" ");
        int[] valNum = new int[2];
        int result = 0;

        for (int i = 0; i < valNum.length; i++) {
            StringBuffer sbNum = new StringBuffer(numbers[i]);
            String rNum = sbNum.reverse().toString();
            int intNum = Integer.parseInt(rNum);
            valNum[i] = intNum;
        }

        result = valNum[0] > valNum[1] ? valNum[0] : valNum[1];
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
} 
