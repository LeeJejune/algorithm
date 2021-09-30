import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i= 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k != 0) {
                stack.push(k);
            } else {
                stack.pop();
            }
        }
        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);
        br.close();
    }

}

