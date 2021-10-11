import java.util.*;

class Main {
    public String solution(int n, int[] Aarr, int[] Barr) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            if(Aarr[i] == Barr[i]) {
                answer += "D";
            } else if(Aarr[i] == 1 && Barr[i]== 3)answer+="A";
            else if(Aarr[i] == 2 && Barr[i]== 1)answer+="A";
            else if(Aarr[i] == 3 && Barr[i]== 2)answer+="A";
            else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Aarr = new int[n];
        int[] Barr = new int[n];

        for(int i = 0; i < n; i++) {
            Aarr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            Barr[i] = sc.nextInt();
        }
        for(char c : T.solution(n, Aarr, Barr).toCharArray()) {
            System.out.println(c);
        }

    }
}