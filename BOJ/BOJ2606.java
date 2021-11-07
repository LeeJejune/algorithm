import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int node[][]; // 그래프 배열
    static boolean check[]; // 방문 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 컴퓨터의 수
        int m = sc.nextInt(); // 컴퓨터 쌍의 수

        node = new int[n+1][n+1];
        check = new boolean[n+1];
        
        for(int i=0;i<m;i++) { // 그래프 구성
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b]=1;
            node[b][a]=1;

        }
        bfs();

    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();

        check[1] =true;
        queue.offer(1);
        int cnt = 0; // 감염 컴퓨터
        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int i=1;i<node.length;i++) { // 1번과 연결된 컴퓨터 찾아 cnt 증가
                if(node[x][i]==1 && !check[i]) {
                    queue.offer(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}