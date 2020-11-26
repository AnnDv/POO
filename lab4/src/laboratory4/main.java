package laboratory4;

public class main {
    public static void main(String[] args) {

        String[] expressions = FileReader.readFromFile("src/laboratory4/one_expression.txt");

        //String[] expressions = FileReader.readFromFile("src/laboratory4/three_expressions.txt");

        for(String expression : expressions){
            System.out.println(expression + " : " + Validator.parenthesesValidator(expression));
        }
    }
}
