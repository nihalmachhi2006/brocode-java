import java.util.*;

public class stack {
    public static void main(String[] args){

//        System.out.println("Starting stack");

       Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());
// its return true if stack is empty and false and its not

        stack.push("GTA");
        stack.push("quantra");
        stack.push("temple run");
        stack.push("PUBG");

//        stack.pop();
//        stack.pop();
//        stack.pop();

        String mypeek = stack.peek();
        System.out.println(stack);
        System.out.println(mypeek);
        System.out.println(stack.search("PUBG"));
    }
}


//the main methods off stack is

//push() to add things
//    pop() to remove things
//        peek() to find top most things in stack
//            empty() its return true and false based on condtions
//                search() to find any things in stack its return in numbers like if its has things its return 1 or index of its other wise -1;
//
//key deatils to focuse on the index start with 1 in this the top most elemtns has 1 index