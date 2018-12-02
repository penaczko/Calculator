import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextFieldKeyReleased {
    Model model;
    JTextField jTextField;


    public TextFieldKeyReleased(Model model , JTextField jTextField) {
        this.model = model;
        this.jTextField = jTextField;
    }

    public void jTextKeyReleased(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ADD) {
            model.firstNumber = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            model.operation = Operation.ADDITION;
        }
        else if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            model.firstNumber = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            model.operation = Operation.SUBTRACTION;
        }
        else if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            model.firstNumber = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            model.operation = Operation.MULTIPLICATION;
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            model.firstNumber = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            model.operation = Operation.DIVISION;
        }
        else if(evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            model.secondNumber = Double.parseDouble(jTextField.getText());

            if(model.operation == Operation.ADDITION) {
                model.result = model.firstNumber + model.secondNumber;
                jTextField.setText(Double.toString(model.result));
            }
            else if(model.operation == Operation.SUBTRACTION) {
                model.result = model.firstNumber - model.secondNumber;
                jTextField.setText(Double.toString(model.result));
            }
            else if(model.operation == Operation.MULTIPLICATION) {
                model.result = model.firstNumber * model.secondNumber;
                jTextField.setText(Double.toString(model.result));
            }
            else if(model.operation == Operation.DIVISION) {
                if(model.secondNumber == 0.0) {
                    jTextField.setText("Error!");
                }
                else {
                    model.result = model.firstNumber / model.secondNumber;
                    jTextField.setText(Double.toString(model.result));
                }
            }
            model.firstNumber = model.result;
            model.secondNumber = 0;
        }
    }
}
