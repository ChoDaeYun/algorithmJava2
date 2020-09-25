import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준...런타임에러.. 젠장 ..
public class Beakjoon1260 {

    static ArrayList<Integer>[] map;
    static  boolean[] visit;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static  int n,m,v;
    static StringBuffer str = new StringBuffer();
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new ArrayList[n+1];

        visit = new boolean[n+1]; // 방문정보 DFS

        for(int i = 0; i < m ; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            if(map[a] == null) {
                map[a] = new ArrayList<Integer>();
                list.add(a);
            }
            if(map[b] == null) {
                map[b] = new ArrayList<Integer>();
                list.add(b);
            }
            map[a].add(b);
            map[b].add(a);
        }
        for(int i : list){
            Collections.sort(map[i]);
        }

        Arrays.fill(visit,false); // 방문기록 초기화
        dfs(v);
        System.out.println();
        Arrays.fill(visit,false); // 방문기록 초기화
        bfs(v);
    }

    public static void dfs(int c){
        visit[c] = true;
        System.out.print(c+" ");
        for(int i : map[c] ){
            if(visit[i] == false){
                dfs(i);
            }
        }
    }

    public static void bfs(int c){
        queue.offer(c);
        visit[c] = true;

        while(!queue.isEmpty()){
            int k = queue.poll();
            System.out.print(k+" ");
            for(int i : map[k] ){
                if(visit[i] == false){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
