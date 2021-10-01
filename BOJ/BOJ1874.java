import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        int n = Integer.parseInt(br.readLine());
        int start = 1;
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(start <= temp) {
                for (int j = start; j <= temp; j++) {
                    stack.push(start);
                    sb.append("+");
                    start++;
                }
            }
            if(temp != stack.peek()) {
                System.out.println("NO");
                return;
            }
            for(int o = 0; o <stack.size(); o++) {
                if(temp <= stack.peek()) {
                    stack.pop();
                    sb.append("-");
                }
                else {
                    break;
                }
            }
        }
        for(int i = 0; i<sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
        stack.clear();


    }
}