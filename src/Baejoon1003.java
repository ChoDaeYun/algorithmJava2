import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baejoon1003 {
    public static void main(String[] args) throws IOException {
        int d[][] = new int [41][2];
        d[0][0] = 1;
        d[1][1] = 1;
        for(int i=2 ; i<41 ; i++){
            for(int j = 0 ; j < 2 ; j ++){
                d[i][j] = d[i-1][j]+d[i-2][j];
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            int k = Integer.parseInt(br.readLine());
            System.out.println(d[k][0]+" "+d[k][1]);
        }
        br.close();
    }
}