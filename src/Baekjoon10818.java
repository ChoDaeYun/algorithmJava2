import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int min = 1000000;
        int max = -1000000;
        for(int i = 0 ; i< n; i++){
            int x = Integer.parseInt(st.nextToken());
            min = Math.min(x,min);
            max = Math.max(x,max);
        }
        System.out.println(min+" "+max);
    }
}
