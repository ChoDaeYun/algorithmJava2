import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Xy{
    int x,y;
    Xy(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Beakjoon2178 {

    static Queue<Xy> queue = new LinkedList<Xy>();
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int n,m;
    static Boolean[][] visit;
    static int[][] map;
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new Boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            str = br.readLine();
            for(int j = 0 ; j < m ; j++){
                map[i][j] = str.charAt(j) - '0';
                visit[i][j] = false;
            }
        }
        bfs(0,0);
        System.out.println(map[n-1][m-1]);
    }
    public static void bfs(int x , int y){
        queue.offer(new Xy(x,y));
        visit[x][y] = true;
        while(!queue.isEmpty()){
            Xy d = queue.poll();
            for(int i = 0; i < 4; i ++){
                int nx = d.x + dx[i];
                int ny = d.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }
                if(visit[nx][ny] == false  && map[nx][ny] > 0){
                    queue.offer(new Xy(nx,ny));
                    map[nx][ny] = map[d.x][d.y] + 1;
                    visit[nx][ny] = true;
                }
            }
        }
    }
}
