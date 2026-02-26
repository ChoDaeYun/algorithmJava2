package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
//Math.abs 절대값 가져오기
// 자료구조
// 우선순위 queue = PriorityQueue

//1. PriorityQueue 란?
//일반적인 큐는 먼저 들어간 데이터가 먼저 나가는 구조인 FIFO 형식의 자료구조입니다. 반면에 우선순위 큐의 경우 들어가는 순서와는 상관없이 우선순위가 높은 데이터가 먼저 나가는 자료구조입니다. 우선순위 큐의 경우 힙 자료구조를 통해서 구현될 수 있습니다. ( 또한 다른 자료구조를 통해서 구현될 수 있음 )
//        2. PriorityQueue 선언 방법
//// 기본형: 우선순위가 낮은 숫자가 먼저 나옴 (작은 숫자)
//PriorityQueue<Integer> pQ = new PriorityQueue<>();
//
//// 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자)
//PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

public class B11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs){ //절대값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs; //절대값 작은 데이터 우선
        });

        for(int i=0;i<n;i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(request);
            }
        }
    }
}
