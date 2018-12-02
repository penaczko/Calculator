import javax.swing.*;
import java.awt.event.ActionEvent;

public class ResultButtonController {
    Model model;
    JTextField jTextField;

    public ResultButtonController(Model model , JTextField jTextField) {
        this.model = model;
        this.jTextField = jTextField;
    }

    public void button_resultActionPerformed(java.awt.event.ActionEvent evt) {
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
            System.out.println(model.secondNumber);
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
