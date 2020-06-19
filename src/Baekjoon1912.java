import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] d = new int[n];
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            int k = Integer.parseInt(st.nextToken());
            if(i == 0 ){
                max = k;
            }
            sum +=k;
            max = Math.max(max,sum);
            if(sum<0) sum = 0;
        }
        System.out.println(max);
    }
}
