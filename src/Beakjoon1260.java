import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 뭐가 문제일까...
public class Beakjoon1260 {

    static int map[][];
    static  boolean[] visit;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static  int n,m,v;
    static StringBuffer str = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1]; // 배열정보
        visit = new boolean[n+1]; // 방문정보 DFS

        for(int i = 0; i < m ; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        Arrays.fill(visit,false); // 방문기록 초기화
        dfs(v);
        str.append("\n");
        Arrays.fill(visit,false); // 방문기록 초기화
        bfs(v);
        System.out.println(str.toString());
    }

    public static void dfs(int c){
        visit[c] = true;
        str.append(c+" ");
        for(int i = 1 ; i<=n ; i ++){
            if(map[c][i] == 1 && visit[i] == false){
                dfs(i);
            }
        }
    }

    public static void bfs(int c){
        visit[c] = true;
        for(int i = 1 ; i<=n ; i ++) {
            if(map[c][i] == 1 && visit[i] == false){
                queue.add(i);
            }
        }
        if(!queue.isEmpty()){
            str.append(c + " ");
            bfs(queue.poll());
        }
    }
}
