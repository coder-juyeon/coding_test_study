import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 2(ABC) 3(DEF) 4(GHI) 5(JKL) 6(MNO) 7(PQRS) 8(TUV) 9(WXYZ)
        String input = br.readLine();
        int result = 0;
        int ANUM = (int)'A';
        int[] number = {3,4,5,6,7,8,9,10};
        int[] count = {3,3,3,3,3,4,3,4};
        List<Integer> phoneNum = new ArrayList<>();

        // [3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10] 배열만들기
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                phoneNum.add(number[i]);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            int inputNum = (int)input.charAt(i) - ANUM; 
            int num = phoneNum.get(inputNum); 
            result = result + num;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
} 
