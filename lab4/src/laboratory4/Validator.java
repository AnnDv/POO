package laboratory4;

import java.util.*;
import java.lang.String;

public class Validator {
    public static Boolean parenthesesValidator(String expression){

        Stack<Character> stackOfParentheses = new Stack<>();

        for(char current : expression.toCharArray()){
            if(current == '{' || current == '(' || current == '[') {
                stackOfParentheses.push(current);
            }
            if(current == '}' || current == ')' || current == ']') {
                try {
                    stackOfParentheses.pop();
                }
                    catch(Exception e) {
                        System.out.println("there is an extra parenthesis");
                        return false;
                }
            }
        }
        return stackOfParentheses.isEmpty();
    }
}
