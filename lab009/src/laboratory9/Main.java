package laboratory9;
import javax.swing.*;
import java.awt.*;


public class Main {

    private static JTextField numeratorField;
    private static JTextField denominatorField;
    private static JLabel result;
    private static JLabel errorMessage;

    public static boolean correctParsing(JTextField txt){
        try{
            float temp= Float.parseFloat(txt.getText());
            return false;
        }catch(NumberFormatException nfe){
            return true;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Laboratory 9 ");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.gray);

        JLabel text = new JLabel("Calculator");
        text.setBounds(200,80,250,30);
        text.setForeground(Color.black);
        frame.getContentPane().add(text);

        numeratorField = new JTextField();
        numeratorField.setBounds(240,135,150,20);
        frame.getContentPane().add(numeratorField);

        denominatorField = new JTextField();
        denominatorField.setBounds(240,185,150,20);
        frame.getContentPane().add(denominatorField);

        JLabel numeratorText = new JLabel("Dividend");
        numeratorText.setBounds(70,140,120,20);
        numeratorText.setForeground(Color.black);
        frame.getContentPane().add(numeratorText);

        JLabel denominatorText = new JLabel("Divisor");
        denominatorText.setBounds(70,190,120,20);
        denominatorText.setForeground(Color.black);
        frame.getContentPane().add(denominatorText);

        result = new JLabel("Result");
        result.setBounds(70,240,120,20);
        result.setForeground(Color.blue);
        frame.getContentPane().add(result);

        errorMessage = new JLabel();
        errorMessage.setBounds(180,240,480,20);
        errorMessage.setForeground(Color.orange);
        frame.getContentPane().add(errorMessage);

        JButton btnresult = new JButton("Calculate");
        btnresult.setBounds(240,290,100,30);
        btnresult.addActionListener(e -> {
            try {
                errorMessage.setText("");

                float nr1 =  Float.parseFloat(numeratorField.getText());
                float nr2 = Float.parseFloat(denominatorField.getText());

                if (nr2 == 13 || nr2 == -13) {
                    throw new UnluckyException();
                }
                if (nr2 == 0){
                    throw new ArithmeticException();
                }
                float res = nr1 / nr2;
                result.setText(String.format("Result: %.3f", res));


            } catch(NullPointerException npe) {
                errorMessage.setText("Error: Please complete all the fields");

            } catch (NumberFormatException nfe) {
                if(correctParsing(numeratorField)) {
                    errorMessage.setText("Error: Use valid characters for numerator!");
                }
                if(correctParsing(denominatorField)) {
                    errorMessage.setText("Error: Use valid characters for denominator!");
                }
                if(correctParsing(numeratorField) && correctParsing(denominatorField)){
                    errorMessage.setText("Error: Use valid characters for both fields!");
                }


            } catch (ArithmeticException ae) {
                errorMessage.setText("Error:The denominator can't be 0!");

            } catch (UnluckyException ue) {
                errorMessage.setText("Unlucky exception: Don't divide by 13");
            }


        });

        frame.getContentPane().add(btnresult);
        frame.setVisible(true);

    }
}