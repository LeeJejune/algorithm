import java.util.*;

class Main {
    public String solution(String str, int num) {
        String answer = "";
        for(int i = 0; i < num; i++) {
            String temp = str.substring(0,7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(temp, 2);
            answer += (char)n;
            str = str.substring(7);
        }
        return answer;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str, num));

    }
}