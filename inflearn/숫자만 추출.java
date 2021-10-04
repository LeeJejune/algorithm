import java.util.*;

class Main {
    public int solution(String str) {
//		String answer = "";
        str = str.replaceAll("[^0-9]", ""); // 방법3 : replaceAll함수 사용
//		for(char x : str.toCharArray()) {
//			if(x>=48 && x<=57) {
//				answer = answer*10+(x-48);
//			} // 방법 1: 아스키 값으로 
//			if(Character.isDigit(x)) {
//				answer += x;
//			} 방법 2: isDigit함수 사용
//		}
        return Integer.parseInt(str);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}