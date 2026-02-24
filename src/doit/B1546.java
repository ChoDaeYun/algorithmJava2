package doit;

import java.util.Scanner;

public class B1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long max = 0;

        for( int i=0 ; i<n ; i ++){
            int temp = sc.nextInt();
            if(temp>max) max = temp;
            sum = sum + temp;
        }

        System.out.println(sum*100.0/max/n);
    }
}
