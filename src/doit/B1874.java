package doit;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
// Stack
public class B1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        boolean result = true;
        int num = 1;
        StringBuffer bf = new StringBuffer();
        for(int i=0;i<n;i++){
            int su = a[i];
            if(su >= num){
                while (su>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int b = stack.pop();
                if(b > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(bf.toString());
        }
    }
}
