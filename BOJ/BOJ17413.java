import java.util.*;
public class exex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();

        boolean tag = false;

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char ch : input.toCharArray()) {
            if(ch == '<') {
                tag = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append("<");
            }else if (ch == '>') {
                tag = false;
                sb.append(">");
            }else if (ch == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }else {
                if(tag == false) stack.push(ch);
                else sb.append(ch);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
        sc.close();
    }
}
