import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baejoon9095 {
    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < size ; i ++){
            int n = Integer.parseInt(br.readLine());
            d = new int[n+2];
            System.out.println(dp(n));
        }
        br.close();
    }
    public static int dp(int n){
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;
        if(d[n] > 0) return d[n];
        return dp(n-1)+dp(n-2)+dp(n-3);
    }
}
