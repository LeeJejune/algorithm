import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while( n > 0) {
            Stack<Character> stack = new Stack<Character>();
            String data = br.readLine();

            boolean finish = false;
            for ( int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if(c == '(') {
                    stack.push(c);
                } else {
                    if(stack.empty()) {
                        finish = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.empty() || finish) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            n--;
        }
    }
}

