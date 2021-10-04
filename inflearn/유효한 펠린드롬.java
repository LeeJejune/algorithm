import java.util.*;

class Main {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equals(temp)) {
            answer = "YES";
        }
        return answer;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}