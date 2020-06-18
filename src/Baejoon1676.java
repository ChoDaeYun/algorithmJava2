import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baejoon1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int five = 0;
        int tmp = 0;

        for(int i = 1 ; i<=n ; i++){
            tmp = i;
            if(tmp % 5 == 0) {
                five++;
                tmp /= 5;
            }
            if(tmp % 2 == 0) {
                tmp /= 2;
            }
        }
        System.out.println(five);
    }
}
