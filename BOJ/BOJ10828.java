import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {

            String input = br.readLine();

            if(input.contains("push")) {
                String[] str = input.split(" ");
                stack.push(Integer.parseInt(str[1]));
            }else if(input.equals("pop")){
                System.out.println(stack.isEmpty()?-1:stack.pop());
            }else if(input.equals("size")) {
                System.out.println(stack.size());
            }else if(input.equals("empty")) {
                System.out.println(stack.isEmpty()?1:0);
            }else if(input.equals("top")) {
                System.out.println(stack.isEmpty()?-1:stack.peek());
            }
        }

        br.close();
    }

}

