package Mandatory;

import java.util.Stack;

public class mandatoryRepils215 {

    public static void main(String[] args) {

        System.out.println(isBalanced("()()"));
    }

    public static boolean isBalanced(String s){

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {

            // if open
            if(s.charAt(i) == '(') {
                st.push('(');
            } else {

                // close
                if(st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty() ? true : false;
    }




        }






























































































        

        











