/**
 * 다이나믹 프로그래밍
 * - 재귀함수
 * - memoization
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1463 {
    static  int[] d;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d = new int[n+1];
        System.out.println(dp(n));
        br.close();
    }

    public static int dp(int n) {
        if(n == 1) return 0;
        if(d[n] != 0) return d[n];
        d[n] = dp(n - 1) + 1;
        if(n%3 == 0) d[n] = Math.min(d[n],dp(n/3)+1);
        if(n%2 == 0) d[n] = Math.min(d[n],dp(n/2)+1);
        return d[n];
    }
}
