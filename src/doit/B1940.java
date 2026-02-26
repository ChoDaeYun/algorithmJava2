package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {
    //투포인터

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] =  Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count = 0;
        int i = 0;
        int j = n-1;

        while (i<j){
            if(a[i]+a[j] > m ){
                j--;
            }else if(a[i]+a[j] < m){
                i++;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
