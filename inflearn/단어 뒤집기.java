import java.util.*;

class Main {
    //	public String solution(String str, int n) {
//		StringBuilder sb = new StringBuilder(str); //방법 1: StringBuilder함수 사용
//		String answer = sb.reverse().toString();
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 0; i< n; i++) {
//			String str = sc.next();
//			System.out.println(T.solution(str, n));
//		}
//
//    }
    public ArrayList<String> solution(String[] str, int n) {
        ArrayList<String> answer = new ArrayList<String>(); // 방법 2:  ArrayList<String>사용
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i< n; i++) {
            str[i] = sc.next();
        }
        for(String x : T.solution(str, n)) {
            System.out.println(x);
        }

    }
}