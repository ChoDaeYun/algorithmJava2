import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n+1];
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        d[1]=arr[1];
        d[2]=arr[1]+arr[2];
        d[3]=Math.max(arr[1]+arr[3],arr[2]+arr[3]);
        for(int i = 4 ; i <= n; i++){
            // 현재칸 + 한칸전 + 건너띄기 최대값  , 현재칸 + 건너띄기 최대값
            d[i] = Math.max(arr[i]+arr[i-1]+d[i-3],arr[i]+d[i-2]);
        }
        System.out.println(d[n]);
    }
}
